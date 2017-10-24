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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.obeonetwork.jarvis.workflow.Activity;
import org.obeonetwork.jarvis.workflow.WorkflowPackage;
import org.obeonetwork.jarvis.workflow.description.ActivityDescription;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Activity</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.obeonetwork.jarvis.workflow.impl.ActivityImpl#getLabel
 * <em>Label</em>}</li>
 * <li>{@link org.obeonetwork.jarvis.workflow.impl.ActivityImpl#getIconPath
 * <em>Icon Path</em>}</li>
 * <li>{@link org.obeonetwork.jarvis.workflow.impl.ActivityImpl#getDescription
 * <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivityImpl extends MinimalEObjectImpl.Container implements Activity {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static final String copyright = "Copyright (c) 2017 Obeo.\r\nAll rights reserved. This program and the accompanying materials\r\nare made available under the terms of the Eclipse Public License v1.0\r\nwhich accompanies this distribution, and is available at\r\nhttp://www.eclipse.org/legal/epl-v10.html\r\n\r\nContributors:\r\n   Obeo - initial API and implementation\r\n"; //$NON-NLS-1$

    /**
     * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getLabel()
     * @generated
     * @ordered
     */
    protected static final String LABEL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getLabel()
     * @generated
     * @ordered
     */
    protected String label = ActivityImpl.LABEL_EDEFAULT;

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
    protected String iconPath = ActivityImpl.ICON_PATH_EDEFAULT;

    /**
     * The cached value of the '{@link #getDescription() <em>Description</em>}'
     * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getDescription()
     * @generated
     * @ordered
     */
    protected ActivityDescription description;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected ActivityImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return WorkflowPackage.Literals.ACTIVITY;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String getLabel() {
        return label;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setLabel(String newLabel) {
        String oldLabel = label;
        label = newLabel;
        if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.ACTIVITY__LABEL, oldLabel, label));
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
            eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.ACTIVITY__ICON_PATH, oldIconPath, iconPath));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ActivityDescription getDescription() {
        if (description != null && description.eIsProxy()) {
            InternalEObject oldDescription = (InternalEObject) description;
            description = (ActivityDescription) eResolveProxy(oldDescription);
            if (description != oldDescription) {
                if (eNotificationRequired()) {
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkflowPackage.ACTIVITY__DESCRIPTION, oldDescription, description));
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
    public ActivityDescription basicGetDescription() {
        return description;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setDescription(ActivityDescription newDescription) {
        ActivityDescription oldDescription = description;
        description = newDescription;
        if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.ACTIVITY__DESCRIPTION, oldDescription, description));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case WorkflowPackage.ACTIVITY__LABEL:
            return getLabel();
        case WorkflowPackage.ACTIVITY__ICON_PATH:
            return getIconPath();
        case WorkflowPackage.ACTIVITY__DESCRIPTION:
            if (resolve) {
                return getDescription();
            }
            return basicGetDescription();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
        case WorkflowPackage.ACTIVITY__LABEL:
            setLabel((String) newValue);
            return;
        case WorkflowPackage.ACTIVITY__ICON_PATH:
            setIconPath((String) newValue);
            return;
        case WorkflowPackage.ACTIVITY__DESCRIPTION:
            setDescription((ActivityDescription) newValue);
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
        case WorkflowPackage.ACTIVITY__LABEL:
            setLabel(ActivityImpl.LABEL_EDEFAULT);
            return;
        case WorkflowPackage.ACTIVITY__ICON_PATH:
            setIconPath(ActivityImpl.ICON_PATH_EDEFAULT);
            return;
        case WorkflowPackage.ACTIVITY__DESCRIPTION:
            setDescription((ActivityDescription) null);
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
        case WorkflowPackage.ACTIVITY__LABEL:
            return ActivityImpl.LABEL_EDEFAULT == null ? label != null : !ActivityImpl.LABEL_EDEFAULT.equals(label);
        case WorkflowPackage.ACTIVITY__ICON_PATH:
            return ActivityImpl.ICON_PATH_EDEFAULT == null ? iconPath != null : !ActivityImpl.ICON_PATH_EDEFAULT.equals(iconPath);
        case WorkflowPackage.ACTIVITY__DESCRIPTION:
            return description != null;
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
        result.append(" (label: "); //$NON-NLS-1$
        result.append(label);
        result.append(", iconPath: "); //$NON-NLS-1$
        result.append(iconPath);
        result.append(')');
        return result.toString();
    }

} // ActivityImpl
