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
package org.obeonetwork.jarvis.server.sirius.api.services;

import com.google.common.io.BaseEncoding;

/**
 * Utility class used to manipulate Sirius concepts.
 *
 * @author sbegaudeau
 */
public class JarvisSiriusUtils {
	/**
	 * Encodes the given string.
	 *
	 * @param string
	 *            The string to encode
	 * @return The encoded version of the given string
	 */
	public String encode(String string) {
		return BaseEncoding.base64().encode(string.getBytes());
	}

	/**
	 * Decodes the given string.
	 * 
	 * @param string
	 *            The string to decode
	 * @return The decoded version of the given string
	 */
	public String decode(String string) {
		return new String(BaseEncoding.base64().decode(string));
	}
}
