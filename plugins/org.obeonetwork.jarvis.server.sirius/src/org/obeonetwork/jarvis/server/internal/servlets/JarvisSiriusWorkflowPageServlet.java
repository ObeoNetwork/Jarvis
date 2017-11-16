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
import org.obeonetwork.jarvis.server.sirius.api.services.workflow.PageDto;

/**
 * The servlet used to retrieve a workflow page.
 *
 * @author sbegaudeau
 */
@Singleton
public class JarvisSiriusWorkflowPageServlet extends HttpServlet {

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
	public JarvisSiriusWorkflowPageServlet(IJarvisSiriusWorkflowService workflowService) {
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
		Optional<String> optionalSessionId = new JarvisSiriusPathUtils().getSessionId(req.getPathInfo()).map(new JarvisSiriusUtils()::decode);
		Optional<String> optionalPageId = new JarvisSiriusPathUtils().getPageId(req.getPathInfo());

		Optional<PageDto> optionalPage = Optional.empty();
		if (optionalSessionId.isPresent() && optionalPageId.isPresent()) {
			optionalPage = this.workflowService.getPage(optionalSessionId.get(), optionalPageId.get());
		}
		if (optionalPage.isPresent()) {
			PageDto pageDto = optionalPage.get();
			String jsonPageDto = new Gson().toJson(pageDto);

			resp.setContentType(IJarvisConstants.APPLICATION_JSON);
			resp.setCharacterEncoding(IJarvisConstants.UTF_8);
			resp.getWriter().write(jsonPageDto);
		} else {
			resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
		}
	}
}
