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
import org.obeonetwork.jarvis.server.sirius.api.services.representations.IJarvisSiriusRepresentationService;
import org.obeonetwork.jarvis.server.sirius.api.services.representations.RepresentationsDto;

/**
 * The servlet used to manipulate the representations.
 *
 * @author sbegaudeau
 */
@Singleton
public class JarvisSiriusRepresentationsServlet extends HttpServlet {

	/**
	 * The generated serial version UID.
	 */
	private static final long serialVersionUID = 1746338727936063829L;

	/**
	 * The representation service.
	 */
	private final IJarvisSiriusRepresentationService representationService;

	/**
	 * The constructor.
	 *
	 * @param representationService
	 *            The representation service
	 */
	@Inject
	public JarvisSiriusRepresentationsServlet(IJarvisSiriusRepresentationService representationService) {
		this.representationService = Objects.requireNonNull(representationService);
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
		if (optionalSessionId.isPresent()) {
			String sessionId = optionalSessionId.get();
			RepresentationsDto representationsDto = this.representationService.getRepresentations(sessionId);
			String jsonRepresentationsDto = new Gson().toJson(representationsDto);

			resp.setContentType(IJarvisConstants.APPLICATION_JSON);
			resp.setCharacterEncoding(IJarvisConstants.UTF_8);
			resp.getWriter().write(jsonRepresentationsDto);
		}
	}

}
