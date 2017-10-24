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
package org.obeonetwork.jarvis.workflow;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Workflow</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.obeonetwork.jarvis.workflow.Workflow#getOwnedPages <em>Owned
 * Pages</em>}</li>
 * </ul>
 *
 * @see org.obeonetwork.jarvis.workflow.WorkflowPackage#getWorkflow()
 * @model
 * @generated
 */
public interface Workflow extends EObject {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    String copyright = "Copyright (c) 2017 Obeo.\r\nAll rights reserved. This program and the accompanying materials\r\nare made available under the terms of the Eclipse Public License v1.0\r\nwhich accompanies this distribution, and is available at\r\nhttp://www.eclipse.org/legal/epl-v10.html\r\n\r\nContributors:\r\n   Obeo - initial API and implementation\r\n"; //$NON-NLS-1$

    /**
     * Returns the value of the '<em><b>Owned Pages</b></em>' containment
     * reference list. The list contents are of type
     * {@link org.obeonetwork.jarvis.workflow.Page}. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Owned Pages</em>' containment reference list
     * isn't clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Owned Pages</em>' containment reference
     *         list.
     * @see org.obeonetwork.jarvis.workflow.WorkflowPackage#getWorkflow_OwnedPages()
     * @model containment="true" resolveProxies="true"
     * @generated
     */
    EList<Page> getOwnedPages();

} // Workflow
