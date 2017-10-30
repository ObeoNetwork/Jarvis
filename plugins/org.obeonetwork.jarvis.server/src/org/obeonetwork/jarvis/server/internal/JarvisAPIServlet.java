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

import com.google.gson.Gson;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.obeonetwork.jarvis.server.internal.dtos.session.SessionsDto;
import org.obeonetwork.jarvis.server.internal.dtos.workflow.WorkflowDto;
import org.obeonetwork.jarvis.server.internal.services.session.SessionServices;
import org.obeonetwork.jarvis.server.internal.services.workflow.WorkflowServices;

/**
 * The servlet of the HTTP API.
 *
 * @author sbegaudeau
 */
public class JarvisAPIServlet extends HttpServlet {

	/**
	 * The path of the servlet.
	 */
	public static final String ALIAS = "/api/*"; //$NON-NLS-1$

	/**
	 * The generated serial version UID.
	 */
	private static final long serialVersionUID = -4962587827140237763L;

	/**
	 * The segment used for the sessions.
	 */
	private static final String SESSIONS = "sessions"; //$NON-NLS-1$

	/**
	 * The segment used for the workflow.
	 */
	private static final String WORKFLOW = "workflow"; //$NON-NLS-1$

	/**
	 * {@inheritDoc}
	 *
	 * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest,
	 *      javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String path = req.getPathInfo();
		List<String> segments = Arrays.asList(path.split("/")); //$NON-NLS-1$

		if (this.isSessions(segments)) {
			this.getSessions(req, resp);
		} else if (this.isWorkflow(segments)) {
			String sessionId = segments.get(2);
			this.getWorkflow(req, resp, sessionId);
		} else {
			resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			resp.getWriter().write("400 Bad Request"); //$NON-NLS-1$
		}
	}

	/**
	 * Indicates if the segments of the path matches the sessions API.
	 *
	 * @param segments
	 *            The segments of the path of the request
	 * @return <code>true</code> if the segments matches the sessions API, <code>false</code> otherwise
	 */
	private boolean isSessions(List<String> segments) {
		return segments.size() == 2 && SESSIONS.equals(segments.get(1));
	}

	/**
	 * Returns the sessions.
	 *
	 * @param req
	 *            The request
	 * @param resp
	 *            The response
	 * @throws IOException
	 *             In case of error
	 */
	private void getSessions(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		SessionsDto sessionsDto = new SessionServices().getSessions();
		String jsonSessionsDto = new Gson().toJson(sessionsDto);

		resp.setContentType("application/json"); //$NON-NLS-1$
		resp.setCharacterEncoding("UTF-8"); //$NON-NLS-1$
		resp.getWriter().write(jsonSessionsDto);
	}

	/**
	 * Indicates if the segments of the path matches the workflow API.
	 *
	 * @param segments
	 *            The segments of the path of the request
	 * @return <code>true</code> if the segments matches the workflow API path, <code>false</code> otherwise
	 */
	private boolean isWorkflow(List<String> segments) {
		return segments.size() > 3 && SESSIONS.equals(segments.get(1)) && WORKFLOW.equals(segments.get(3));
	}

	/**
	 * Returns the workflow for the session with the given sessionId.
	 *
	 * @param req
	 *            The request
	 * @param resp
	 *            The response
	 * @param sessionId
	 *            The identifier of the session
	 * @throws IOException
	 *             In case of error
	 */
	private void getWorkflow(HttpServletRequest req, HttpServletResponse resp, String sessionId) throws IOException {
		Optional<WorkflowDto> optionalWorkflow = new WorkflowServices().getWorkflow(sessionId);
		if (optionalWorkflow.isPresent()) {
			WorkflowDto workflowDto = optionalWorkflow.get();
			String jsonWorkflowDto = new Gson().toJson(workflowDto);

			resp.setContentType("application/json"); //$NON-NLS-1$
			resp.setCharacterEncoding("UTF-8"); //$NON-NLS-1$
			resp.getWriter().write(jsonWorkflowDto);
		} else {
			resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
		}
	}
}
