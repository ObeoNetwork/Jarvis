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
package org.obeonetwork.jarvis.server.internal.servlets;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Utility class used to manipulate the path of the HTTP requests.
 *
 * @author sbegaudeau
 */
public class JarvisSiriusPathUtils {
	/**
	 * Returns the session identifier from the given path.
	 *
	 * @param path
	 *            The path of the request
	 * @return The session identifier
	 */
	public Optional<String> getSessionId(String path) {
		List<String> segments = Arrays.asList(path.split("/")); //$NON-NLS-1$
		if (segments.size() > 3) {
			return Optional.of(segments.get(3));
		}
		return Optional.empty();
	}

	/**
	 * Returns the page identifier from the given path.
	 *
	 * @param path
	 *            The path of the request
	 * @return The page identifier
	 */
	public Optional<String> getPageId(String path) {
		List<String> segments = Arrays.asList(path.split("/")); //$NON-NLS-1$
		if (segments.size() > 6) {
			return Optional.of(segments.get(6));
		}
		return Optional.empty();
	}
}
