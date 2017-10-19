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

import java.io.InputStream;
import java.util.Optional;

/**
 * Interface used by contributor to the Jarvis server.
 *
 * @author sbegaudeau
 */
public interface IJarvisServerPlugin {
	/**
	 * Returns an optional containing an input stream for the given path if the plugin can handle the given path or an
	 * empty optional otherwise.
	 *
	 * @param path
	 *            The path of the resource requested
	 * @return An optional with an input stream for the resource if it exists
	 */
	Optional<InputStream> getResource(String path);
}
