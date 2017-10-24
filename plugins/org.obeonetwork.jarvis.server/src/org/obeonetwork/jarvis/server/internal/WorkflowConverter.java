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
package org.obeonetwork.jarvis.server.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import org.eclipse.sirius.business.api.query.EObjectQuery;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.viewpoint.description.DescriptionPackage;
import org.eclipse.sirius.viewpoint.description.Group;
import org.obeonetwork.jarvis.workflow.Activity;
import org.obeonetwork.jarvis.workflow.Page;
import org.obeonetwork.jarvis.workflow.Section;
import org.obeonetwork.jarvis.workflow.Workflow;
import org.obeonetwork.jarvis.workflow.WorkflowFactory;
import org.obeonetwork.jarvis.workflow.description.ActivityDescription;
import org.obeonetwork.jarvis.workflow.description.PageDescription;
import org.obeonetwork.jarvis.workflow.description.SectionDescription;
import org.obeonetwork.jarvis.workflow.description.WorkflowDescription;

// CHECKSTYLE:OFF
public class WorkflowConverter {
	private final Session session;

	public WorkflowConverter(Session session) {
		this.session = session;
	}

	public Workflow computeEffectiveWorkflow() {
		return computeEffectiveWorkflow(getApplicableWorkflowDescriptions());
	}

	private Collection<WorkflowDescription> getApplicableWorkflowDescriptions() {
		// @formatter:off
        return session.getSelectedViewpoints(true).stream()
                .map(viewpoint -> new EObjectQuery(viewpoint).getFirstAncestorOfType(DescriptionPackage.Literals.GROUP))
                .filter(org.eclipse.sirius.ext.base.Option::some)
                .map(org.eclipse.sirius.ext.base.Option::get)
                .filter(Group.class::isInstance)
                .map(Group.class::cast)
                .flatMap(group -> group.getExtensions().stream())
                .filter(WorkflowDescription.class::isInstance)
                .map(WorkflowDescription.class::cast)
                .collect(Collectors.toSet());
        // @formatter:on
	}

	private Workflow computeEffectiveWorkflow(Collection<WorkflowDescription> workflows) {
		Workflow result = WorkflowFactory.eINSTANCE.createWorkflow();
		for (WorkflowDescription wkfDesc : workflows) {
			result.getOwnedPages().addAll(convertPageDescriptions(wkfDesc.getPages()));
		}
		return result;
	}

	private Collection<Page> convertPageDescriptions(Collection<PageDescription> descriptions) {
		Collection<Page> result = new ArrayList<>();
		for (PageDescription desc : descriptions) {
			Page page = WorkflowFactory.eINSTANCE.createPage();
			page.setTitle(desc.getTitleExpression());
			page.setDescriptionText(desc.getDescriptionExpression());
			page.setImagePath(desc.getImagePath());
			page.setDescription(desc);
			page.getOwnedSections().addAll(convertSectionDescriptions(desc.getSections()));
			result.add(page);
		}
		return result;
	}

	private Collection<? extends Section> convertSectionDescriptions(Collection<SectionDescription> sections) {
		Collection<Section> result = new ArrayList<>();
		for (SectionDescription desc : sections) {
			Section section = WorkflowFactory.eINSTANCE.createSection();
			section.setTitle(desc.getTitleExpression());
			section.setDescriptionText(desc.getDescriptionExpression());
			section.setIconPath(desc.getIconPath());
			section.setDescription(desc);
			section.getOwnedActivities().addAll(convertActivityDescriptions(desc.getActivities()));
			result.add(section);
		}
		return result;
	}

	private Collection<Activity> convertActivityDescriptions(Collection<ActivityDescription> activities) {
		Collection<Activity> result = new ArrayList<>();
		for (ActivityDescription desc : activities) {
			Activity activity = WorkflowFactory.eINSTANCE.createActivity();
			activity.setLabel(desc.getLabelExpression());
			activity.setIconPath(desc.getIconPath());
			activity.setDescription(desc);
			result.add(activity);
		}
		return result;
	}
}
