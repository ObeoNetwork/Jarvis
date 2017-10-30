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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.obeonetwork.jarvis.workflow.workflow.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WorkflowFactoryImpl extends EFactoryImpl implements WorkflowFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static WorkflowFactory init() {
        try {
            WorkflowFactory theWorkflowFactory = (WorkflowFactory)EPackage.Registry.INSTANCE.getEFactory(WorkflowPackage.eNS_URI);
            if (theWorkflowFactory != null) {
                return theWorkflowFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new WorkflowFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WorkflowFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case WorkflowPackage.WORKFLOW_DESCRIPTION: return createWorkflowDescription();
            case WorkflowPackage.PAGE_DESCRIPTION: return createPageDescription();
            case WorkflowPackage.SECTION_DESCRIPTION: return createSectionDescription();
            case WorkflowPackage.ACTIVITY_DESCRIPTION: return createActivityDescription();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WorkflowDescription createWorkflowDescription() {
        WorkflowDescriptionImpl workflowDescription = new WorkflowDescriptionImpl();
        return workflowDescription;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PageDescription createPageDescription() {
        PageDescriptionImpl pageDescription = new PageDescriptionImpl();
        return pageDescription;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SectionDescription createSectionDescription() {
        SectionDescriptionImpl sectionDescription = new SectionDescriptionImpl();
        return sectionDescription;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ActivityDescription createActivityDescription() {
        ActivityDescriptionImpl activityDescription = new ActivityDescriptionImpl();
        return activityDescription;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WorkflowPackage getWorkflowPackage() {
        return (WorkflowPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static WorkflowPackage getPackage() {
        return WorkflowPackage.eINSTANCE;
    }

} //WorkflowFactoryImpl
