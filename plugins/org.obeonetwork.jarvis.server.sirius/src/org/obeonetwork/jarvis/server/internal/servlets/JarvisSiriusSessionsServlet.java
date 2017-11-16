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

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.obeonetwork.jarvis.server.api.IJarvisConstants;
import org.obeonetwork.jarvis.server.sirius.api.services.sessions.IJarvisSiriusSessionService;
import org.obeonetwork.jarvis.server.sirius.api.services.sessions.SessionsDto;

/**
 * The servlet used to manipulate the Sirius sessions.
 *
 * @author sbegaudeau
 */
@Singleton
public class JarvisSiriusSessionsServlet extends HttpServlet {

	/**
	 * The generated serial version UID.
	 */
	private static final long serialVersionUID = -8704209990447547058L;

	/**
	 * The session service.
	 */
	private final IJarvisSiriusSessionService sessionService;

	/**
	 * The constructor.
	 *
	 * @param sessionService
	 *            The session service
	 */
	@Inject
	public JarvisSiriusSessionsServlet(IJarvisSiriusSessionService sessionService) {
		this.sessionService = Objects.requireNonNull(sessionService);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest,
	 *      javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		SessionsDto sessions = this.sessionService.getSessions();
		resp.setContentType(IJarvisConstants.APPLICATION_JSON);
		resp.setCharacterEncoding(IJarvisConstants.UTF_8);
		resp.getWriter().write(new Gson().toJson(sessions));
	}
}
