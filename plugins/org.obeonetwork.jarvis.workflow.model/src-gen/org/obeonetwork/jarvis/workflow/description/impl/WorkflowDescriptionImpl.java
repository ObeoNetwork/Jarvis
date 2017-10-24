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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.sirius.viewpoint.description.DocumentedElement;
import org.eclipse.sirius.viewpoint.description.IdentifiedElement;
import org.obeonetwork.jarvis.workflow.description.DescriptionPackage;
import org.obeonetwork.jarvis.workflow.description.PageDescription;
import org.obeonetwork.jarvis.workflow.description.WorkflowDescription;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Workflow Description</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.obeonetwork.jarvis.workflow.description.impl.WorkflowDescriptionImpl#getName
 * <em>Name</em>}</li>
 * <li>{@link org.obeonetwork.jarvis.workflow.description.impl.WorkflowDescriptionImpl#getLabel
 * <em>Label</em>}</li>
 * <li>{@link org.obeonetwork.jarvis.workflow.description.impl.WorkflowDescriptionImpl#getDocumentation
 * <em>Documentation</em>}</li>
 * <li>{@link org.obeonetwork.jarvis.workflow.description.impl.WorkflowDescriptionImpl#getPages
 * <em>Pages</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkflowDescriptionImpl extends MinimalEObjectImpl.Container implements WorkflowDescription {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static final String copyright = "Copyright (c) 2017 Obeo.\r\nAll rights reserved. This program and the accompanying materials\r\nare made available under the terms of the Eclipse Public License v1.0\r\nwhich accompanies this distribution, and is available at\r\nhttp://www.eclipse.org/legal/epl-v10.html\r\n\r\nContributors:\r\n   Obeo - initial API and implementation\r\n"; //$NON-NLS-1$

    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = ""; //$NON-NLS-1$

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String name = WorkflowDescriptionImpl.NAME_EDEFAULT;

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
    protected String label = WorkflowDescriptionImpl.LABEL_EDEFAULT;

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
    protected String documentation = WorkflowDescriptionImpl.DOCUMENTATION_EDEFAULT;

    /**
     * The cached value of the '{@link #getPages() <em>Pages</em>}' containment
     * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getPages()
     * @generated
     * @ordered
     */
    protected EList<PageDescription> pages;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected WorkflowDescriptionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DescriptionPackage.Literals.WORKFLOW_DESCRIPTION;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setName(String newName) {
        String oldName = name;
        name = newName;
        if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET, DescriptionPackage.WORKFLOW_DESCRIPTION__NAME, oldName, name));
        }
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
            eNotify(new ENotificationImpl(this, Notification.SET, DescriptionPackage.WORKFLOW_DESCRIPTION__LABEL, oldLabel, label));
        }
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
            eNotify(new ENotificationImpl(this, Notification.SET, DescriptionPackage.WORKFLOW_DESCRIPTION__DOCUMENTATION, oldDocumentation, documentation));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<PageDescription> getPages() {
        if (pages == null) {
            pages = new EObjectContainmentEList.Resolving<>(PageDescription.class, this, DescriptionPackage.WORKFLOW_DESCRIPTION__PAGES);
        }
        return pages;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case DescriptionPackage.WORKFLOW_DESCRIPTION__PAGES:
            return ((InternalEList<?>) getPages()).basicRemove(otherEnd, msgs);
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
        case DescriptionPackage.WORKFLOW_DESCRIPTION__NAME:
            return getName();
        case DescriptionPackage.WORKFLOW_DESCRIPTION__LABEL:
            return getLabel();
        case DescriptionPackage.WORKFLOW_DESCRIPTION__DOCUMENTATION:
            return getDocumentation();
        case DescriptionPackage.WORKFLOW_DESCRIPTION__PAGES:
            return getPages();
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
        case DescriptionPackage.WORKFLOW_DESCRIPTION__NAME:
            setName((String) newValue);
            return;
        case DescriptionPackage.WORKFLOW_DESCRIPTION__LABEL:
            setLabel((String) newValue);
            return;
        case DescriptionPackage.WORKFLOW_DESCRIPTION__DOCUMENTATION:
            setDocumentation((String) newValue);
            return;
        case DescriptionPackage.WORKFLOW_DESCRIPTION__PAGES:
            getPages().clear();
            getPages().addAll((Collection<? extends PageDescription>) newValue);
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
        case DescriptionPackage.WORKFLOW_DESCRIPTION__NAME:
            setName(WorkflowDescriptionImpl.NAME_EDEFAULT);
            return;
        case DescriptionPackage.WORKFLOW_DESCRIPTION__LABEL:
            setLabel(WorkflowDescriptionImpl.LABEL_EDEFAULT);
            return;
        case DescriptionPackage.WORKFLOW_DESCRIPTION__DOCUMENTATION:
            setDocumentation(WorkflowDescriptionImpl.DOCUMENTATION_EDEFAULT);
            return;
        case DescriptionPackage.WORKFLOW_DESCRIPTION__PAGES:
            getPages().clear();
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
        case DescriptionPackage.WORKFLOW_DESCRIPTION__NAME:
            return WorkflowDescriptionImpl.NAME_EDEFAULT == null ? name != null : !WorkflowDescriptionImpl.NAME_EDEFAULT.equals(name);
        case DescriptionPackage.WORKFLOW_DESCRIPTION__LABEL:
            return WorkflowDescriptionImpl.LABEL_EDEFAULT == null ? label != null : !WorkflowDescriptionImpl.LABEL_EDEFAULT.equals(label);
        case DescriptionPackage.WORKFLOW_DESCRIPTION__DOCUMENTATION:
            return WorkflowDescriptionImpl.DOCUMENTATION_EDEFAULT == null ? documentation != null : !WorkflowDescriptionImpl.DOCUMENTATION_EDEFAULT.equals(documentation);
        case DescriptionPackage.WORKFLOW_DESCRIPTION__PAGES:
            return pages != null && !pages.isEmpty();
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
        if (baseClass == IdentifiedElement.class) {
            switch (derivedFeatureID) {
            case DescriptionPackage.WORKFLOW_DESCRIPTION__NAME:
                return org.eclipse.sirius.viewpoint.description.DescriptionPackage.IDENTIFIED_ELEMENT__NAME;
            case DescriptionPackage.WORKFLOW_DESCRIPTION__LABEL:
                return org.eclipse.sirius.viewpoint.description.DescriptionPackage.IDENTIFIED_ELEMENT__LABEL;
            default:
                return -1;
            }
        }
        if (baseClass == DocumentedElement.class) {
            switch (derivedFeatureID) {
            case DescriptionPackage.WORKFLOW_DESCRIPTION__DOCUMENTATION:
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
        if (baseClass == IdentifiedElement.class) {
            switch (baseFeatureID) {
            case org.eclipse.sirius.viewpoint.description.DescriptionPackage.IDENTIFIED_ELEMENT__NAME:
                return DescriptionPackage.WORKFLOW_DESCRIPTION__NAME;
            case org.eclipse.sirius.viewpoint.description.DescriptionPackage.IDENTIFIED_ELEMENT__LABEL:
                return DescriptionPackage.WORKFLOW_DESCRIPTION__LABEL;
            default:
                return -1;
            }
        }
        if (baseClass == DocumentedElement.class) {
            switch (baseFeatureID) {
            case org.eclipse.sirius.viewpoint.description.DescriptionPackage.DOCUMENTED_ELEMENT__DOCUMENTATION:
                return DescriptionPackage.WORKFLOW_DESCRIPTION__DOCUMENTATION;
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
        result.append(" (name: "); //$NON-NLS-1$
        result.append(name);
        result.append(", label: "); //$NON-NLS-1$
        result.append(label);
        result.append(", documentation: "); //$NON-NLS-1$
        result.append(documentation);
        result.append(')');
        return result.toString();
    }

} // WorkflowDescriptionImpl
