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
package org.obeonetwork.jarvis.server.internal.services.session;

import com.google.common.io.BaseEncoding;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.obeonetwork.jarvis.server.internal.dtos.session.SessionDto;
import org.obeonetwork.jarvis.server.internal.dtos.session.SessionsDto;

/**
 * The sessions services.
 *
 * @author sbegaudeau
 */
public class SessionServices {

	/**
	 * Returns the list of the sessions.
	 *
	 * @return The list of the sessions
	 */
	public SessionsDto getSessions() {
		List<SessionDto> sessionDtos = SessionManager.INSTANCE.getSessions().stream().map(session -> {
			return new SessionDto(getSessionID(session));
		}).collect(Collectors.toList());
		return new SessionsDto(sessionDtos);
	}

	/**
	 * Returns the identifier of a given session in a form that can be safely included in URLs.
	 *
	 * @param s
	 *            a Sirius session.
	 * @return an safe identifier for the session.
	 */
	public String getSessionID(Session s) {
		// TODO Remove guava here too
		return BaseEncoding.base64().encode(s.getID().getBytes());
	}

	/**
	 * Find a Sirius session from its safe identifier.
	 *
	 * @param sessionID
	 *            a session identifier.
	 * @return the first opened Sirius session which matches the given id.
	 */
	public Optional<Session> findSessionByID(String sessionID) {
		return SessionManager.INSTANCE.getSessions().stream().filter(s -> Objects.equals(sessionID, getSessionID(s))).findFirst();
	}

}
