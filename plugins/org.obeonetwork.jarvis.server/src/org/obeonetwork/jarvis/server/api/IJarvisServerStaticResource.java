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

import java.io.IOException;
import java.io.InputStream;

/**
 * The static resource is defined by its content and its content type.
 *
 * @author sbegaudeau
 */
public interface IJarvisServerStaticResource {

	/**
	 * The content type.
	 *
	 * @return The content type
	 */
	String getContentType();

	/**
	 * The input stream.
	 *
	 * @return The input stream
	 *
	 * @exception IOException
	 *                In case of errors while trying to open the input stream
	 */
	InputStream openInputStream() throws IOException;
}
