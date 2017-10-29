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

import org.eclipse.emf.ecore.EObject;
import org.obeonetwork.jarvis.workflow.description.ActivityDescription;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Activity</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.obeonetwork.jarvis.workflow.Activity#getLabel
 * <em>Label</em>}</li>
 * <li>{@link org.obeonetwork.jarvis.workflow.Activity#getIconPath <em>Icon
 * Path</em>}</li>
 * <li>{@link org.obeonetwork.jarvis.workflow.Activity#getDescription
 * <em>Description</em>}</li>
 * </ul>
 *
 * @see org.obeonetwork.jarvis.workflow.WorkflowPackage#getActivity()
 * @model
 * @generated
 */
public interface Activity extends EObject {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    String copyright = "Copyright (c) 2017 Obeo.\r\nAll rights reserved. This program and the accompanying materials\r\nare made available under the terms of the Eclipse Public License v1.0\r\nwhich accompanies this distribution, and is available at\r\nhttp://www.eclipse.org/legal/epl-v10.html\r\n\r\nContributors:\r\n   Obeo - initial API and implementation\r\n"; //$NON-NLS-1$

    /**
     * Returns the value of the '<em><b>Label</b></em>' attribute. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Label</em>' attribute isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Label</em>' attribute.
     * @see #setLabel(String)
     * @see org.obeonetwork.jarvis.workflow.WorkflowPackage#getActivity_Label()
     * @model
     * @generated
     */
    String getLabel();

    /**
     * Sets the value of the
     * '{@link org.obeonetwork.jarvis.workflow.Activity#getLabel
     * <em>Label</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Label</em>' attribute.
     * @see #getLabel()
     * @generated
     */
    void setLabel(String value);

    /**
     * Returns the value of the '<em><b>Icon Path</b></em>' attribute. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Icon Path</em>' attribute isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Icon Path</em>' attribute.
     * @see #setIconPath(String)
     * @see org.obeonetwork.jarvis.workflow.WorkflowPackage#getActivity_IconPath()
     * @model dataType="org.eclipse.sirius.viewpoint.description.ImagePath"
     * @generated
     */
    String getIconPath();

    /**
     * Sets the value of the
     * '{@link org.obeonetwork.jarvis.workflow.Activity#getIconPath <em>Icon
     * Path</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Icon Path</em>' attribute.
     * @see #getIconPath()
     * @generated
     */
    void setIconPath(String value);

    /**
     * Returns the value of the '<em><b>Description</b></em>' reference. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Description</em>' reference isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Description</em>' reference.
     * @see #setDescription(ActivityDescription)
     * @see org.obeonetwork.jarvis.workflow.WorkflowPackage#getActivity_Description()
     * @model required="true"
     * @generated
     */
    ActivityDescription getDescription();

    /**
     * Sets the value of the
     * '{@link org.obeonetwork.jarvis.workflow.Activity#getDescription
     * <em>Description</em>}' reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Description</em>' reference.
     * @see #getDescription()
     * @generated
     */
    void setDescription(ActivityDescription value);

} // Activity
