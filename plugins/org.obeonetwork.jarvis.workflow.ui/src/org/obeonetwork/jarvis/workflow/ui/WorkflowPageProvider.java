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

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.ui.editor.SessionEditor;
import org.eclipse.sirius.ui.editor.api.pages.AbstractSessionEditorPage;
import org.eclipse.sirius.ui.editor.api.pages.PageProvider;
import org.obeonetwork.jarvis.server.internal.WorkflowConverter;
import org.obeonetwork.jarvis.workflow.Page;
import org.obeonetwork.jarvis.workflow.Workflow;

public class WorkflowPageProvider extends PageProvider {
    @Override
    public Map<String, Supplier<AbstractSessionEditorPage>> getPages(SessionEditor editor) {
        WorkflowConverter converter = new WorkflowConverter(editor.getSession());
        Workflow workflow = converter.computeEffectiveWorkflow();
        Map<String, Supplier<AbstractSessionEditorPage>> result = new HashMap<>();
        for (Page page : workflow.getOwnedPages()) {
            result.put(EcoreUtil.getURI(page.getDescription()).toString(), () -> new WorkflowPage(page));
        }
        return result;
    }

    @Override
    public boolean provides(String pageId, SessionEditor editor) {
        return getPages(editor).containsKey(pageId);
    }
}
