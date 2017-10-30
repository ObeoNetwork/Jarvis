/**
 *  Copyright (c) 2017 Obeo.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v2.0
 *  which accompanies this distribution, and is available at
 *  https://www.eclipse.org/legal/epl-2.0/
 * 
 *  Contributors:
 *     Obeo - initial API and implementation
 * 
 */
package org.obeonetwork.jarvis.workflow.workflow;

import org.eclipse.emf.common.util.EList;

import org.eclipse.sirius.viewpoint.description.DocumentedElement;
import org.eclipse.sirius.viewpoint.description.Extension;
import org.eclipse.sirius.viewpoint.description.IdentifiedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.jarvis.workflow.workflow.WorkflowDescription#getPages <em>Pages</em>}</li>
 * </ul>
 *
 * @see org.obeonetwork.jarvis.workflow.workflow.WorkflowPackage#getWorkflowDescription()
 * @model
 * @generated
 */
public interface WorkflowDescription extends Extension, IdentifiedElement, DocumentedElement {
    /**
     * Returns the value of the '<em><b>Pages</b></em>' containment reference list.
     * The list contents are of type {@link org.obeonetwork.jarvis.workflow.workflow.PageDescription}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Pages</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Pages</em>' containment reference list.
     * @see org.obeonetwork.jarvis.workflow.workflow.WorkflowPackage#getWorkflowDescription_Pages()
     * @model containment="true"
     * @generated
     */
    EList<PageDescription> getPages();

} // WorkflowDescription
