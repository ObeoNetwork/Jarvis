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
package org.obeonetwork.jarvis.server.internal.services.representations;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.obeonetwork.jarvis.server.internal.dtos.representations.CreateRepresentationDto;
import org.obeonetwork.jarvis.server.internal.dtos.representations.RepresentationDto;
import org.obeonetwork.jarvis.server.internal.dtos.representations.RepresentationsDto;

/**
 * The service class for the representations.
 *
 * @author sbegaudeau
 */
public class RepresentationServices {

	/**
	 * Returns the representations for the session with the given sessionId.
	 *
	 * @param sessionId
	 *            The identifier of the session
	 * @return The representations of the session
	 */
	public RepresentationsDto getRepresentations(String sessionId) {
		List<RepresentationDto> representations = new ArrayList<>();
		// TODO compute the representations
		return new RepresentationsDto(representations);
	}

	/**
	 * Creates a new representation in the session with the given sessionId.
	 *
	 * @param sessionId
	 *            The identifier of the session
	 * @param createRepresentationDto
	 *            The details of the representation to create
	 * @return An optional with the representation created or an empty optional if it could not be created
	 */
	public Optional<RepresentationDto> createRepresentation(String sessionId, CreateRepresentationDto createRepresentationDto) {
		// TODO Create a new representation
		return Optional.empty();
	}

}
