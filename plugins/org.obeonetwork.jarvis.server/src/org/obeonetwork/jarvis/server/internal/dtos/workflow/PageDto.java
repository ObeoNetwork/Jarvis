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
package org.obeonetwork.jarvis.server.internal.dtos.workflow;

import java.util.List;

/**
 * The page.
 *
 * @author sbegaudeau
 */
public class PageDto {
	/**
	 * The label.
	 */
	private String label;

	/**
	 * The sections.
	 */
	private List<SectionDto> sections;

	/**
	 * The constructor.
	 *
	 * @param label
	 *            The label
	 * @param sections
	 *            The sections
	 */
	public PageDto(String label, List<SectionDto> sections) {
		this.sections = sections;
	}

	/**
	 * Return the label.
	 *
	 * @return the label
	 */
	public String getLabel() {
		return this.label;
	}

	/**
	 * Return the sections.
	 *
	 * @return the sections
	 */
	public List<SectionDto> getSections() {
		return this.sections;
	}
}
