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
package org.obeonetwork.jarvis.workflow.description.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.sirius.viewpoint.description.DocumentedElement;
import org.eclipse.sirius.viewpoint.description.impl.IdentifiedElementImpl;
import org.obeonetwork.jarvis.workflow.description.DescriptionPackage;
import org.obeonetwork.jarvis.workflow.description.PageDescription;
import org.obeonetwork.jarvis.workflow.description.SectionDescription;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Page
 * Description</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.obeonetwork.jarvis.workflow.description.impl.PageDescriptionImpl#getDocumentation
 * <em>Documentation</em>}</li>
 * <li>{@link org.obeonetwork.jarvis.workflow.description.impl.PageDescriptionImpl#getTitleExpression
 * <em>Title Expression</em>}</li>
 * <li>{@link org.obeonetwork.jarvis.workflow.description.impl.PageDescriptionImpl#getImagePath
 * <em>Image Path</em>}</li>
 * <li>{@link org.obeonetwork.jarvis.workflow.description.impl.PageDescriptionImpl#getDescriptionExpression
 * <em>Description Expression</em>}</li>
 * <li>{@link org.obeonetwork.jarvis.workflow.description.impl.PageDescriptionImpl#getSections
 * <em>Sections</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PageDescriptionImpl extends IdentifiedElementImpl implements PageDescription {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static final String copyright = "Copyright (c) 2017 Obeo.\r\nAll rights reserved. This program and the accompanying materials\r\nare made available under the terms of the Eclipse Public License v1.0\r\nwhich accompanies this distribution, and is available at\r\nhttp://www.eclipse.org/legal/epl-v10.html\r\n\r\nContributors:\r\n   Obeo - initial API and implementation\r\n"; //$NON-NLS-1$

    /**
     * The default value of the '{@link #getDocumentation()
     * <em>Documentation</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @see #getDocumentation()
     * @generated
     * @ordered
     */
    protected static final String DOCUMENTATION_EDEFAULT = ""; //$NON-NLS-1$

    /**
     * The cached value of the '{@link #getDocumentation()
     * <em>Documentation</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @see #getDocumentation()
     * @generated
     * @ordered
     */
    protected String documentation = PageDescriptionImpl.DOCUMENTATION_EDEFAULT;

    /**
     * The default value of the '{@link #getTitleExpression() <em>Title
     * Expression</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @see #getTitleExpression()
     * @generated
     * @ordered
     */
    protected static final String TITLE_EXPRESSION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTitleExpression() <em>Title
     * Expression</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @see #getTitleExpression()
     * @generated
     * @ordered
     */
    protected String titleExpression = PageDescriptionImpl.TITLE_EXPRESSION_EDEFAULT;

    /**
     * The default value of the '{@link #getImagePath() <em>Image Path</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getImagePath()
     * @generated
     * @ordered
     */
    protected static final String IMAGE_PATH_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getImagePath() <em>Image Path</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getImagePath()
     * @generated
     * @ordered
     */
    protected String imagePath = PageDescriptionImpl.IMAGE_PATH_EDEFAULT;

    /**
     * The default value of the '{@link #getDescriptionExpression()
     * <em>Description Expression</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @see #getDescriptionExpression()
     * @generated
     * @ordered
     */
    protected static final String DESCRIPTION_EXPRESSION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDescriptionExpression()
     * <em>Description Expression</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @see #getDescriptionExpression()
     * @generated
     * @ordered
     */
    protected String descriptionExpression = PageDescriptionImpl.DESCRIPTION_EXPRESSION_EDEFAULT;

    /**
     * The cached value of the '{@link #getSections() <em>Sections</em>}'
     * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getSections()
     * @generated
     * @ordered
     */
    protected EList<SectionDescription> sections;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected PageDescriptionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DescriptionPackage.Literals.PAGE_DESCRIPTION;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String getDocumentation() {
        return documentation;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setDocumentation(String newDocumentation) {
        String oldDocumentation = documentation;
        documentation = newDocumentation;
        if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET, DescriptionPackage.PAGE_DESCRIPTION__DOCUMENTATION, oldDocumentation, documentation));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String getTitleExpression() {
        return titleExpression;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setTitleExpression(String newTitleExpression) {
        String oldTitleExpression = titleExpression;
        titleExpression = newTitleExpression;
        if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET, DescriptionPackage.PAGE_DESCRIPTION__TITLE_EXPRESSION, oldTitleExpression, titleExpression));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String getImagePath() {
        return imagePath;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setImagePath(String newImagePath) {
        String oldImagePath = imagePath;
        imagePath = newImagePath;
        if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET, DescriptionPackage.PAGE_DESCRIPTION__IMAGE_PATH, oldImagePath, imagePath));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String getDescriptionExpression() {
        return descriptionExpression;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setDescriptionExpression(String newDescriptionExpression) {
        String oldDescriptionExpression = descriptionExpression;
        descriptionExpression = newDescriptionExpression;
        if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET, DescriptionPackage.PAGE_DESCRIPTION__DESCRIPTION_EXPRESSION, oldDescriptionExpression, descriptionExpression));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<SectionDescription> getSections() {
        if (sections == null) {
            sections = new EObjectContainmentEList.Resolving<>(SectionDescription.class, this, DescriptionPackage.PAGE_DESCRIPTION__SECTIONS);
        }
        return sections;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case DescriptionPackage.PAGE_DESCRIPTION__SECTIONS:
            return ((InternalEList<?>) getSections()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case DescriptionPackage.PAGE_DESCRIPTION__DOCUMENTATION:
            return getDocumentation();
        case DescriptionPackage.PAGE_DESCRIPTION__TITLE_EXPRESSION:
            return getTitleExpression();
        case DescriptionPackage.PAGE_DESCRIPTION__IMAGE_PATH:
            return getImagePath();
        case DescriptionPackage.PAGE_DESCRIPTION__DESCRIPTION_EXPRESSION:
            return getDescriptionExpression();
        case DescriptionPackage.PAGE_DESCRIPTION__SECTIONS:
            return getSections();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
        case DescriptionPackage.PAGE_DESCRIPTION__DOCUMENTATION:
            setDocumentation((String) newValue);
            return;
        case DescriptionPackage.PAGE_DESCRIPTION__TITLE_EXPRESSION:
            setTitleExpression((String) newValue);
            return;
        case DescriptionPackage.PAGE_DESCRIPTION__IMAGE_PATH:
            setImagePath((String) newValue);
            return;
        case DescriptionPackage.PAGE_DESCRIPTION__DESCRIPTION_EXPRESSION:
            setDescriptionExpression((String) newValue);
            return;
        case DescriptionPackage.PAGE_DESCRIPTION__SECTIONS:
            getSections().clear();
            getSections().addAll((Collection<? extends SectionDescription>) newValue);
            return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
        case DescriptionPackage.PAGE_DESCRIPTION__DOCUMENTATION:
            setDocumentation(PageDescriptionImpl.DOCUMENTATION_EDEFAULT);
            return;
        case DescriptionPackage.PAGE_DESCRIPTION__TITLE_EXPRESSION:
            setTitleExpression(PageDescriptionImpl.TITLE_EXPRESSION_EDEFAULT);
            return;
        case DescriptionPackage.PAGE_DESCRIPTION__IMAGE_PATH:
            setImagePath(PageDescriptionImpl.IMAGE_PATH_EDEFAULT);
            return;
        case DescriptionPackage.PAGE_DESCRIPTION__DESCRIPTION_EXPRESSION:
            setDescriptionExpression(PageDescriptionImpl.DESCRIPTION_EXPRESSION_EDEFAULT);
            return;
        case DescriptionPackage.PAGE_DESCRIPTION__SECTIONS:
            getSections().clear();
            return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
        case DescriptionPackage.PAGE_DESCRIPTION__DOCUMENTATION:
            return PageDescriptionImpl.DOCUMENTATION_EDEFAULT == null ? documentation != null : !PageDescriptionImpl.DOCUMENTATION_EDEFAULT.equals(documentation);
        case DescriptionPackage.PAGE_DESCRIPTION__TITLE_EXPRESSION:
            return PageDescriptionImpl.TITLE_EXPRESSION_EDEFAULT == null ? titleExpression != null : !PageDescriptionImpl.TITLE_EXPRESSION_EDEFAULT.equals(titleExpression);
        case DescriptionPackage.PAGE_DESCRIPTION__IMAGE_PATH:
            return PageDescriptionImpl.IMAGE_PATH_EDEFAULT == null ? imagePath != null : !PageDescriptionImpl.IMAGE_PATH_EDEFAULT.equals(imagePath);
        case DescriptionPackage.PAGE_DESCRIPTION__DESCRIPTION_EXPRESSION:
            return PageDescriptionImpl.DESCRIPTION_EXPRESSION_EDEFAULT == null ? descriptionExpression != null : !PageDescriptionImpl.DESCRIPTION_EXPRESSION_EDEFAULT.equals(descriptionExpression);
        case DescriptionPackage.PAGE_DESCRIPTION__SECTIONS:
            return sections != null && !sections.isEmpty();
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
        if (baseClass == DocumentedElement.class) {
            switch (derivedFeatureID) {
            case DescriptionPackage.PAGE_DESCRIPTION__DOCUMENTATION:
                return org.eclipse.sirius.viewpoint.description.DescriptionPackage.DOCUMENTED_ELEMENT__DOCUMENTATION;
            default:
                return -1;
            }
        }
        return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
        if (baseClass == DocumentedElement.class) {
            switch (baseFeatureID) {
            case org.eclipse.sirius.viewpoint.description.DescriptionPackage.DOCUMENTED_ELEMENT__DOCUMENTATION:
                return DescriptionPackage.PAGE_DESCRIPTION__DOCUMENTATION;
            default:
                return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) {
            return super.toString();
        }

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (documentation: "); //$NON-NLS-1$
        result.append(documentation);
        result.append(", titleExpression: "); //$NON-NLS-1$
        result.append(titleExpression);
        result.append(", imagePath: "); //$NON-NLS-1$
        result.append(imagePath);
        result.append(", descriptionExpression: "); //$NON-NLS-1$
        result.append(descriptionExpression);
        result.append(')');
        return result.toString();
    }

} // PageDescriptionImpl
