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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.obeonetwork.jarvis.workflow.description.ActivityDescription;
import org.obeonetwork.jarvis.workflow.description.DescriptionFactory;
import org.obeonetwork.jarvis.workflow.description.DescriptionPackage;
import org.obeonetwork.jarvis.workflow.description.PageDescription;
import org.obeonetwork.jarvis.workflow.description.SectionDescription;
import org.obeonetwork.jarvis.workflow.description.WorkflowDescription;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 *
 * @generated
 */
public class DescriptionFactoryImpl extends EFactoryImpl implements DescriptionFactory {
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
    public static DescriptionFactory init() {
        try {
            DescriptionFactory theDescriptionFactory = (DescriptionFactory) EPackage.Registry.INSTANCE.getEFactory(DescriptionPackage.eNS_URI);
            if (theDescriptionFactory != null) {
                return theDescriptionFactory;
            }
        } catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new DescriptionFactoryImpl();
    }

    /**
     * Creates an instance of the factory. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    public DescriptionFactoryImpl() {
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
        case DescriptionPackage.WORKFLOW_DESCRIPTION:
            return createWorkflowDescription();
        case DescriptionPackage.PAGE_DESCRIPTION:
            return createPageDescription();
        case DescriptionPackage.SECTION_DESCRIPTION:
            return createSectionDescription();
        case DescriptionPackage.ACTIVITY_DESCRIPTION:
            return createActivityDescription();
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
    public WorkflowDescription createWorkflowDescription() {
        WorkflowDescriptionImpl workflowDescription = new WorkflowDescriptionImpl();
        return workflowDescription;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public PageDescription createPageDescription() {
        PageDescriptionImpl pageDescription = new PageDescriptionImpl();
        return pageDescription;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public SectionDescription createSectionDescription() {
        SectionDescriptionImpl sectionDescription = new SectionDescriptionImpl();
        return sectionDescription;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ActivityDescription createActivityDescription() {
        ActivityDescriptionImpl activityDescription = new ActivityDescriptionImpl();
        return activityDescription;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public DescriptionPackage getDescriptionPackage() {
        return (DescriptionPackage) getEPackage();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @deprecated
     * @generated
     */
    @Deprecated
    public static DescriptionPackage getPackage() {
        return DescriptionPackage.eINSTANCE;
    }

} // DescriptionFactoryImpl
