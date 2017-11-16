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
package org.obeonetwork.jarvis.webapp.internal.servlets;

/**
 * Utility class to retrieve the content type of a given resource.
 *
 * @author sbegaudeau
 */
public final class JarvisContentTypeUtils {

	/**
	 * Returns the content type of the resource with the given path.
	 *
	 * @param path
	 *            The path of the resource
	 * @return The content type of the resource
	 */
	public String getContentType(String path) {
		String contentType = null;
		if (path.toString().endsWith(".html")) { //$NON-NLS-1$
			contentType = "text/html"; //$NON-NLS-1$
		} else if (path.toString().endsWith(".css")) { //$NON-NLS-1$
			contentType = "text/css"; //$NON-NLS-1$
		} else if (path.toString().endsWith(".js")) { //$NON-NLS-1$
			contentType = "application/javascript"; //$NON-NLS-1$
		} else if (path.toString().endsWith(".svg")) { //$NON-NLS-1$
			contentType = "image/svg+xml"; //$NON-NLS-1$
		} else if (path.toString().endsWith(".jpg") || path.toString().endsWith("jpeg")) { //$NON-NLS-1$//$NON-NLS-2$
			contentType = "image/jpeg"; //$NON-NLS-1$
		} else if (path.toString().endsWith(".ico")) { //$NON-NLS-1$
			contentType = "image/x-icon"; //$NON-NLS-1$
		} else if (path.toString().endsWith(".json")) { //$NON-NLS-1$
			contentType = "application/json"; //$NON-NLS-1$
		}
		return contentType;
	}
}
