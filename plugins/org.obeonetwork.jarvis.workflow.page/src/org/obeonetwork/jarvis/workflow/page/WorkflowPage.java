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

import java.util.Optional;

import org.eclipse.emf.transaction.ResourceSetChangeEvent;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.ui.editor.SessionEditorPlugin;
import org.eclipse.sirius.ui.editor.api.pages.AbstractSessionEditorPage;
import org.eclipse.sirius.ui.editor.api.pages.PageProviderRegistry.PositioningKind;
import org.eclipse.sirius.ui.editor.api.pages.PageUpdateCommandBuilder.PageUpdateCommand;
import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;

import com.google.common.io.BaseEncoding;

public class WorkflowPage extends AbstractSessionEditorPage {
    private Browser browser;

    private Session session;

    public WorkflowPage(Session s) {
        super(s.getID(), "Workflow");
        this.session = s;
    }

    @Override
    protected void createFormContent(IManagedForm managedForm) {
        super.createFormContent(managedForm);
        FormToolkit toolkit = managedForm.getToolkit();
        final ScrolledForm scrolledForm = managedForm.getForm();
        scrolledForm.setText("Workflow of " + session.getID());
        toolkit.decorateFormHeading(scrolledForm.getForm());

        Composite body = managedForm.getForm().getBody();
        body.setLayout(GridLayoutFactory.swtDefaults().create());

        Composite subBody = toolkit.createComposite(body);
        subBody.setLayout(GridLayoutFactory.swtDefaults().numColumns(2).equalWidth(false).margins(0, 0).create());
        subBody.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
        browser = new Browser(subBody, SWT.WEBKIT | SWT.FILL);
        GridData browserGridData = new GridData(SWT.FILL, SWT.FILL, true, true);
        browserGridData.widthHint = 0;
        browserGridData.heightHint = 0;
        browser.setLayoutData(browserGridData);
        browser.setUrl("http://localhost:8080/sessions/" + BaseEncoding.base64().encode(session.getID().getBytes()) + "/workflow");
    }

    @Override
    public Optional<String> getLocationId() {
        return Optional.of(SessionEditorPlugin.DEFAULT_PAGE_ID);
    }

    @Override
    public Optional<PositioningKind> getPositioning() {
        return Optional.of(PositioningKind.AFTER);
    }

    @Override
    public Optional<PageUpdateCommand> pageChanged(boolean isVisible) {
        return Optional.empty();
    }

    @Override
    public Optional<PageUpdateCommand> resourceSetChanged(ResourceSetChangeEvent resourceSetChangeEvent) {
        Display.getDefault().asyncExec(() -> {
            if (browser != null && !browser.isDisposed()) {
                browser.refresh();
            }
        });
        return Optional.empty();
    }
}
