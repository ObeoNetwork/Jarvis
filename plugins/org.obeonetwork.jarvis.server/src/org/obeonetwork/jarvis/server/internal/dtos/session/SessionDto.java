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
package org.obeonetwork.jarvis.server.internal.dtos.session;

/**
 * The session.
 *
 * @author sbegaudeau
 */
public class SessionDto {
	/**
	 * The session id.
	 */
	private String sessionId;

	/**
	 * The constructor.
	 *
	 * @param sessionId
	 *            The session id
	 */
	public SessionDto(String sessionId) {
		this.sessionId = sessionId;
	}

	/**
	 * Return the sessionId.
	 *
	 * @return the sessionId
	 */
	public String getSessionId() {
		return this.sessionId;
	}
}
