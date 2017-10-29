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
import org.obeonetwork.jarvis.workflow.Activity;
import org.obeonetwork.jarvis.workflow.Section;
import org.obeonetwork.jarvis.workflow.WorkflowPackage;
import org.obeonetwork.jarvis.workflow.description.SectionDescription;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Section</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.obeonetwork.jarvis.workflow.impl.SectionImpl#getTitle
 * <em>Title</em>}</li>
 * <li>{@link org.obeonetwork.jarvis.workflow.impl.SectionImpl#getDescriptionText
 * <em>Description Text</em>}</li>
 * <li>{@link org.obeonetwork.jarvis.workflow.impl.SectionImpl#getIconPath
 * <em>Icon Path</em>}</li>
 * <li>{@link org.obeonetwork.jarvis.workflow.impl.SectionImpl#getDescription
 * <em>Description</em>}</li>
 * <li>{@link org.obeonetwork.jarvis.workflow.impl.SectionImpl#getOwnedActivities
 * <em>Owned Activities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SectionImpl extends MinimalEObjectImpl.Container implements Section {
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
    protected String title = SectionImpl.TITLE_EDEFAULT;

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
    protected String descriptionText = SectionImpl.DESCRIPTION_TEXT_EDEFAULT;

    /**
     * The default value of the '{@link #getIconPath() <em>Icon Path</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getIconPath()
     * @generated
     * @ordered
     */
    protected static final String ICON_PATH_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIconPath() <em>Icon Path</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getIconPath()
     * @generated
     * @ordered
     */
    protected String iconPath = SectionImpl.ICON_PATH_EDEFAULT;

    /**
     * The cached value of the '{@link #getDescription() <em>Description</em>}'
     * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getDescription()
     * @generated
     * @ordered
     */
    protected SectionDescription description;

    /**
     * The cached value of the '{@link #getOwnedActivities() <em>Owned
     * Activities</em>}' containment reference list. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getOwnedActivities()
     * @generated
     * @ordered
     */
    protected EList<Activity> ownedActivities;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected SectionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return WorkflowPackage.Literals.SECTION;
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
            eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.SECTION__TITLE, oldTitle, title));
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
            eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.SECTION__DESCRIPTION_TEXT, oldDescriptionText, descriptionText));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String getIconPath() {
        return iconPath;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setIconPath(String newIconPath) {
        String oldIconPath = iconPath;
        iconPath = newIconPath;
        if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.SECTION__ICON_PATH, oldIconPath, iconPath));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public SectionDescription getDescription() {
        if (description != null && description.eIsProxy()) {
            InternalEObject oldDescription = (InternalEObject) description;
            description = (SectionDescription) eResolveProxy(oldDescription);
            if (description != oldDescription) {
                if (eNotificationRequired()) {
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkflowPackage.SECTION__DESCRIPTION, oldDescription, description));
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
    public SectionDescription basicGetDescription() {
        return description;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setDescription(SectionDescription newDescription) {
        SectionDescription oldDescription = description;
        description = newDescription;
        if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.SECTION__DESCRIPTION, oldDescription, description));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<Activity> getOwnedActivities() {
        if (ownedActivities == null) {
            ownedActivities = new EObjectContainmentEList.Resolving<>(Activity.class, this, WorkflowPackage.SECTION__OWNED_ACTIVITIES);
        }
        return ownedActivities;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case WorkflowPackage.SECTION__OWNED_ACTIVITIES:
            return ((InternalEList<?>) getOwnedActivities()).basicRemove(otherEnd, msgs);
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
        case WorkflowPackage.SECTION__TITLE:
            return getTitle();
        case WorkflowPackage.SECTION__DESCRIPTION_TEXT:
            return getDescriptionText();
        case WorkflowPackage.SECTION__ICON_PATH:
            return getIconPath();
        case WorkflowPackage.SECTION__DESCRIPTION:
            if (resolve) {
                return getDescription();
            }
            return basicGetDescription();
        case WorkflowPackage.SECTION__OWNED_ACTIVITIES:
            return getOwnedActivities();
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
        case WorkflowPackage.SECTION__TITLE:
            setTitle((String) newValue);
            return;
        case WorkflowPackage.SECTION__DESCRIPTION_TEXT:
            setDescriptionText((String) newValue);
            return;
        case WorkflowPackage.SECTION__ICON_PATH:
            setIconPath((String) newValue);
            return;
        case WorkflowPackage.SECTION__DESCRIPTION:
            setDescription((SectionDescription) newValue);
            return;
        case WorkflowPackage.SECTION__OWNED_ACTIVITIES:
            getOwnedActivities().clear();
            getOwnedActivities().addAll((Collection<? extends Activity>) newValue);
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
        case WorkflowPackage.SECTION__TITLE:
            setTitle(SectionImpl.TITLE_EDEFAULT);
            return;
        case WorkflowPackage.SECTION__DESCRIPTION_TEXT:
            setDescriptionText(SectionImpl.DESCRIPTION_TEXT_EDEFAULT);
            return;
        case WorkflowPackage.SECTION__ICON_PATH:
            setIconPath(SectionImpl.ICON_PATH_EDEFAULT);
            return;
        case WorkflowPackage.SECTION__DESCRIPTION:
            setDescription((SectionDescription) null);
            return;
        case WorkflowPackage.SECTION__OWNED_ACTIVITIES:
            getOwnedActivities().clear();
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
        case WorkflowPackage.SECTION__TITLE:
            return SectionImpl.TITLE_EDEFAULT == null ? title != null : !SectionImpl.TITLE_EDEFAULT.equals(title);
        case WorkflowPackage.SECTION__DESCRIPTION_TEXT:
            return SectionImpl.DESCRIPTION_TEXT_EDEFAULT == null ? descriptionText != null : !SectionImpl.DESCRIPTION_TEXT_EDEFAULT.equals(descriptionText);
        case WorkflowPackage.SECTION__ICON_PATH:
            return SectionImpl.ICON_PATH_EDEFAULT == null ? iconPath != null : !SectionImpl.ICON_PATH_EDEFAULT.equals(iconPath);
        case WorkflowPackage.SECTION__DESCRIPTION:
            return description != null;
        case WorkflowPackage.SECTION__OWNED_ACTIVITIES:
            return ownedActivities != null && !ownedActivities.isEmpty();
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
        result.append(", iconPath: "); //$NON-NLS-1$
        result.append(iconPath);
        result.append(')');
        return result.toString();
    }

} // SectionImpl
