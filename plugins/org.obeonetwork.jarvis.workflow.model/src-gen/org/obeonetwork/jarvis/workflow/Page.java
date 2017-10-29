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
import org.obeonetwork.jarvis.workflow.description.PageDescription;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Page</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.obeonetwork.jarvis.workflow.Page#getTitle <em>Title</em>}</li>
 * <li>{@link org.obeonetwork.jarvis.workflow.Page#getDescriptionText
 * <em>Description Text</em>}</li>
 * <li>{@link org.obeonetwork.jarvis.workflow.Page#getImagePath <em>Image
 * Path</em>}</li>
 * <li>{@link org.obeonetwork.jarvis.workflow.Page#getDescription
 * <em>Description</em>}</li>
 * <li>{@link org.obeonetwork.jarvis.workflow.Page#getOwnedSections <em>Owned
 * Sections</em>}</li>
 * </ul>
 *
 * @see org.obeonetwork.jarvis.workflow.WorkflowPackage#getPage()
 * @model
 * @generated
 */
public interface Page extends EObject {
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
     * @see org.obeonetwork.jarvis.workflow.WorkflowPackage#getPage_Title()
     * @model required="true"
     * @generated
     */
    String getTitle();

    /**
     * Sets the value of the
     * '{@link org.obeonetwork.jarvis.workflow.Page#getTitle <em>Title</em>}'
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
     * @see org.obeonetwork.jarvis.workflow.WorkflowPackage#getPage_DescriptionText()
     * @model required="true"
     * @generated
     */
    String getDescriptionText();

    /**
     * Sets the value of the
     * '{@link org.obeonetwork.jarvis.workflow.Page#getDescriptionText
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
     * Returns the value of the '<em><b>Image Path</b></em>' attribute. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Image Path</em>' attribute isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Image Path</em>' attribute.
     * @see #setImagePath(String)
     * @see org.obeonetwork.jarvis.workflow.WorkflowPackage#getPage_ImagePath()
     * @model dataType="org.eclipse.sirius.viewpoint.description.ImagePath"
     * @generated
     */
    String getImagePath();

    /**
     * Sets the value of the
     * '{@link org.obeonetwork.jarvis.workflow.Page#getImagePath <em>Image
     * Path</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Image Path</em>' attribute.
     * @see #getImagePath()
     * @generated
     */
    void setImagePath(String value);

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
     * @see #setDescription(PageDescription)
     * @see org.obeonetwork.jarvis.workflow.WorkflowPackage#getPage_Description()
     * @model required="true"
     * @generated
     */
    PageDescription getDescription();

    /**
     * Sets the value of the
     * '{@link org.obeonetwork.jarvis.workflow.Page#getDescription
     * <em>Description</em>}' reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Description</em>' reference.
     * @see #getDescription()
     * @generated
     */
    void setDescription(PageDescription value);

    /**
     * Returns the value of the '<em><b>Owned Sections</b></em>' containment
     * reference list. The list contents are of type
     * {@link org.obeonetwork.jarvis.workflow.Section}. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Owned Sections</em>' containment reference
     * list isn't clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Owned Sections</em>' containment reference
     *         list.
     * @see org.obeonetwork.jarvis.workflow.WorkflowPackage#getPage_OwnedSections()
     * @model containment="true" resolveProxies="true"
     * @generated
     */
    EList<Section> getOwnedSections();

} // Page
