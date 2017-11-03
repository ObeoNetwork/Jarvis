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
package org.obeonetwork.jarvis.workflow.page;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.ui.editor.SessionEditor;
import org.eclipse.sirius.ui.editor.api.pages.AbstractSessionEditorPage;
import org.eclipse.sirius.ui.editor.api.pages.PageProvider;

public class WorkflowPageProvider extends PageProvider {
    private static final String PREFIX = "session:";

    @Override
    public Map<String, Supplier<AbstractSessionEditorPage>> getPages(SessionEditor editor) {
        Session s = editor.getSession();
        Map<String, Supplier<AbstractSessionEditorPage>> result = new HashMap<>();
        result.put(PREFIX + s.getID(), () -> new WorkflowPage(s));
        return result;
    }

    @Override
    public boolean provides(String pageId) {
        if (pageId.startsWith(PREFIX)) {
            String sid = pageId.substring(PREFIX.length());
            return SessionManager.INSTANCE.getSessions().stream().anyMatch(s -> s.getID().equals(sid));
        }
        return false;
    }
}
