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
package org.obeonetwork.jarvis.webapp.internal;

import org.obeonetwork.jarvis.server.api.AbstractJarvisModule;
import org.obeonetwork.jarvis.webapp.internal.servlets.JarvisWebappResourceServlet;
import org.obeonetwork.jarvis.webapp.internal.servlets.JarvisWebappStaticResourceServlet;

/**
 * The entry point of the Jarvis webapp bundle.
 *
 * @author sbegaudeau
 */
public class JarvisWebappModule extends AbstractJarvisModule {

	/**
	 * {@inheritDoc}
	 *
	 * @see com.google.inject.servlet.ServletModule#configureServlets()
	 */
	@Override
	protected void configureServlets() {
		bind(JarvisWebappStaticResourceServlet.class);
		serve("/static/*").with(JarvisWebappStaticResourceServlet.class); //$NON-NLS-1$

		serve("/favicon.ico").with(new JarvisWebappResourceServlet("/webapp/build/favicon.ico")); //$NON-NLS-1$ //$NON-NLS-2$
		serve("/manifest.json").with(new JarvisWebappResourceServlet("/webapp/build/manifest.json")); //$NON-NLS-1$//$NON-NLS-2$
		serve("/asset-manifest.json").with(new JarvisWebappResourceServlet("/webapp/build/asset-manifest.json")); //$NON-NLS-1$ //$NON-NLS-2$
		serve("/*").with(new JarvisWebappResourceServlet("/webapp/build/index.html")); //$NON-NLS-1$ //$NON-NLS-2$
	}
}
