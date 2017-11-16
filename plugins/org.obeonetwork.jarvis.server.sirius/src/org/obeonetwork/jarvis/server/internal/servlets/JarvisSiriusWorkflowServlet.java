/*******************************************************************************
 * Copyright (c) 2017 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/
package org.obeonetwork.jarvis.server.internal.servlets;

import com.google.gson.Gson;

import java.io.IOException;
import java.util.Objects;
import java.util.Optional;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.obeonetwork.jarvis.server.api.IJarvisConstants;
import org.obeonetwork.jarvis.server.sirius.api.services.JarvisSiriusUtils;
import org.obeonetwork.jarvis.server.sirius.api.services.workflow.IJarvisSiriusWorkflowService;
import org.obeonetwork.jarvis.server.sirius.api.services.workflow.WorkflowDto;

/**
 * The servlet used to retrieve a workflow.
 *
 * @author sbegaudeau
 */
@Singleton
public class JarvisSiriusWorkflowServlet extends HttpServlet {

	/**
	 * The generated serial version UID.
	 */
	private static final long serialVersionUID = 5980918303012549454L;

	/**
	 * The workflow service.
	 */
	private final IJarvisSiriusWorkflowService workflowService;

	/**
	 * The constructor.
	 *
	 * @param workflowService
	 *            The workflow service
	 */
	@Inject
	public JarvisSiriusWorkflowServlet(IJarvisSiriusWorkflowService workflowService) {
		this.workflowService = Objects.requireNonNull(workflowService);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest,
	 *      javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Optional<String> optionalSessionId = new JarvisSiriusPathUtils().getSessionId(req.getPathInfo());
		Optional<WorkflowDto> optionalWorkflow = optionalSessionId.map(new JarvisSiriusUtils()::decode).flatMap(this.workflowService::getWorkflow);
		if (optionalWorkflow.isPresent()) {
			WorkflowDto workflowDto = optionalWorkflow.get();
			String jsonWorkflowDto = new Gson().toJson(workflowDto);

			resp.setContentType(IJarvisConstants.APPLICATION_JSON);
			resp.setCharacterEncoding(IJarvisConstants.UTF_8);
			resp.getWriter().write(jsonWorkflowDto);
		} else {
			resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
		}
	}
}
