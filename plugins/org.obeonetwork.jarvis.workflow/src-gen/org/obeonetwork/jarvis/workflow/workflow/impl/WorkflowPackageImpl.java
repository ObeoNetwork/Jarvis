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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.sirius.viewpoint.ViewpointPackage;

import org.eclipse.sirius.viewpoint.description.DescriptionPackage;

import org.eclipse.sirius.viewpoint.description.tool.ToolPackage;

import org.obeonetwork.jarvis.workflow.workflow.ActivityDescription;
import org.obeonetwork.jarvis.workflow.workflow.PageDescription;
import org.obeonetwork.jarvis.workflow.workflow.SectionDescription;
import org.obeonetwork.jarvis.workflow.workflow.WorkflowDescription;
import org.obeonetwork.jarvis.workflow.workflow.WorkflowFactory;
import org.obeonetwork.jarvis.workflow.workflow.WorkflowPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WorkflowPackageImpl extends EPackageImpl implements WorkflowPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass workflowDescriptionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass pageDescriptionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass sectionDescriptionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass activityDescriptionEClass = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see org.obeonetwork.jarvis.workflow.workflow.WorkflowPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private WorkflowPackageImpl() {
        super(eNS_URI, WorkflowFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     * 
     * <p>This method is used to initialize {@link WorkflowPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static WorkflowPackage init() {
        if (isInited) return (WorkflowPackage)EPackage.Registry.INSTANCE.getEPackage(WorkflowPackage.eNS_URI);

        // Obtain or create and register package
        WorkflowPackageImpl theWorkflowPackage = (WorkflowPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof WorkflowPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new WorkflowPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        EcorePackage.eINSTANCE.eClass();
        ViewpointPackage.eINSTANCE.eClass();

        // Create package meta-data objects
        theWorkflowPackage.createPackageContents();

        // Initialize created meta-data
        theWorkflowPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theWorkflowPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(WorkflowPackage.eNS_URI, theWorkflowPackage);
        return theWorkflowPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getWorkflowDescription() {
        return workflowDescriptionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getWorkflowDescription_Pages() {
        return (EReference)workflowDescriptionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPageDescription() {
        return pageDescriptionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPageDescription_TitleExpression() {
        return (EAttribute)pageDescriptionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPageDescription_ImagePath() {
        return (EAttribute)pageDescriptionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPageDescription_DescriptionExpression() {
        return (EAttribute)pageDescriptionEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getPageDescription_Sections() {
        return (EReference)pageDescriptionEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSectionDescription() {
        return sectionDescriptionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSectionDescription_TitleExpression() {
        return (EAttribute)sectionDescriptionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSectionDescription_ImagePath() {
        return (EAttribute)sectionDescriptionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSectionDescription_DescriptionExpression() {
        return (EAttribute)sectionDescriptionEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSectionDescription_Activities() {
        return (EReference)sectionDescriptionEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getActivityDescription() {
        return activityDescriptionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getActivityDescription_LabelExpression() {
        return (EAttribute)activityDescriptionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getActivityDescription_ImagePath() {
        return (EAttribute)activityDescriptionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getActivityDescription_Operation() {
        return (EReference)activityDescriptionEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WorkflowFactory getWorkflowFactory() {
        return (WorkflowFactory)getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void createPackageContents() {
        if (isCreated) return;
        isCreated = true;

        // Create classes and their features
        workflowDescriptionEClass = createEClass(WORKFLOW_DESCRIPTION);
        createEReference(workflowDescriptionEClass, WORKFLOW_DESCRIPTION__PAGES);

        pageDescriptionEClass = createEClass(PAGE_DESCRIPTION);
        createEAttribute(pageDescriptionEClass, PAGE_DESCRIPTION__TITLE_EXPRESSION);
        createEAttribute(pageDescriptionEClass, PAGE_DESCRIPTION__IMAGE_PATH);
        createEAttribute(pageDescriptionEClass, PAGE_DESCRIPTION__DESCRIPTION_EXPRESSION);
        createEReference(pageDescriptionEClass, PAGE_DESCRIPTION__SECTIONS);

        sectionDescriptionEClass = createEClass(SECTION_DESCRIPTION);
        createEAttribute(sectionDescriptionEClass, SECTION_DESCRIPTION__TITLE_EXPRESSION);
        createEAttribute(sectionDescriptionEClass, SECTION_DESCRIPTION__IMAGE_PATH);
        createEAttribute(sectionDescriptionEClass, SECTION_DESCRIPTION__DESCRIPTION_EXPRESSION);
        createEReference(sectionDescriptionEClass, SECTION_DESCRIPTION__ACTIVITIES);

        activityDescriptionEClass = createEClass(ACTIVITY_DESCRIPTION);
        createEAttribute(activityDescriptionEClass, ACTIVITY_DESCRIPTION__LABEL_EXPRESSION);
        createEAttribute(activityDescriptionEClass, ACTIVITY_DESCRIPTION__IMAGE_PATH);
        createEReference(activityDescriptionEClass, ACTIVITY_DESCRIPTION__OPERATION);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void initializePackageContents() {
        if (isInitialized) return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Obtain other dependent packages
        DescriptionPackage theDescriptionPackage = (DescriptionPackage)EPackage.Registry.INSTANCE.getEPackage(DescriptionPackage.eNS_URI);
        ToolPackage theToolPackage = (ToolPackage)EPackage.Registry.INSTANCE.getEPackage(ToolPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        workflowDescriptionEClass.getESuperTypes().add(theDescriptionPackage.getExtension());
        workflowDescriptionEClass.getESuperTypes().add(theDescriptionPackage.getIdentifiedElement());
        workflowDescriptionEClass.getESuperTypes().add(theDescriptionPackage.getDocumentedElement());
        pageDescriptionEClass.getESuperTypes().add(theDescriptionPackage.getIdentifiedElement());
        pageDescriptionEClass.getESuperTypes().add(theDescriptionPackage.getDocumentedElement());
        sectionDescriptionEClass.getESuperTypes().add(theDescriptionPackage.getIdentifiedElement());
        sectionDescriptionEClass.getESuperTypes().add(theDescriptionPackage.getDocumentedElement());
        activityDescriptionEClass.getESuperTypes().add(theDescriptionPackage.getIdentifiedElement());
        activityDescriptionEClass.getESuperTypes().add(theDescriptionPackage.getDocumentedElement());

        // Initialize classes and features; add operations and parameters
        initEClass(workflowDescriptionEClass, WorkflowDescription.class, "WorkflowDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getWorkflowDescription_Pages(), this.getPageDescription(), null, "pages", null, 0, -1, WorkflowDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(pageDescriptionEClass, PageDescription.class, "PageDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getPageDescription_TitleExpression(), theDescriptionPackage.getInterpretedExpression(), "titleExpression", null, 1, 1, PageDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPageDescription_ImagePath(), theDescriptionPackage.getImagePath(), "imagePath", null, 0, 1, PageDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPageDescription_DescriptionExpression(), theDescriptionPackage.getInterpretedExpression(), "descriptionExpression", null, 1, 1, PageDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getPageDescription_Sections(), this.getSectionDescription(), null, "sections", null, 0, -1, PageDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(sectionDescriptionEClass, SectionDescription.class, "SectionDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getSectionDescription_TitleExpression(), theDescriptionPackage.getInterpretedExpression(), "titleExpression", null, 1, 1, SectionDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSectionDescription_ImagePath(), theDescriptionPackage.getImagePath(), "imagePath", null, 0, 1, SectionDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSectionDescription_DescriptionExpression(), theDescriptionPackage.getInterpretedExpression(), "descriptionExpression", null, 1, 1, SectionDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSectionDescription_Activities(), this.getActivityDescription(), null, "activities", null, 0, -1, SectionDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(activityDescriptionEClass, ActivityDescription.class, "ActivityDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getActivityDescription_LabelExpression(), theDescriptionPackage.getInterpretedExpression(), "labelExpression", null, 1, 1, ActivityDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getActivityDescription_ImagePath(), theDescriptionPackage.getImagePath(), "imagePath", null, 0, 1, ActivityDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getActivityDescription_Operation(), theToolPackage.getInitialOperation(), null, "operation", null, 1, 1, ActivityDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Create resource
        createResource(eNS_URI);
    }

} //WorkflowPackageImpl
