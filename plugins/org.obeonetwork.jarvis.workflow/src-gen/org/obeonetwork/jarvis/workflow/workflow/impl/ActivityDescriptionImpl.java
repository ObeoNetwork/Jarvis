/**
 *  Copyright (c) 2017 Obeo.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v2.0
 *  which accompanies this distribution, and is available at
 *  https://www.eclipse.org/legal/epl-2.0/
 * 
 *  Contributors:
 *     Obeo - initial API and implementation
 * 
 */
package org.obeonetwork.jarvis.workflow.workflow.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.sirius.viewpoint.description.DescriptionPackage;
import org.eclipse.sirius.viewpoint.description.DocumentedElement;

import org.eclipse.sirius.viewpoint.description.impl.IdentifiedElementImpl;

import org.eclipse.sirius.viewpoint.description.tool.InitialOperation;

import org.obeonetwork.jarvis.workflow.workflow.ActivityDescription;
import org.obeonetwork.jarvis.workflow.workflow.WorkflowPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.jarvis.workflow.workflow.impl.ActivityDescriptionImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.obeonetwork.jarvis.workflow.workflow.impl.ActivityDescriptionImpl#getLabelExpression <em>Label Expression</em>}</li>
 *   <li>{@link org.obeonetwork.jarvis.workflow.workflow.impl.ActivityDescriptionImpl#getImagePath <em>Image Path</em>}</li>
 *   <li>{@link org.obeonetwork.jarvis.workflow.workflow.impl.ActivityDescriptionImpl#getOperation <em>Operation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivityDescriptionImpl extends IdentifiedElementImpl implements ActivityDescription {
    /**
     * The default value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDocumentation()
     * @generated
     * @ordered
     */
    protected static final String DOCUMENTATION_EDEFAULT = "";

    /**
     * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDocumentation()
     * @generated
     * @ordered
     */
    protected String documentation = DOCUMENTATION_EDEFAULT;

    /**
     * The default value of the '{@link #getLabelExpression() <em>Label Expression</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLabelExpression()
     * @generated
     * @ordered
     */
    protected static final String LABEL_EXPRESSION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLabelExpression() <em>Label Expression</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLabelExpression()
     * @generated
     * @ordered
     */
    protected String labelExpression = LABEL_EXPRESSION_EDEFAULT;

    /**
     * The default value of the '{@link #getImagePath() <em>Image Path</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getImagePath()
     * @generated
     * @ordered
     */
    protected static final String IMAGE_PATH_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getImagePath() <em>Image Path</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getImagePath()
     * @generated
     * @ordered
     */
    protected String imagePath = IMAGE_PATH_EDEFAULT;

    /**
     * The cached value of the '{@link #getOperation() <em>Operation</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOperation()
     * @generated
     * @ordered
     */
    protected InitialOperation operation;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ActivityDescriptionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return WorkflowPackage.Literals.ACTIVITY_DESCRIPTION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getDocumentation() {
        return documentation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDocumentation(String newDocumentation) {
        String oldDocumentation = documentation;
        documentation = newDocumentation;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.ACTIVITY_DESCRIPTION__DOCUMENTATION, oldDocumentation, documentation));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getLabelExpression() {
        return labelExpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLabelExpression(String newLabelExpression) {
        String oldLabelExpression = labelExpression;
        labelExpression = newLabelExpression;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.ACTIVITY_DESCRIPTION__LABEL_EXPRESSION, oldLabelExpression, labelExpression));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getImagePath() {
        return imagePath;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setImagePath(String newImagePath) {
        String oldImagePath = imagePath;
        imagePath = newImagePath;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.ACTIVITY_DESCRIPTION__IMAGE_PATH, oldImagePath, imagePath));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InitialOperation getOperation() {
        return operation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetOperation(InitialOperation newOperation, NotificationChain msgs) {
        InitialOperation oldOperation = operation;
        operation = newOperation;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WorkflowPackage.ACTIVITY_DESCRIPTION__OPERATION, oldOperation, newOperation);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOperation(InitialOperation newOperation) {
        if (newOperation != operation) {
            NotificationChain msgs = null;
            if (operation != null)
                msgs = ((InternalEObject)operation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WorkflowPackage.ACTIVITY_DESCRIPTION__OPERATION, null, msgs);
            if (newOperation != null)
                msgs = ((InternalEObject)newOperation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WorkflowPackage.ACTIVITY_DESCRIPTION__OPERATION, null, msgs);
            msgs = basicSetOperation(newOperation, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.ACTIVITY_DESCRIPTION__OPERATION, newOperation, newOperation));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case WorkflowPackage.ACTIVITY_DESCRIPTION__OPERATION:
                return basicSetOperation(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case WorkflowPackage.ACTIVITY_DESCRIPTION__DOCUMENTATION:
                return getDocumentation();
            case WorkflowPackage.ACTIVITY_DESCRIPTION__LABEL_EXPRESSION:
                return getLabelExpression();
            case WorkflowPackage.ACTIVITY_DESCRIPTION__IMAGE_PATH:
                return getImagePath();
            case WorkflowPackage.ACTIVITY_DESCRIPTION__OPERATION:
                return getOperation();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case WorkflowPackage.ACTIVITY_DESCRIPTION__DOCUMENTATION:
                setDocumentation((String)newValue);
                return;
            case WorkflowPackage.ACTIVITY_DESCRIPTION__LABEL_EXPRESSION:
                setLabelExpression((String)newValue);
                return;
            case WorkflowPackage.ACTIVITY_DESCRIPTION__IMAGE_PATH:
                setImagePath((String)newValue);
                return;
            case WorkflowPackage.ACTIVITY_DESCRIPTION__OPERATION:
                setOperation((InitialOperation)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case WorkflowPackage.ACTIVITY_DESCRIPTION__DOCUMENTATION:
                setDocumentation(DOCUMENTATION_EDEFAULT);
                return;
            case WorkflowPackage.ACTIVITY_DESCRIPTION__LABEL_EXPRESSION:
                setLabelExpression(LABEL_EXPRESSION_EDEFAULT);
                return;
            case WorkflowPackage.ACTIVITY_DESCRIPTION__IMAGE_PATH:
                setImagePath(IMAGE_PATH_EDEFAULT);
                return;
            case WorkflowPackage.ACTIVITY_DESCRIPTION__OPERATION:
                setOperation((InitialOperation)null);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case WorkflowPackage.ACTIVITY_DESCRIPTION__DOCUMENTATION:
                return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
            case WorkflowPackage.ACTIVITY_DESCRIPTION__LABEL_EXPRESSION:
                return LABEL_EXPRESSION_EDEFAULT == null ? labelExpression != null : !LABEL_EXPRESSION_EDEFAULT.equals(labelExpression);
            case WorkflowPackage.ACTIVITY_DESCRIPTION__IMAGE_PATH:
                return IMAGE_PATH_EDEFAULT == null ? imagePath != null : !IMAGE_PATH_EDEFAULT.equals(imagePath);
            case WorkflowPackage.ACTIVITY_DESCRIPTION__OPERATION:
                return operation != null;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
        if (baseClass == DocumentedElement.class) {
            switch (derivedFeatureID) {
                case WorkflowPackage.ACTIVITY_DESCRIPTION__DOCUMENTATION: return DescriptionPackage.DOCUMENTED_ELEMENT__DOCUMENTATION;
                default: return -1;
            }
        }
        return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
        if (baseClass == DocumentedElement.class) {
            switch (baseFeatureID) {
                case DescriptionPackage.DOCUMENTED_ELEMENT__DOCUMENTATION: return WorkflowPackage.ACTIVITY_DESCRIPTION__DOCUMENTATION;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (documentation: ");
        result.append(documentation);
        result.append(", labelExpression: ");
        result.append(labelExpression);
        result.append(", imagePath: ");
        result.append(imagePath);
        result.append(')');
        return result.toString();
    }

} //ActivityDescriptionImpl
