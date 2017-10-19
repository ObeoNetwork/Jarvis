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

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collection;
import java.util.Optional;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.obeonetwork.jarvis.server.api.IJarvisServerPlugin;

/**
 * The HTTP servlet used to serve static resources.
 *
 * @author sbegaudeau
 */
public class JarvisResourcesServlet extends HttpServlet {

	/**
	 * The generated serial version UID.
	 */
	private static final long serialVersionUID = 8744804601658933904L;

	/**
	 * The plugins.
	 */
	private Collection<IJarvisServerPlugin> plugins;

	/**
	 * The constructor.
	 *
	 * @param plugins
	 *            The plugins
	 */
	public JarvisResourcesServlet(Collection<IJarvisServerPlugin> plugins) {
		this.plugins = plugins;
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
		Optional<InputStream> optionalInputStream = this.plugins.stream()
				.map(plugin -> plugin.getResource(path))
				.filter(Optional::isPresent)
				.map(Optional::get)
				.findFirst();
		// @formatter:on

		if (optionalInputStream.isPresent()) {
			InputStream inputStream = optionalInputStream.get();
			try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));) {
				String input = ""; //$NON-NLS-1$
				while ((input = bufferedReader.readLine()) != null) {
					BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(resp.getOutputStream()));
					bufferedWriter.write(input);
					bufferedWriter.newLine();
				}
			}
		} else {
			resp.getWriter().write("Not found"); //$NON-NLS-1$
		}
	}
}
