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
package org.obeonetwork.jarvis.workflow.model.editor.properties.sections.workflow.section;

// Start of user code imports

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.sirius.editor.editorPlugin.SiriusEditor;
import org.eclipse.sirius.editor.properties.sections.common.AbstractComboPropertySection;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.obeonetwork.jarvis.workflow.WorkflowPackage;

// End of user code imports

/**
 * A section for the description property of a Section object.
 */
public class SectionDescriptionPropertySection extends AbstractComboPropertySection {
    /**
     * @see org.obeonetwork.jarvis.workflow.model.editor.properties.sections.AbstractComboPropertySection#getDefaultLabelText()
     */
    @Override
    protected String getDefaultLabelText() {
        return "Description"; //$NON-NLS-1$
    }

    /**
     * @see org.obeonetwork.jarvis.workflow.model.editor.properties.sections.AbstractComboPropertySection#getLabelText()
     */
    @Override
    protected String getLabelText() {
        String labelText;
        labelText = super.getLabelText() + "*:"; //$NON-NLS-1$
        // Start of user code get label text

        // End of user code get label text
        return labelText;
    }

    /**
     * @see org.obeonetwork.jarvis.workflow.model.editor.properties.sections.AbstractComboPropertySection#getFeature()
     */
    @Override
    protected EReference getFeature() {
        return WorkflowPackage.eINSTANCE.getSection_Description();
    }

    /**
     * @see org.obeonetwork.jarvis.workflow.model.editor.properties.sections.AbstractComboPropertySection#getFeatureValue(int)
     */
    @Override
    protected Object getFeatureValue(int index) {
        return getFeatureValueAt(index);
    }

    /**
     * @see org.obeonetwork.jarvis.workflow.model.editor.properties.sections.AbstractComboPropertySection#isEqual(int)
     */
    @Override
    protected boolean isEqual(int index) {
        boolean isEqual = false;
        if (getFeatureValueAt(index) == null) {
            isEqual = eObject.eGet(getFeature()) == null;
        } else {
            isEqual = getFeatureValueAt(index).equals(eObject.eGet(getFeature()));
        }
        return isEqual;
    }

    /**
     * Returns the value at the specified index in the choice of values for the
     * feature.
     *
     * @param index
     *            Index of the value.
     * @return the value at the specified index in the choice of values.
     */
    protected Object getFeatureValueAt(int index) {
        List<?> values = getChoiceOfValues();
        if (values.size() < index || values.size() == 0 || index == -1) {
            return null;
        }
        return values.get(index);
    }

    /**
     * Fetches the list of available values for the feature.
     *
     * @return The list of available values for the feature.
     */
    @Override
    protected List<?> getChoiceOfValues() {
        List<?> values = Collections.emptyList();
        List<IItemPropertyDescriptor> propertyDescriptors = getDescriptors();
        for (IItemPropertyDescriptor propertyDescriptor : propertyDescriptors) {
            if (((EStructuralFeature) propertyDescriptor.getFeature(eObject)) == getFeature()) {
                values = new ArrayList<Object>(propertyDescriptor.getChoiceOfValues(eObject));
            }
        }

        // Start of user code choice of values
        // End of user code choice of values
        return values;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void createControls(Composite parent, TabbedPropertySheetPage tabbedPropertySheetPage) {
        super.createControls(parent, tabbedPropertySheetPage);
        nameLabel.setFont(SiriusEditor.getFontRegistry().get("required"));
        // Start of user code create controls

        // End of user code create controls
    }
    // Start of user code user operations

    // End of user code user operations
}
