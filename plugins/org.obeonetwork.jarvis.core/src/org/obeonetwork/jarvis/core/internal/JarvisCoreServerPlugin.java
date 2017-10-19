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
package org.obeonetwork.jarvis.core.internal;

import java.io.InputStream;
import java.util.Optional;

import org.obeonetwork.jarvis.server.api.IJarvisServerPlugin;

/**
 * Contribution to the Jarvis Server.
 *
 * @author sbegaudeau
 */
public class JarvisCoreServerPlugin implements IJarvisServerPlugin {

	/**
	 * {@inheritDoc}
	 *
	 * @see org.obeonetwork.jarvis.server.api.IJarvisServerPlugin#getResource(java.lang.String)
	 */
	@Override
	public Optional<InputStream> getResource(String path) {
		// TODO Read resources from a webapp repository in the bundle
		return Optional.empty();
	}

}
