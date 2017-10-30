/*******************************************************************************
 * Copyright (c) 2017 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/
package org.obeonetwork.jarvis.server.internal.services.workflow;

import com.google.common.io.BaseEncoding;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.URI;
import org.eclipse.sirius.business.api.query.EObjectQuery;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.ext.base.Option;
import org.eclipse.sirius.viewpoint.description.DescriptionPackage;
import org.eclipse.sirius.viewpoint.description.Group;
import org.obeonetwork.jarvis.server.internal.dtos.workflow.PageDto;
import org.obeonetwork.jarvis.server.internal.dtos.workflow.WorkflowDto;
import org.obeonetwork.jarvis.workflow.workflow.PageDescription;
import org.obeonetwork.jarvis.workflow.workflow.WorkflowDescription;

/**
 * The service class used to manipulate workflows.
 *
 * @author sbegaudeau
 */
public class WorkflowServices {
	/**
	 * Returns the workflow of the session with the given sessionId.
	 *
	 * @param sessionId
	 *            The identifier of the session
	 * @return The workflow of the session or an empty optional if none has been found
	 */
	public Optional<WorkflowDto> getWorkflow(String sessionId) {
		String decodedSessionId = new String(BaseEncoding.base64().decode(sessionId));
		URI sessionResourceURI = URI.createURI(decodedSessionId);
		return Optional.ofNullable(SessionManager.INSTANCE.getExistingSession(sessionResourceURI)).flatMap(this::computeWorkflow);
	}

	/**
	 * Computes the workflow of the given session.
	 *
	 * @param session
	 *            The session
	 * @return The workflow computed form the session
	 */
	private Optional<WorkflowDto> computeWorkflow(Session session) {
		Collection<WorkflowDescription> workflowDescriptions = this.getWorkflowDescriptions(session);
		Collection<PageDescription> pageDescriptions = workflowDescriptions.stream()
				.flatMap(workflowDescription -> workflowDescription.getPages().stream()).collect(Collectors.toList());
		if (pageDescriptions.size() > 0) {
			List<PageDto> pageDtos = pageDescriptions.stream().map(this::computePage).collect(Collectors.toList());
			return Optional.of(new WorkflowDto(pageDtos));
		}
		return Optional.empty();
	}

	/**
	 * Returns the workflow descriptions from the given session.
	 *
	 * @param session
	 *            The session
	 * @return The workflow descriptions from the given session
	 */
	private Collection<WorkflowDescription> getWorkflowDescriptions(Session session) {
		// @formatter:off
		return session.getSelectedViewpoints(true).stream()
				.map(viewpoint -> new EObjectQuery(viewpoint).getFirstAncestorOfType(DescriptionPackage.Literals.GROUP))
				.filter(Option::some)
				.map(Option::get)
				.filter(Group.class::isInstance)
				.map(Group.class::cast)
				.flatMap(group -> group.getExtensions().stream())
				.filter(WorkflowDescription.class::isInstance)
				.map(WorkflowDescription.class::cast)
				.collect(Collectors.toList());
		// @formatter:on
	}

	/**
	 * Computes a pageDto for the given pageDescription.
	 *
	 * @param pageDescription
	 *            The page description
	 * @return The pageDto computed
	 */
	private PageDto computePage(PageDescription pageDescription) {
		return new PageDto(pageDescription.getTitleExpression(), null);
	}
}
