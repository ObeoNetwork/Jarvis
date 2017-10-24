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
package org.obeonetwork.jarvis.workflow.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.obeonetwork.jarvis.workflow.Page;
import org.obeonetwork.jarvis.workflow.Section;
import org.obeonetwork.jarvis.workflow.WorkflowPackage;
import org.obeonetwork.jarvis.workflow.description.PageDescription;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Page</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.obeonetwork.jarvis.workflow.impl.PageImpl#getTitle
 * <em>Title</em>}</li>
 * <li>{@link org.obeonetwork.jarvis.workflow.impl.PageImpl#getDescriptionText
 * <em>Description Text</em>}</li>
 * <li>{@link org.obeonetwork.jarvis.workflow.impl.PageImpl#getImagePath
 * <em>Image Path</em>}</li>
 * <li>{@link org.obeonetwork.jarvis.workflow.impl.PageImpl#getDescription
 * <em>Description</em>}</li>
 * <li>{@link org.obeonetwork.jarvis.workflow.impl.PageImpl#getOwnedSections
 * <em>Owned Sections</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PageImpl extends MinimalEObjectImpl.Container implements Page {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static final String copyright = "Copyright (c) 2017 Obeo.\r\nAll rights reserved. This program and the accompanying materials\r\nare made available under the terms of the Eclipse Public License v1.0\r\nwhich accompanies this distribution, and is available at\r\nhttp://www.eclipse.org/legal/epl-v10.html\r\n\r\nContributors:\r\n   Obeo - initial API and implementation\r\n"; //$NON-NLS-1$

    /**
     * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getTitle()
     * @generated
     * @ordered
     */
    protected static final String TITLE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getTitle()
     * @generated
     * @ordered
     */
    protected String title = PageImpl.TITLE_EDEFAULT;

    /**
     * The default value of the '{@link #getDescriptionText() <em>Description
     * Text</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getDescriptionText()
     * @generated
     * @ordered
     */
    protected static final String DESCRIPTION_TEXT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDescriptionText() <em>Description
     * Text</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getDescriptionText()
     * @generated
     * @ordered
     */
    protected String descriptionText = PageImpl.DESCRIPTION_TEXT_EDEFAULT;

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
    protected String imagePath = PageImpl.IMAGE_PATH_EDEFAULT;

    /**
     * The cached value of the '{@link #getDescription() <em>Description</em>}'
     * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getDescription()
     * @generated
     * @ordered
     */
    protected PageDescription description;

    /**
     * The cached value of the '{@link #getOwnedSections() <em>Owned
     * Sections</em>}' containment reference list. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @see #getOwnedSections()
     * @generated
     * @ordered
     */
    protected EList<Section> ownedSections;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected PageImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return WorkflowPackage.Literals.PAGE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String getTitle() {
        return title;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setTitle(String newTitle) {
        String oldTitle = title;
        title = newTitle;
        if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.PAGE__TITLE, oldTitle, title));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String getDescriptionText() {
        return descriptionText;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setDescriptionText(String newDescriptionText) {
        String oldDescriptionText = descriptionText;
        descriptionText = newDescriptionText;
        if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.PAGE__DESCRIPTION_TEXT, oldDescriptionText, descriptionText));
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
            eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.PAGE__IMAGE_PATH, oldImagePath, imagePath));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public PageDescription getDescription() {
        if (description != null && description.eIsProxy()) {
            InternalEObject oldDescription = (InternalEObject) description;
            description = (PageDescription) eResolveProxy(oldDescription);
            if (description != oldDescription) {
                if (eNotificationRequired()) {
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkflowPackage.PAGE__DESCRIPTION, oldDescription, description));
                }
            }
        }
        return description;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public PageDescription basicGetDescription() {
        return description;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setDescription(PageDescription newDescription) {
        PageDescription oldDescription = description;
        description = newDescription;
        if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.PAGE__DESCRIPTION, oldDescription, description));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<Section> getOwnedSections() {
        if (ownedSections == null) {
            ownedSections = new EObjectContainmentEList.Resolving<>(Section.class, this, WorkflowPackage.PAGE__OWNED_SECTIONS);
        }
        return ownedSections;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case WorkflowPackage.PAGE__OWNED_SECTIONS:
            return ((InternalEList<?>) getOwnedSections()).basicRemove(otherEnd, msgs);
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
        case WorkflowPackage.PAGE__TITLE:
            return getTitle();
        case WorkflowPackage.PAGE__DESCRIPTION_TEXT:
            return getDescriptionText();
        case WorkflowPackage.PAGE__IMAGE_PATH:
            return getImagePath();
        case WorkflowPackage.PAGE__DESCRIPTION:
            if (resolve) {
                return getDescription();
            }
            return basicGetDescription();
        case WorkflowPackage.PAGE__OWNED_SECTIONS:
            return getOwnedSections();
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
        case WorkflowPackage.PAGE__TITLE:
            setTitle((String) newValue);
            return;
        case WorkflowPackage.PAGE__DESCRIPTION_TEXT:
            setDescriptionText((String) newValue);
            return;
        case WorkflowPackage.PAGE__IMAGE_PATH:
            setImagePath((String) newValue);
            return;
        case WorkflowPackage.PAGE__DESCRIPTION:
            setDescription((PageDescription) newValue);
            return;
        case WorkflowPackage.PAGE__OWNED_SECTIONS:
            getOwnedSections().clear();
            getOwnedSections().addAll((Collection<? extends Section>) newValue);
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
        case WorkflowPackage.PAGE__TITLE:
            setTitle(PageImpl.TITLE_EDEFAULT);
            return;
        case WorkflowPackage.PAGE__DESCRIPTION_TEXT:
            setDescriptionText(PageImpl.DESCRIPTION_TEXT_EDEFAULT);
            return;
        case WorkflowPackage.PAGE__IMAGE_PATH:
            setImagePath(PageImpl.IMAGE_PATH_EDEFAULT);
            return;
        case WorkflowPackage.PAGE__DESCRIPTION:
            setDescription((PageDescription) null);
            return;
        case WorkflowPackage.PAGE__OWNED_SECTIONS:
            getOwnedSections().clear();
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
        case WorkflowPackage.PAGE__TITLE:
            return PageImpl.TITLE_EDEFAULT == null ? title != null : !PageImpl.TITLE_EDEFAULT.equals(title);
        case WorkflowPackage.PAGE__DESCRIPTION_TEXT:
            return PageImpl.DESCRIPTION_TEXT_EDEFAULT == null ? descriptionText != null : !PageImpl.DESCRIPTION_TEXT_EDEFAULT.equals(descriptionText);
        case WorkflowPackage.PAGE__IMAGE_PATH:
            return PageImpl.IMAGE_PATH_EDEFAULT == null ? imagePath != null : !PageImpl.IMAGE_PATH_EDEFAULT.equals(imagePath);
        case WorkflowPackage.PAGE__DESCRIPTION:
            return description != null;
        case WorkflowPackage.PAGE__OWNED_SECTIONS:
            return ownedSections != null && !ownedSections.isEmpty();
        }
        return super.eIsSet(featureID);
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
        result.append(" (title: "); //$NON-NLS-1$
        result.append(title);
        result.append(", descriptionText: "); //$NON-NLS-1$
        result.append(descriptionText);
        result.append(", imagePath: "); //$NON-NLS-1$
        result.append(imagePath);
        result.append(')');
        return result.toString();
    }

} // PageImpl
