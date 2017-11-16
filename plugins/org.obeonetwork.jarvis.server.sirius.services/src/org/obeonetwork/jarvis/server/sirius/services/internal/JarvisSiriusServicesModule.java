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
package org.obeonetwork.jarvis.server.sirius.services.internal;

import org.obeonetwork.jarvis.server.api.AbstractJarvisModule;
import org.obeonetwork.jarvis.server.sirius.api.services.representations.IJarvisSiriusRepresentationService;
import org.obeonetwork.jarvis.server.sirius.api.services.sessions.IJarvisSiriusSessionService;
import org.obeonetwork.jarvis.server.sirius.api.services.workflow.IJarvisSiriusWorkflowService;
import org.obeonetwork.jarvis.server.sirius.services.internal.representations.JarvisSiriusRepresentationService;
import org.obeonetwork.jarvis.server.sirius.services.internal.sessions.JarvisSiriusSessionService;
import org.obeonetwork.jarvis.server.sirius.services.internal.workflow.JarvisSiriusWorkflowService;

/**
 * The module providing the Jarvis Sirius services.
 *
 * @author sbegaudeau
 */
public class JarvisSiriusServicesModule extends AbstractJarvisModule {
	/**
	 * {@inheritDoc}
	 *
	 * @see com.google.inject.servlet.ServletModule#configureServlets()
	 */
	@Override
	protected void configureServlets() {
		bind(IJarvisSiriusRepresentationService.class).to(JarvisSiriusRepresentationService.class);
		bind(IJarvisSiriusSessionService.class).to(JarvisSiriusSessionService.class);
		bind(IJarvisSiriusWorkflowService.class).to(JarvisSiriusWorkflowService.class);
	}
}
