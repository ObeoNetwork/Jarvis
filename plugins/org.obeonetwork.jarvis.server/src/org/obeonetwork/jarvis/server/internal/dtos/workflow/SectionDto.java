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
 * The section.
 *
 * @author sbegaudeau
 */
public class SectionDto {
	/**
	 * The label.
	 */
	private String label;

	/**
	 * The actions of the section.
	 */
	private List<ActionDto> actions;

	/**
	 * The constructor.
	 *
	 * @param label
	 *            The label
	 * @param actions
	 *            The actions
	 */
	public SectionDto(String label, List<ActionDto> actions) {
		this.label = label;
		this.actions = actions;
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
	 * Return the actions.
	 *
	 * @return the actions
	 */
	public List<ActionDto> getActions() {
		return this.actions;
	}
}
