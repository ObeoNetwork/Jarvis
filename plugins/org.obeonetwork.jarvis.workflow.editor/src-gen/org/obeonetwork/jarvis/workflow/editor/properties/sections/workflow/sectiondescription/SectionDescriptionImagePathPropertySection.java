/*******************************************************************************
 *  Copyright (c) 2017 Obeo.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v2.0
 *  which accompanies this distribution, and is available at
 *  https://www.eclipse.org/legal/epl-2.0/
 *  Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.obeonetwork.jarvis.workflow.editor.properties.sections.workflow.sectiondescription;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.sirius.editor.properties.sections.common.AbstractTextWithButtonPropertySection;
import org.eclipse.sirius.editor.tools.internal.presentation.WorkspaceAndPluginsResourceDialog;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.obeonetwork.jarvis.workflow.workflow.WorkflowPackage;

// End of user code imports

/**
 * A section for the imagePath property of a SectionDescription object.
 */
public class SectionDescriptionImagePathPropertySection extends AbstractTextWithButtonPropertySection {

    /**
     * @see org.obeonetwork.jarvis.workflow.editor.properties.sections.AbstractTextWithButtonPropertySection#getDefaultLabelText()
     */
    @Override
    protected String getDefaultLabelText() {
        return "ImagePath"; //$NON-NLS-1$
    }

    /**
     * @see org.obeonetwork.jarvis.workflow.editor.properties.sections.AbstractTextWithButtonPropertySection#getLabelText()
     */
    @Override
    protected String getLabelText() {
        String labelText;
        labelText = super.getLabelText() + ":"; //$NON-NLS-1$
        // Start of user code get label text

        // End of user code get label text
        return labelText;
    }

    /**
     * @see org.obeonetwork.jarvis.workflow.editor.properties.sections.AbstractTextWithButtonPropertySection#getFeature()
     */
    @Override
    public EAttribute getFeature() {
        return WorkflowPackage.eINSTANCE.getSectionDescription_ImagePath();
    }

    /**
     * @see org.obeonetwork.jarvis.workflow.editor.properties.sections.AbstractTextWithButtonPropertySection#getFeatureValue(String)
     */
    @Override
    protected Object getFeatureValue(String newText) {
        return newText;
    }

    /**
     * @see org.obeonetwork.jarvis.workflow.editor.properties.sections.AbstractTextWithButtonPropertySection#isEqual(String)
     */
    @Override
    protected boolean isEqual(String newText) {
        return getFeatureAsText().equals(newText);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void createControls(Composite parent, TabbedPropertySheetPage tabbedPropertySheetPage) {
        super.createControls(parent, tabbedPropertySheetPage);

        // Start of user code create controls

        // End of user code create controls

    }

    @Override
    protected SelectionListener createButtonListener() {
        return new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                String imagePath = WorkspaceAndPluginsResourceDialog.openDialogForImages(composite.getShell());
                if (imagePath != null) {
                    text.setText(imagePath);
                    handleTextModified();
                }
            }
        };
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getPropertyDescription() {
        return "";
    }

    // Start of user code user operations

    // End of user code user operations
}
