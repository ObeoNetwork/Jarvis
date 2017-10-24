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
package org.obeonetwork.jarvis.workflow.model.editor.properties.filters.description.pagedescription;

// Start of user code specific imports

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.sirius.editor.properties.filters.common.ViewpointPropertyFilter;
import org.obeonetwork.jarvis.workflow.description.DescriptionPackage;

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
        return DescriptionPackage.eINSTANCE.getPageDescription_DescriptionExpression();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected boolean isRightInputType(Object arg0) {
        return arg0 instanceof org.obeonetwork.jarvis.workflow.description.PageDescription;
    }

    // Start of user code user methods

    // End of user code user methods

}