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

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.obeonetwork.jarvis.server.api.IJarvisServerStaticResource;

/**
 * The static resource.
 *
 * @author sbegaudeau
 */
public class JarvisStaticResource implements IJarvisServerStaticResource {

	/**
	 * The URL of the resource.
	 */
	private URL url;

	/**
	 * The constructor.
	 *
	 * @param url
	 *            The URL of the resource
	 */
	public JarvisStaticResource(URL url) {
		this.url = url;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.obeonetwork.jarvis.server.api.IJarvisServerStaticResource#getContentType()
	 */
	@Override
	public String getContentType() {
		String contentType = null;
		if (this.url.toString().endsWith(".html")) { //$NON-NLS-1$
			contentType = "text/html"; //$NON-NLS-1$
		} else if (this.url.toString().endsWith(".css")) { //$NON-NLS-1$
			contentType = "text/css"; //$NON-NLS-1$
		} else if (this.url.toString().endsWith(".js")) { //$NON-NLS-1$
			contentType = "application/javascript"; //$NON-NLS-1$
		} else if (this.url.toString().endsWith(".svg")) { //$NON-NLS-1$
			contentType = "image/svg+xml"; //$NON-NLS-1$
		} else if (this.url.toString().endsWith(".jpg") || this.url.toString().endsWith("jpeg")) { //$NON-NLS-1$//$NON-NLS-2$
			contentType = "image/jpeg"; //$NON-NLS-1$
		} else if (this.url.toString().endsWith(".ico")) { //$NON-NLS-1$
			contentType = "image/x-icon"; //$NON-NLS-1$
		} else if (this.url.toString().endsWith(".json")) { //$NON-NLS-1$
			contentType = "application/json"; //$NON-NLS-1$
		}
		return contentType;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.obeonetwork.jarvis.server.api.IJarvisServerStaticResource#openInputStream()
	 */
	@Override
	public InputStream openInputStream() throws IOException {
		return this.url.openStream();
	}

}
