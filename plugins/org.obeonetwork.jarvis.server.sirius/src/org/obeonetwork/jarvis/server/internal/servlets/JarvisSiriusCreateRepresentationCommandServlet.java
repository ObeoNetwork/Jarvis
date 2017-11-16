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
import java.util.stream.Collectors;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.obeonetwork.jarvis.server.api.IJarvisConstants;
import org.obeonetwork.jarvis.server.sirius.api.services.JarvisSiriusUtils;
import org.obeonetwork.jarvis.server.sirius.api.services.representations.CreateRepresentationDto;
import org.obeonetwork.jarvis.server.sirius.api.services.representations.IJarvisSiriusRepresentationService;
import org.obeonetwork.jarvis.server.sirius.api.services.representations.RepresentationDto;

/**
 * The servlet used to retrieve a workflow.
 *
 * @author sbegaudeau
 */
@Singleton
public class JarvisSiriusCreateRepresentationCommandServlet extends HttpServlet {

	/**
	 * The generated serial version UID.
	 */
	private static final long serialVersionUID = 5980918303012549454L;

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
	public JarvisSiriusCreateRepresentationCommandServlet(IJarvisSiriusRepresentationService representationService) {
		this.representationService = Objects.requireNonNull(representationService);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest,
	 *      javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String lines = req.getReader().lines().collect(Collectors.joining(System.lineSeparator()));
		CreateRepresentationDto createRepresentationDto = new Gson().fromJson(lines, CreateRepresentationDto.class);

		Optional<String> optionalSessionId = new JarvisSiriusPathUtils().getSessionId(req.getPathInfo()).map(new JarvisSiriusUtils()::decode);
		Optional<RepresentationDto> optionalRepresentation = optionalSessionId.flatMap(sessionId -> {
			return this.representationService.createRepresentation(sessionId, createRepresentationDto);
		});
		if (optionalRepresentation.isPresent()) {
			RepresentationDto representationDto = optionalRepresentation.get();
			String jsonRepresentationDto = new Gson().toJson(representationDto);

			resp.setContentType(IJarvisConstants.APPLICATION_JSON);
			resp.setCharacterEncoding(IJarvisConstants.UTF_8);
			resp.getWriter().write(jsonRepresentationDto);
		} else {
			resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
		}
	}
}
