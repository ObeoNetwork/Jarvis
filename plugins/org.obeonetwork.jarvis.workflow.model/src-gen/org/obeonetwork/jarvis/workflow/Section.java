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
import org.obeonetwork.jarvis.workflow.description.SectionDescription;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Section</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.obeonetwork.jarvis.workflow.Section#getTitle
 * <em>Title</em>}</li>
 * <li>{@link org.obeonetwork.jarvis.workflow.Section#getDescriptionText
 * <em>Description Text</em>}</li>
 * <li>{@link org.obeonetwork.jarvis.workflow.Section#getIconPath <em>Icon
 * Path</em>}</li>
 * <li>{@link org.obeonetwork.jarvis.workflow.Section#getDescription
 * <em>Description</em>}</li>
 * <li>{@link org.obeonetwork.jarvis.workflow.Section#getOwnedActivities
 * <em>Owned Activities</em>}</li>
 * </ul>
 *
 * @see org.obeonetwork.jarvis.workflow.WorkflowPackage#getSection()
 * @model
 * @generated
 */
public interface Section extends EObject {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    String copyright = "Copyright (c) 2017 Obeo.\r\nAll rights reserved. This program and the accompanying materials\r\nare made available under the terms of the Eclipse Public License v1.0\r\nwhich accompanies this distribution, and is available at\r\nhttp://www.eclipse.org/legal/epl-v10.html\r\n\r\nContributors:\r\n   Obeo - initial API and implementation\r\n"; //$NON-NLS-1$

    /**
     * Returns the value of the '<em><b>Title</b></em>' attribute. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Title</em>' attribute isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Title</em>' attribute.
     * @see #setTitle(String)
     * @see org.obeonetwork.jarvis.workflow.WorkflowPackage#getSection_Title()
     * @model required="true"
     * @generated
     */
    String getTitle();

    /**
     * Sets the value of the
     * '{@link org.obeonetwork.jarvis.workflow.Section#getTitle <em>Title</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Title</em>' attribute.
     * @see #getTitle()
     * @generated
     */
    void setTitle(String value);

    /**
     * Returns the value of the '<em><b>Description Text</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Description Text</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Description Text</em>' attribute.
     * @see #setDescriptionText(String)
     * @see org.obeonetwork.jarvis.workflow.WorkflowPackage#getSection_DescriptionText()
     * @model required="true"
     * @generated
     */
    String getDescriptionText();

    /**
     * Sets the value of the
     * '{@link org.obeonetwork.jarvis.workflow.Section#getDescriptionText
     * <em>Description Text</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Description Text</em>' attribute.
     * @see #getDescriptionText()
     * @generated
     */
    void setDescriptionText(String value);

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
     * @see org.obeonetwork.jarvis.workflow.WorkflowPackage#getSection_IconPath()
     * @model dataType="org.eclipse.sirius.viewpoint.description.ImagePath"
     * @generated
     */
    String getIconPath();

    /**
     * Sets the value of the
     * '{@link org.obeonetwork.jarvis.workflow.Section#getIconPath <em>Icon
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
     * @see #setDescription(SectionDescription)
     * @see org.obeonetwork.jarvis.workflow.WorkflowPackage#getSection_Description()
     * @model required="true"
     * @generated
     */
    SectionDescription getDescription();

    /**
     * Sets the value of the
     * '{@link org.obeonetwork.jarvis.workflow.Section#getDescription
     * <em>Description</em>}' reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Description</em>' reference.
     * @see #getDescription()
     * @generated
     */
    void setDescription(SectionDescription value);

    /**
     * Returns the value of the '<em><b>Owned Activities</b></em>' containment
     * reference list. The list contents are of type
     * {@link org.obeonetwork.jarvis.workflow.Activity}. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Owned Activities</em>' containment reference
     * list isn't clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Owned Activities</em>' containment
     *         reference list.
     * @see org.obeonetwork.jarvis.workflow.WorkflowPackage#getSection_OwnedActivities()
     * @model containment="true" resolveProxies="true"
     * @generated
     */
    EList<Activity> getOwnedActivities();

} // Section
