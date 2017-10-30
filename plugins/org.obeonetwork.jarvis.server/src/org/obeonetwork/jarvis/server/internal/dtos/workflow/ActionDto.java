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

/**
 * The action.
 *
 * @author sbegaudeau
 */
public class ActionDto {
	/**
	 * The label.
	 */
	private String label;

	/**
	 * The constructor.
	 * 
	 * @param label
	 *            The label
	 */
	public ActionDto(String label) {
		this.label = label;
	}

	/**
	 * Return the label.
	 *
	 * @return the label
	 */
	public String getLabel() {
		return this.label;
	}
}