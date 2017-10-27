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

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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

		if (segments.size() > 3 && SESSIONS.equals(segments.get(1)) && WORKFLOW.equals(segments.get(3))) {
			String sessionId = segments.get(2);
			this.getWorkflow(req, resp, sessionId);
		} else {
			resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			resp.getWriter().write("400 Bad Request"); //$NON-NLS-1$
		}
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
		// TODO Use the Sirius session
		String data = "{\"sections\": [{\"title\": \"Capture\"}, {\"title\": \"Analyze\"}, {\"title\": \"Analyze\"}, {\"title\": \"Analyze\"}]}"; //$NON-NLS-1$
		resp.setContentType("application/json"); //$NON-NLS-1$
		resp.setCharacterEncoding("UTF-8"); //$NON-NLS-1$
		resp.getWriter().write(data);
	}
}
