/*******************************************************************************
 * Copyright (c) 2015 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/
package org.obeonetwork.jarvis.server.internal.extensions;

/**
 * The description of the Object.
 *
 * @author sbegaudeau
 *
 * @param <T>
 *            The type of the Object described
 */
public interface IItemDescriptor<T> {
	/**
	 * Returns the identifier.
	 *
	 * @return The identifier
	 */
	String getID();

	/**
	 * Returns the label.
	 *
	 * @return The label
	 */
	String getLabel();

	/**
	 * Returns the description.
	 *
	 * @return The description
	 */
	String getDescription();

	/**
	 * Returns the item.
	 *
	 * @return The item
	 */
	T getItem();
}
