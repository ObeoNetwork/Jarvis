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

package org.obeonetwork.jarvis.workflow.ui;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Optional;

import org.obeonetwork.jarvis.server.api.IJarvisServerStaticResourceProvider;

public class WorkflowStaticResourceProvider implements IJarvisServerStaticResourceProvider {

    @Override
    public Optional<InputStream> getResource(String path) {
        URL entry = WorkflowUIPlugin.getDefault().getBundle().getEntry("/webapp/" + path); //$NON-NLS-1$
        return Optional.ofNullable(entry).flatMap(url -> {
            try {
                return Optional.of(url.openStream());
            } catch (IOException e) {
                e.printStackTrace();
            }
            return Optional.empty();
        });
    }

}
