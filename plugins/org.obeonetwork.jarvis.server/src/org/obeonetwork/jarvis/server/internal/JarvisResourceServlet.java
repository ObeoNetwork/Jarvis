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
package org.obeonetwork.jarvis.server.internal;

import com.google.common.io.ByteStreams;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.Optional;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.obeonetwork.jarvis.server.api.IJarvisServerStaticResource;
import org.obeonetwork.jarvis.server.api.IJarvisServerStaticResourceProvider;

/**
 * The HTTP servlet used to serve static resources.
 *
 * @author sbegaudeau
 */
public class JarvisResourceServlet extends HttpServlet {

	/**
	 * The path of the servlet.
	 */
	public static final String ALIAS = "/*"; //$NON-NLS-1$

	/**
	 * The generated serial version UID.
	 */
	private static final long serialVersionUID = 8744804601658933904L;

	/**
	 * The static resource providers.
	 */
	private Collection<IJarvisServerStaticResourceProvider> staticResourceProviders;

	/**
	 * The constructor.
	 *
	 * @param staticResourceProviders
	 *            The static resource providers
	 */
	public JarvisResourceServlet(Collection<IJarvisServerStaticResourceProvider> staticResourceProviders) {
		this.staticResourceProviders = staticResourceProviders;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest,
	 *      javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String path = req.getPathInfo();

		// @formatter:off
		Optional<IJarvisServerStaticResource> optionalStaticResource = this.staticResourceProviders.stream()
				.map(plugin -> plugin.getResource(path))
				.filter(Optional::isPresent)
				.map(Optional::get)
				.findFirst();
		// @formatter:on

		if (optionalStaticResource.isPresent()) {
			IJarvisServerStaticResource staticResource = optionalStaticResource.get();
			try (InputStream inputStream = staticResource.openInputStream();) {
				ByteStreams.copy(inputStream, resp.getOutputStream()); // TODO Remove the dependency to Guava!!!
			}
			resp.setContentType(staticResource.getContentType());
		} else {
			resp.getWriter().write("Not found"); //$NON-NLS-1$
		}
	}
}
