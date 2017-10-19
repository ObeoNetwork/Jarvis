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

import java.util.Dictionary;
import java.util.Hashtable;

import javax.servlet.Servlet;

import org.eclipse.equinox.http.jetty.JettyConfigurator;
import org.eclipse.equinox.http.jetty.JettyConstants;
import org.osgi.framework.BundleContext;
import org.osgi.service.http.whiteboard.HttpWhiteboardConstants;

/**
 * Utility class in charge of starting, managing and stopping the server.
 *
 * @author sbegaudeau
 */
public class JarvisServerManager {
	/**
	 * The name of the whiteboard context.
	 */
	private static final String WHITEBOARD_CONTEXT_NAME = "jarvis"; //$NON-NLS-1$

	/**
	 * The path of the whiteboard context.
	 */
	private static final String WHITEBOARD_CONTEXT_PATH = "/"; //$NON-NLS-1$

	/**
	 * The name of the server.
	 */
	private static final String SERVER_NAME = "jarvis"; //$NON-NLS-1$

	/**
	 * The default port of the server.
	 */
	private static final int PORT = 8080;

	/**
	 * The default host of the server.
	 */
	private static final String HOST = "0.0.0.0"; //$NON-NLS-1$

	/**
	 * The default context path of the server.
	 */
	private static final String CONTEXT_PATH = "/"; //$NON-NLS-1$

	/**
	 * Starts the Jarvis server.
	 *
	 * @param context
	 *            The bundle context
	 */
	public void start(BundleContext context) {
		this.startJettyServer();
		this.registerServlets(context);
	}

	/**
	 * Starts an instance of Jetty.
	 */
	private void startJettyServer() {
		Dictionary<String, Object> properties = new Hashtable<String, Object>();
		properties.put(JettyConstants.HTTP_ENABLED, Boolean.TRUE);
		properties.put(JettyConstants.HTTP_PORT, Integer.valueOf(PORT));
		properties.put(JettyConstants.HTTP_HOST, HOST);
		properties.put(JettyConstants.CONTEXT_PATH, CONTEXT_PATH);

		try {
			JettyConfigurator.startServer(SERVER_NAME, properties);
			// CHECKSTYLE:OFF
		} catch (Exception e) {
			// CHECKSTYLE:ON
			throw new IllegalStateException("The server could not be started", e); //$NON-NLS-1$
		}
	}

	/**
	 * Registers the default servlets.
	 *
	 * @param context
	 *            The bundle context
	 */
	private void registerServlets(BundleContext context) {
		Dictionary<String, Object> servletContextHelperProperties = new Hashtable<>();
		servletContextHelperProperties.put(HttpWhiteboardConstants.HTTP_WHITEBOARD_CONTEXT_NAME, WHITEBOARD_CONTEXT_NAME);
		servletContextHelperProperties.put(HttpWhiteboardConstants.HTTP_WHITEBOARD_CONTEXT_PATH, WHITEBOARD_CONTEXT_PATH);
		context.registerService(Object.class, new JarvisServletContextHelper(), servletContextHelperProperties);

		JarvisAPIServlet jarvisAPIServlet = new JarvisAPIServlet();
		Dictionary<String, Object> jarvisAPIServletProperties = new Hashtable<>();
		jarvisAPIServletProperties.put(HttpWhiteboardConstants.HTTP_WHITEBOARD_SERVLET_PATTERN, JarvisAPIServlet.ALIAS);
		context.registerService(Servlet.class, jarvisAPIServlet, jarvisAPIServletProperties);

		// TODO Register the static resources servlet populated with all the JarvisServerPlugins
		// TODO Collect the JarvisServerPlugin instances with an extension point
		// context.registerService(Servlet.class, jarvisResourcesServlet, jarvisResourcesServletProperties);
	}

	/**
	 * Stops the Jetty server.
	 */
	public void stop() {
		try {
			JettyConfigurator.stopServer(SERVER_NAME);
			// CHECKSTYLE:OFF
		} catch (Exception e) {
			// CHECKSTYLE:ON
			throw new IllegalStateException("The server could not be stopped", e); //$NON-NLS-1$
		}
	}
}
