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
package org.obeonetwork.jarvis.server.internal;

import org.obeonetwork.jarvis.server.api.AbstractJarvisModule;
import org.obeonetwork.jarvis.server.internal.servlets.JarvisSiriusCreateRepresentationCommandServlet;
import org.obeonetwork.jarvis.server.internal.servlets.JarvisSiriusOpenRepresentationCommandServlet;
import org.obeonetwork.jarvis.server.internal.servlets.JarvisSiriusRepresentationsServlet;
import org.obeonetwork.jarvis.server.internal.servlets.JarvisSiriusSessionsServlet;
import org.obeonetwork.jarvis.server.internal.servlets.JarvisSiriusWorkflowPageServlet;
import org.obeonetwork.jarvis.server.internal.servlets.JarvisSiriusWorkflowServlet;

/**
 * The Jarvis Sirius module.
 *
 * @author sbegaudeau
 */
public class JarvisSiriusModule extends AbstractJarvisModule {

	/**
	 * The path of the sessions API.
	 */
	private static final String SESSIONS = "/api/sessions"; //$NON-NLS-1$

	/**
	 * The regex matching the path of the representations API.
	 */
	private static final String SESSIONS_REPRESENTATIONS = "\\/api\\/sessions\\/(?:[a-zA-Z0-9_][a-zA-Z0-9_]*)\\/representations"; //$NON-NLS-1$

	/**
	 * The regex matching the path of the workflow API.
	 */
	private static final String SESSIONS_WORKFLOW = "\\/api\\/sessions\\/(?:[a-zA-Z0-9_][a-zA-Z0-9_]*)\\/workflow"; //$NON-NLS-1$

	/**
	 * The regex matching the path of the workflow page API.
	 */
	private static final String SESSIONS_WORKFLOW_PAGE = "\\/api\\/sessions\\/(?:[a-zA-Z0-9_][a-zA-Z0-9_]*)\\/workflow\\/pages\\/(?:[a-zA-Z0-9_][a-zA-Z0-9_]*)"; //$NON-NLS-1$

	/**
	 * The regex matching the path of the create representation command API.
	 */
	private static final String SESSIONS_COMMAND_CREATE_REPRESENTATION = "\\/api\\/sessions\\/(?:[a-zA-Z0-9_][a-zA-Z0-9_]*)\\/commands/create_representation"; //$NON-NLS-1$

	/**
	 * The regex matching the path of the open representation command API.
	 */
	private static final String SESSIONS_COMMAND_OPEN_REPRESENTATION = "\\/api\\/sessions\\/(?:[a-zA-Z0-9_][a-zA-Z0-9_]*)\\/commands/open_representation"; //$NON-NLS-1$

	/**
	 * {@inheritDoc}
	 *
	 * @see com.google.inject.servlet.ServletModule#configureServlets()
	 */
	@Override
	protected void configureServlets() {
		bind(JarvisSiriusSessionsServlet.class);
		bind(JarvisSiriusRepresentationsServlet.class);
		bind(JarvisSiriusWorkflowServlet.class);
		bind(JarvisSiriusWorkflowPageServlet.class);
		bind(JarvisSiriusCreateRepresentationCommandServlet.class);
		bind(JarvisSiriusOpenRepresentationCommandServlet.class);

		serve(SESSIONS).with(JarvisSiriusSessionsServlet.class);
		serveRegex(SESSIONS_REPRESENTATIONS).with(JarvisSiriusRepresentationsServlet.class);
		serveRegex(SESSIONS_WORKFLOW).with(JarvisSiriusWorkflowServlet.class);
		serveRegex(SESSIONS_WORKFLOW_PAGE).with(JarvisSiriusWorkflowPageServlet.class);
		serveRegex(SESSIONS_COMMAND_CREATE_REPRESENTATION).with(JarvisSiriusCreateRepresentationCommandServlet.class);
		serveRegex(SESSIONS_COMMAND_OPEN_REPRESENTATION).with(JarvisSiriusOpenRepresentationCommandServlet.class);
	}
}
