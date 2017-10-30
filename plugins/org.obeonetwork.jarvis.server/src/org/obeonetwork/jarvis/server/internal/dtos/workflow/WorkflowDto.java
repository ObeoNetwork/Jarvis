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
 * The workflow.
 *
 * @author sbegaudeau
 */
public class WorkflowDto {
	/**
	 * The pages of the workflow.
	 */
	private List<PageDto> pages;

	/**
	 * The constructor.
	 * 
	 * @param pages
	 *            The pages of the workflow
	 */
	public WorkflowDto(List<PageDto> pages) {
		this.pages = pages;
	}

	/**
	 * Return the pages of the workflow.
	 *
	 * @return the pages of the workflow
	 */
	public List<PageDto> getPages() {
		return this.pages;
	}
}
