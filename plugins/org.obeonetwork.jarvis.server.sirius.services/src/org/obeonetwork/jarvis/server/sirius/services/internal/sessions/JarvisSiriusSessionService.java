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
package org.obeonetwork.jarvis.server.sirius.services.internal.sessions;

import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.sirius.business.api.session.SessionManager;
import org.obeonetwork.jarvis.server.sirius.api.services.JarvisSiriusUtils;
import org.obeonetwork.jarvis.server.sirius.api.services.sessions.IJarvisSiriusSessionService;
import org.obeonetwork.jarvis.server.sirius.api.services.sessions.SessionDto;
import org.obeonetwork.jarvis.server.sirius.api.services.sessions.SessionsDto;

/**
 * The implementation of the Sirius session service.
 *
 * @author sbegaudeau
 */
public class JarvisSiriusSessionService implements IJarvisSiriusSessionService {

	/**
	 * {@inheritDoc}
	 *
	 * @see org.obeonetwork.jarvis.server.sirius.api.services.sessions.IJarvisSiriusSessionService#getSessions()
	 */
	@Override
	public SessionsDto getSessions() {
		List<SessionDto> sessionDtos = SessionManager.INSTANCE.getSessions().stream().map(session -> {
			return new SessionDto(new JarvisSiriusUtils().encode(session.getID()));
		}).collect(Collectors.toList());
		return new SessionsDto(sessionDtos);
	}

}
