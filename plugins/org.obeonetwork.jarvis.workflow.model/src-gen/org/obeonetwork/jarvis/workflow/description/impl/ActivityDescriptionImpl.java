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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.sirius.viewpoint.description.DocumentedElement;
import org.eclipse.sirius.viewpoint.description.impl.IdentifiedElementImpl;
import org.eclipse.sirius.viewpoint.description.tool.InitialOperation;
import org.obeonetwork.jarvis.workflow.description.ActivityDescription;
import org.obeonetwork.jarvis.workflow.description.DescriptionPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Activity Description</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.obeonetwork.jarvis.workflow.description.impl.ActivityDescriptionImpl#getDocumentation
 * <em>Documentation</em>}</li>
 * <li>{@link org.obeonetwork.jarvis.workflow.description.impl.ActivityDescriptionImpl#getLabelExpression
 * <em>Label Expression</em>}</li>
 * <li>{@link org.obeonetwork.jarvis.workflow.description.impl.ActivityDescriptionImpl#getIconPath
 * <em>Icon Path</em>}</li>
 * <li>{@link org.obeonetwork.jarvis.workflow.description.impl.ActivityDescriptionImpl#getOperation
 * <em>Operation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivityDescriptionImpl extends IdentifiedElementImpl implements ActivityDescription {
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
    protected String documentation = ActivityDescriptionImpl.DOCUMENTATION_EDEFAULT;

    /**
     * The default value of the '{@link #getLabelExpression() <em>Label
     * Expression</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @see #getLabelExpression()
     * @generated
     * @ordered
     */
    protected static final String LABEL_EXPRESSION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLabelExpression() <em>Label
     * Expression</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @see #getLabelExpression()
     * @generated
     * @ordered
     */
    protected String labelExpression = ActivityDescriptionImpl.LABEL_EXPRESSION_EDEFAULT;

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
    protected String iconPath = ActivityDescriptionImpl.ICON_PATH_EDEFAULT;

    /**
     * The cached value of the '{@link #getOperation() <em>Operation</em>}'
     * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getOperation()
     * @generated
     * @ordered
     */
    protected InitialOperation operation;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected ActivityDescriptionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DescriptionPackage.Literals.ACTIVITY_DESCRIPTION;
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
            eNotify(new ENotificationImpl(this, Notification.SET, DescriptionPackage.ACTIVITY_DESCRIPTION__DOCUMENTATION, oldDocumentation, documentation));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String getLabelExpression() {
        return labelExpression;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setLabelExpression(String newLabelExpression) {
        String oldLabelExpression = labelExpression;
        labelExpression = newLabelExpression;
        if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET, DescriptionPackage.ACTIVITY_DESCRIPTION__LABEL_EXPRESSION, oldLabelExpression, labelExpression));
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
            eNotify(new ENotificationImpl(this, Notification.SET, DescriptionPackage.ACTIVITY_DESCRIPTION__ICON_PATH, oldIconPath, iconPath));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public InitialOperation getOperation() {
        if (operation != null && operation.eIsProxy()) {
            InternalEObject oldOperation = (InternalEObject) operation;
            operation = (InitialOperation) eResolveProxy(oldOperation);
            if (operation != oldOperation) {
                InternalEObject newOperation = (InternalEObject) operation;
                NotificationChain msgs = oldOperation.eInverseRemove(this, InternalEObject.EOPPOSITE_FEATURE_BASE - DescriptionPackage.ACTIVITY_DESCRIPTION__OPERATION, null, null);
                if (newOperation.eInternalContainer() == null) {
                    msgs = newOperation.eInverseAdd(this, InternalEObject.EOPPOSITE_FEATURE_BASE - DescriptionPackage.ACTIVITY_DESCRIPTION__OPERATION, null, msgs);
                }
                if (msgs != null) {
                    msgs.dispatch();
                }
                if (eNotificationRequired()) {
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, DescriptionPackage.ACTIVITY_DESCRIPTION__OPERATION, oldOperation, operation));
                }
            }
        }
        return operation;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public InitialOperation basicGetOperation() {
        return operation;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetOperation(InitialOperation newOperation, NotificationChain msgs) {
        InitialOperation oldOperation = operation;
        operation = newOperation;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DescriptionPackage.ACTIVITY_DESCRIPTION__OPERATION, oldOperation, newOperation);
            if (msgs == null) {
                msgs = notification;
            } else {
                msgs.add(notification);
            }
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setOperation(InitialOperation newOperation) {
        if (newOperation != operation) {
            NotificationChain msgs = null;
            if (operation != null) {
                msgs = ((InternalEObject) operation).eInverseRemove(this, InternalEObject.EOPPOSITE_FEATURE_BASE - DescriptionPackage.ACTIVITY_DESCRIPTION__OPERATION, null, msgs);
            }
            if (newOperation != null) {
                msgs = ((InternalEObject) newOperation).eInverseAdd(this, InternalEObject.EOPPOSITE_FEATURE_BASE - DescriptionPackage.ACTIVITY_DESCRIPTION__OPERATION, null, msgs);
            }
            msgs = basicSetOperation(newOperation, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        } else if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET, DescriptionPackage.ACTIVITY_DESCRIPTION__OPERATION, newOperation, newOperation));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case DescriptionPackage.ACTIVITY_DESCRIPTION__OPERATION:
            return basicSetOperation(null, msgs);
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
        case DescriptionPackage.ACTIVITY_DESCRIPTION__DOCUMENTATION:
            return getDocumentation();
        case DescriptionPackage.ACTIVITY_DESCRIPTION__LABEL_EXPRESSION:
            return getLabelExpression();
        case DescriptionPackage.ACTIVITY_DESCRIPTION__ICON_PATH:
            return getIconPath();
        case DescriptionPackage.ACTIVITY_DESCRIPTION__OPERATION:
            if (resolve) {
                return getOperation();
            }
            return basicGetOperation();
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
        case DescriptionPackage.ACTIVITY_DESCRIPTION__DOCUMENTATION:
            setDocumentation((String) newValue);
            return;
        case DescriptionPackage.ACTIVITY_DESCRIPTION__LABEL_EXPRESSION:
            setLabelExpression((String) newValue);
            return;
        case DescriptionPackage.ACTIVITY_DESCRIPTION__ICON_PATH:
            setIconPath((String) newValue);
            return;
        case DescriptionPackage.ACTIVITY_DESCRIPTION__OPERATION:
            setOperation((InitialOperation) newValue);
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
        case DescriptionPackage.ACTIVITY_DESCRIPTION__DOCUMENTATION:
            setDocumentation(ActivityDescriptionImpl.DOCUMENTATION_EDEFAULT);
            return;
        case DescriptionPackage.ACTIVITY_DESCRIPTION__LABEL_EXPRESSION:
            setLabelExpression(ActivityDescriptionImpl.LABEL_EXPRESSION_EDEFAULT);
            return;
        case DescriptionPackage.ACTIVITY_DESCRIPTION__ICON_PATH:
            setIconPath(ActivityDescriptionImpl.ICON_PATH_EDEFAULT);
            return;
        case DescriptionPackage.ACTIVITY_DESCRIPTION__OPERATION:
            setOperation((InitialOperation) null);
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
        case DescriptionPackage.ACTIVITY_DESCRIPTION__DOCUMENTATION:
            return ActivityDescriptionImpl.DOCUMENTATION_EDEFAULT == null ? documentation != null : !ActivityDescriptionImpl.DOCUMENTATION_EDEFAULT.equals(documentation);
        case DescriptionPackage.ACTIVITY_DESCRIPTION__LABEL_EXPRESSION:
            return ActivityDescriptionImpl.LABEL_EXPRESSION_EDEFAULT == null ? labelExpression != null : !ActivityDescriptionImpl.LABEL_EXPRESSION_EDEFAULT.equals(labelExpression);
        case DescriptionPackage.ACTIVITY_DESCRIPTION__ICON_PATH:
            return ActivityDescriptionImpl.ICON_PATH_EDEFAULT == null ? iconPath != null : !ActivityDescriptionImpl.ICON_PATH_EDEFAULT.equals(iconPath);
        case DescriptionPackage.ACTIVITY_DESCRIPTION__OPERATION:
            return operation != null;
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
            case DescriptionPackage.ACTIVITY_DESCRIPTION__DOCUMENTATION:
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
                return DescriptionPackage.ACTIVITY_DESCRIPTION__DOCUMENTATION;
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
        result.append(", labelExpression: "); //$NON-NLS-1$
        result.append(labelExpression);
        result.append(", iconPath: "); //$NON-NLS-1$
        result.append(iconPath);
        result.append(')');
        return result.toString();
    }

} // ActivityDescriptionImpl
