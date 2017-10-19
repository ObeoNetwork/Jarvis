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
package org.obeonetwork.jarvis.server.internal;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.http.context.ServletContextHelper;
import org.osgi.service.http.whiteboard.HttpWhiteboardConstants;

/**
 * Utility class used to configure the servlet context with annotations.
 *
 * @author sbegaudeau
 */
// @formatter:off
@Component(property = {
	HttpWhiteboardConstants.HTTP_WHITEBOARD_CONTEXT_NAME + "=jarvis",
	HttpWhiteboardConstants.HTTP_WHITEBOARD_CONTEXT_PATH + "=/"
})
public class JarvisServletContextHelper extends ServletContextHelper {
	// nothing needed
}
