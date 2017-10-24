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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.obeonetwork.jarvis.workflow.Activity;
import org.obeonetwork.jarvis.workflow.Page;
import org.obeonetwork.jarvis.workflow.Section;
import org.obeonetwork.jarvis.workflow.Workflow;
import org.obeonetwork.jarvis.workflow.WorkflowFactory;
import org.obeonetwork.jarvis.workflow.WorkflowPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 *
 * @generated
 */
public class WorkflowFactoryImpl extends EFactoryImpl implements WorkflowFactory {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static final String copyright = "Copyright (c) 2017 Obeo.\r\nAll rights reserved. This program and the accompanying materials\r\nare made available under the terms of the Eclipse Public License v1.0\r\nwhich accompanies this distribution, and is available at\r\nhttp://www.eclipse.org/legal/epl-v10.html\r\n\r\nContributors:\r\n   Obeo - initial API and implementation\r\n"; //$NON-NLS-1$

    /**
     * Creates the default factory implementation. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    public static WorkflowFactory init() {
        try {
            WorkflowFactory theWorkflowFactory = (WorkflowFactory) EPackage.Registry.INSTANCE.getEFactory(WorkflowPackage.eNS_URI);
            if (theWorkflowFactory != null) {
                return theWorkflowFactory;
            }
        } catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new WorkflowFactoryImpl();
    }

    /**
     * Creates an instance of the factory. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    public WorkflowFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
        case WorkflowPackage.WORKFLOW:
            return createWorkflow();
        case WorkflowPackage.PAGE:
            return createPage();
        case WorkflowPackage.SECTION:
            return createSection();
        case WorkflowPackage.ACTIVITY:
            return createActivity();
        default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Workflow createWorkflow() {
        WorkflowImpl workflow = new WorkflowImpl();
        return workflow;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Page createPage() {
        PageImpl page = new PageImpl();
        return page;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Section createSection() {
        SectionImpl section = new SectionImpl();
        return section;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Activity createActivity() {
        ActivityImpl activity = new ActivityImpl();
        return activity;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public WorkflowPackage getWorkflowPackage() {
        return (WorkflowPackage) getEPackage();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @deprecated
     * @generated
     */
    @Deprecated
    public static WorkflowPackage getPackage() {
        return WorkflowPackage.eINSTANCE;
    }

} // WorkflowFactoryImpl
