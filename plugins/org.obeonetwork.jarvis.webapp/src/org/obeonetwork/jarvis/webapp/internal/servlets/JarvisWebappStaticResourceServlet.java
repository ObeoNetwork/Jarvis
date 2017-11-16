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
package org.obeonetwork.jarvis.webapp.internal.servlets;

import com.google.common.io.ByteStreams;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Optional;

import javax.inject.Singleton;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.obeonetwork.jarvis.webapp.internal.JarvisWebappPlugin;

/**
 * The servlet used to retrieve dynamically some static resources.
 *
 * @author sbegaudeau
 */
@Singleton
public class JarvisWebappStaticResourceServlet extends HttpServlet {

	/**
	 * The generated serial version UID.
	 */
	private static final long serialVersionUID = -7943207071381360791L;

	/**
	 * {@inheritDoc}
	 *
	 * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest,
	 *      javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String path = "/webapp/build/static" + req.getPathInfo(); //$NON-NLS-1$
		Optional<URL> optionalEntry = Optional.ofNullable(JarvisWebappPlugin.getPlugin().getBundle().getEntry(path));
		if (optionalEntry.isPresent()) {
			URL entry = optionalEntry.get();
			try (InputStream inputStream = entry.openStream();) {
				ByteStreams.copy(inputStream, resp.getOutputStream());
			}
			resp.setContentType(new JarvisContentTypeUtils().getContentType(entry.toString()));
		}
	}
}
