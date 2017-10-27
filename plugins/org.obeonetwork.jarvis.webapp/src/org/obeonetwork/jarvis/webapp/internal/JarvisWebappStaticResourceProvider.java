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
package org.obeonetwork.jarvis.webapp.internal;

import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.obeonetwork.jarvis.server.api.IJarvisServerStaticResource;
import org.obeonetwork.jarvis.server.api.IJarvisServerStaticResourceProvider;

/**
 * Contribution to the Jarvis Server.
 *
 * @author sbegaudeau
 */
public class JarvisWebappStaticResourceProvider implements IJarvisServerStaticResourceProvider {

	/**
	 * The segment for the sessions.
	 */
	private static final String SESSIONS = "sessions"; //$NON-NLS-1$

	/**
	 * The segment for the pages of the workflow.
	 */
	private static final String PAGES = "pages"; //$NON-NLS-1$

	/**
	 * {@inheritDoc}
	 *
	 * @see org.obeonetwork.jarvis.server.api.IJarvisServerStaticResourceProvider#getResource(java.lang.String)
	 */
	@Override
	public Optional<IJarvisServerStaticResource> getResource(String path) {
		List<String> segments = Arrays.asList(path.split("/")); //$NON-NLS-1$

		Optional<URL> entry = Optional.empty();
		if (this.isWorkflow(segments)) {
			URL url = JarvisWebappPlugin.getPlugin().getBundle().getEntry("/webapp/workflow.html"); //$NON-NLS-1$
			entry = Optional.ofNullable(url);
		} else if (this.isPage(segments)) {
			URL url = JarvisWebappPlugin.getPlugin().getBundle().getEntry("/webapp/page.html"); //$NON-NLS-1$
			entry = Optional.ofNullable(url);
		} else {
			URL url = JarvisWebappPlugin.getPlugin().getBundle().getEntry("/webapp/" + path); //$NON-NLS-1$
			entry = Optional.ofNullable(url);
		}
		return entry.map(url -> new JarvisStaticResource(url));
	}

	/**
	 * Indicates if the resource expected is the HTML document for the workflow.
	 *
	 * @param segments
	 *            The segments of the path of the request
	 * @return <code>true</code> if it matches the path of the workflow, <code>false</code> otherwise
	 */
	private boolean isWorkflow(List<String> segments) {
		return segments.size() == 3 && SESSIONS.equals(segments.get(1));
	}

	/**
	 * Indicates if the resource expected is the HTML document for a page of the workflow.
	 *
	 * @param segments
	 *            The segments of the path of the request
	 * @return <code>true</code> if it matches the path of a page of the workflow, <code>false</code> otherwise
	 */
	private boolean isPage(List<String> segments) {
		return segments.size() == 5 && SESSIONS.equalsIgnoreCase(segments.get(1)) && PAGES.equalsIgnoreCase(segments.get(3));
	}

}
