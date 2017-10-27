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
	 * {@inheritDoc}
	 *
	 * @see org.obeonetwork.jarvis.server.api.IJarvisServerStaticResourceProvider#getResource(java.lang.String)
	 */
	@Override
	public Optional<IJarvisServerStaticResource> getResource(String path) {
		URL entry = JarvisWebappPlugin.getPlugin().getBundle().getEntry("/webapp/" + path); //$NON-NLS-1$
		return Optional.ofNullable(entry).map(url -> new JarvisStaticResource(url));
	}
}
