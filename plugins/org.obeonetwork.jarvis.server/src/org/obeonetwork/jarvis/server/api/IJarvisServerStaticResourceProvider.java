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
package org.obeonetwork.jarvis.server.api;

import java.util.Optional;

/**
 * Interface used to contribute static resources to the server.
 *
 * @author sbegaudeau
 */
public interface IJarvisServerStaticResourceProvider {
	/**
	 * Returns an optional containing the resource for the given path if the plugin can handle it or an empty optional
	 * otherwise.
	 *
	 * @param path
	 *            The path of the resource requested
	 * @return An optional with the resource if it exists
	 */
	Optional<IJarvisServerStaticResource> getResource(String path);
}
