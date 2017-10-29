/**
 * Copyright (c) 2017 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Obeo - initial API and implementation
 *
 */
package org.obeonetwork.jarvis.workflow.description;

import org.eclipse.emf.common.util.EList;
import org.eclipse.sirius.viewpoint.description.DocumentedElement;
import org.eclipse.sirius.viewpoint.description.Extension;
import org.eclipse.sirius.viewpoint.description.IdentifiedElement;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Workflow
 * Description</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.obeonetwork.jarvis.workflow.description.WorkflowDescription#getPages
 * <em>Pages</em>}</li>
 * </ul>
 *
 * @see org.obeonetwork.jarvis.workflow.description.DescriptionPackage#getWorkflowDescription()
 * @model
 * @generated
 */
public interface WorkflowDescription extends Extension, IdentifiedElement, DocumentedElement {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    String copyright = "Copyright (c) 2017 Obeo.\r\nAll rights reserved. This program and the accompanying materials\r\nare made available under the terms of the Eclipse Public License v1.0\r\nwhich accompanies this distribution, and is available at\r\nhttp://www.eclipse.org/legal/epl-v10.html\r\n\r\nContributors:\r\n   Obeo - initial API and implementation\r\n"; //$NON-NLS-1$

    /**
     * Returns the value of the '<em><b>Pages</b></em>' containment reference
     * list. The list contents are of type
     * {@link org.obeonetwork.jarvis.workflow.description.PageDescription}. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Pages</em>' containment reference list isn't
     * clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Pages</em>' containment reference list.
     * @see org.obeonetwork.jarvis.workflow.description.DescriptionPackage#getWorkflowDescription_Pages()
     * @model containment="true" resolveProxies="true"
     * @generated
     */
    EList<PageDescription> getPages();

} // WorkflowDescription
