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
import org.eclipse.sirius.viewpoint.description.IdentifiedElement;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Page
 * Description</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.obeonetwork.jarvis.workflow.description.PageDescription#getTitleExpression
 * <em>Title Expression</em>}</li>
 * <li>{@link org.obeonetwork.jarvis.workflow.description.PageDescription#getImagePath
 * <em>Image Path</em>}</li>
 * <li>{@link org.obeonetwork.jarvis.workflow.description.PageDescription#getDescriptionExpression
 * <em>Description Expression</em>}</li>
 * <li>{@link org.obeonetwork.jarvis.workflow.description.PageDescription#getSections
 * <em>Sections</em>}</li>
 * </ul>
 *
 * @see org.obeonetwork.jarvis.workflow.description.DescriptionPackage#getPageDescription()
 * @model
 * @generated
 */
public interface PageDescription extends IdentifiedElement, DocumentedElement {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    String copyright = "Copyright (c) 2017 Obeo.\r\nAll rights reserved. This program and the accompanying materials\r\nare made available under the terms of the Eclipse Public License v1.0\r\nwhich accompanies this distribution, and is available at\r\nhttp://www.eclipse.org/legal/epl-v10.html\r\n\r\nContributors:\r\n   Obeo - initial API and implementation\r\n"; //$NON-NLS-1$

    /**
     * Returns the value of the '<em><b>Title Expression</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Title Expression</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Title Expression</em>' attribute.
     * @see #setTitleExpression(String)
     * @see org.obeonetwork.jarvis.workflow.description.DescriptionPackage#getPageDescription_TitleExpression()
     * @model dataType="org.eclipse.sirius.viewpoint.description.InterpretedExpression"
     *        required="true"
     * @generated
     */
    String getTitleExpression();

    /**
     * Sets the value of the
     * '{@link org.obeonetwork.jarvis.workflow.description.PageDescription#getTitleExpression
     * <em>Title Expression</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Title Expression</em>' attribute.
     * @see #getTitleExpression()
     * @generated
     */
    void setTitleExpression(String value);

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
     * @see org.obeonetwork.jarvis.workflow.description.DescriptionPackage#getPageDescription_ImagePath()
     * @model dataType="org.eclipse.sirius.viewpoint.description.ImagePath"
     * @generated
     */
    String getImagePath();

    /**
     * Sets the value of the
     * '{@link org.obeonetwork.jarvis.workflow.description.PageDescription#getImagePath
     * <em>Image Path</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Image Path</em>' attribute.
     * @see #getImagePath()
     * @generated
     */
    void setImagePath(String value);

    /**
     * Returns the value of the '<em><b>Description Expression</b></em>'
     * attribute. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Description Expression</em>' attribute isn't
     * clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Description Expression</em>' attribute.
     * @see #setDescriptionExpression(String)
     * @see org.obeonetwork.jarvis.workflow.description.DescriptionPackage#getPageDescription_DescriptionExpression()
     * @model dataType="org.eclipse.sirius.viewpoint.description.InterpretedExpression"
     *        required="true"
     * @generated
     */
    String getDescriptionExpression();

    /**
     * Sets the value of the
     * '{@link org.obeonetwork.jarvis.workflow.description.PageDescription#getDescriptionExpression
     * <em>Description Expression</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Description Expression</em>'
     *            attribute.
     * @see #getDescriptionExpression()
     * @generated
     */
    void setDescriptionExpression(String value);

    /**
     * Returns the value of the '<em><b>Sections</b></em>' containment reference
     * list. The list contents are of type
     * {@link org.obeonetwork.jarvis.workflow.description.SectionDescription}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sections</em>' containment reference list
     * isn't clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Sections</em>' containment reference list.
     * @see org.obeonetwork.jarvis.workflow.description.DescriptionPackage#getPageDescription_Sections()
     * @model containment="true" resolveProxies="true"
     * @generated
     */
    EList<SectionDescription> getSections();

} // PageDescription
