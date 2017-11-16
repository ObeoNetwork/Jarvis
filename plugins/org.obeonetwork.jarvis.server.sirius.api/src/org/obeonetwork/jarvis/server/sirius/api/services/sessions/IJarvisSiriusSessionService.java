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
package org.obeonetwork.jarvis.server.sirius.api.services.sessions;

/**
 * The service class used to manipulate the Sirius sessions.
 *
 * @author sbegaudeau
 */
public interface IJarvisSiriusSessionService {
	/**
	 * Returns the Sirius sessions.
	 * 
	 * @return The Sirius sessions
	 */
	SessionsDto getSessions();
}
