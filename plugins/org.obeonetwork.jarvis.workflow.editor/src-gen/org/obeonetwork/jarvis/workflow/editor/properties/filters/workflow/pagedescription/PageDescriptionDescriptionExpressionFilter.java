/*******************************************************************************
 *  Copyright (c) 2017 Obeo.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v2.0
 *  which accompanies this distribution, and is available at
 *  https://www.eclipse.org/legal/epl-2.0/
 *  Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.obeonetwork.jarvis.workflow.editor.properties.filters.workflow.pagedescription;

// Start of user code specific imports

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.sirius.editor.properties.filters.common.ViewpointPropertyFilter;
import org.obeonetwork.jarvis.workflow.workflow.WorkflowPackage;

// End of user code specific imports

/**
 * A filter for the descriptionExpression property section.
 */
public class PageDescriptionDescriptionExpressionFilter extends ViewpointPropertyFilter {

    /**
     * {@inheritDoc}
     */
    @Override
    protected EStructuralFeature getFeature() {
        return WorkflowPackage.eINSTANCE.getPageDescription_DescriptionExpression();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected boolean isRightInputType(Object arg0) {
        return arg0 instanceof org.obeonetwork.jarvis.workflow.workflow.PageDescription;
    }

    // Start of user code user methods

    // End of user code user methods

}
