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
	 * The segment for the favicon.
	 */
	private static final String FAVICON = "favicon.ico"; //$NON-NLS-1$

	/**
	 * The segment for the manifest.json.
	 */
	private static final String MANIFEST_JSON = "manifest.json"; //$NON-NLS-1$

	/**
	 * The segment for the asset-manifest.json.
	 */
	private static final String ASSET_MANIFEST_JSON = "asset-manifest.json"; //$NON-NLS-1$

	/**
	 * The segment for the static assets.
	 */
	private static final String STATIC = "static"; //$NON-NLS-1$

	/**
	 * The segment for the API.
	 */
	private static final String API = "api"; //$NON-NLS-1$

	/**
	 * {@inheritDoc}
	 *
	 * @see org.obeonetwork.jarvis.server.api.IJarvisServerStaticResourceProvider#getResource(java.lang.String)
	 */
	@Override
	public Optional<IJarvisServerStaticResource> getResource(String path) {
		List<String> segments = Arrays.asList(path.split("/")); //$NON-NLS-1$

		Optional<URL> entry = Optional.empty();
		if (segments.size() > 2 && FAVICON.equals(segments.get(1))) {
			URL url = JarvisWebappPlugin.getPlugin().getBundle().getEntry("/webapp/build/favicon.ico"); //$NON-NLS-1$
			entry = Optional.ofNullable(url);
		} else if (segments.size() > 2 && MANIFEST_JSON.equals(segments.get(1))) {
			URL url = JarvisWebappPlugin.getPlugin().getBundle().getEntry("/webapp/build/manifest.json"); //$NON-NLS-1$
			entry = Optional.ofNullable(url);
		} else if (segments.size() > 2 && ASSET_MANIFEST_JSON.equals(segments.get(1))) {
			URL url = JarvisWebappPlugin.getPlugin().getBundle().getEntry("/webapp/build/asset-manifest.json"); //$NON-NLS-1$
			entry = Optional.ofNullable(url);
		} else if (segments.size() > 2 && STATIC.equals(segments.get(1))) {
			URL url = JarvisWebappPlugin.getPlugin().getBundle().getEntry("/webapp/build" + path); //$NON-NLS-1$
			entry = Optional.ofNullable(url);
		} else if (!(segments.size() > 2 && API.equals(segments.get(1)))) {
			URL url = JarvisWebappPlugin.getPlugin().getBundle().getEntry("/webapp/build/index.html"); //$NON-NLS-1$
			entry = Optional.ofNullable(url);
		}
		return entry.map(url -> new JarvisStaticResource(url));
	}
}
