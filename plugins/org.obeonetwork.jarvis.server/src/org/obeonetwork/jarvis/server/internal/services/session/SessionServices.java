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
package org.obeonetwork.jarvis.server.internal.services.session;

import com.google.common.io.BaseEncoding;

import java.util.List;
import java.util.stream.Collectors;

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
			String id = session.getID();
			// TODO Remove guava here too
			return new SessionDto(BaseEncoding.base64().encode(id.getBytes()));
		}).collect(Collectors.toList());
		return new SessionsDto(sessionDtos);
	}

}
