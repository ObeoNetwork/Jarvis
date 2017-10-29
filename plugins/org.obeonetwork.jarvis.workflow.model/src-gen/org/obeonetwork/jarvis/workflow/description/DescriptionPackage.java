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
package org.obeonetwork.jarvis.workflow.description;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains
 * accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 *
 * @see org.obeonetwork.jarvis.workflow.description.DescriptionFactory
 * @model kind="package"
 * @generated
 */
public interface DescriptionPackage extends EPackage {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    String copyright = "Copyright (c) 2017 Obeo.\r\nAll rights reserved. This program and the accompanying materials\r\nare made available under the terms of the Eclipse Public License v1.0\r\nwhich accompanies this distribution, and is available at\r\nhttp://www.eclipse.org/legal/epl-v10.html\r\n\r\nContributors:\r\n   Obeo - initial API and implementation\r\n"; //$NON-NLS-1$

    /**
     * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    String eNAME = "description"; //$NON-NLS-1$

    /**
     * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    String eNS_URI = "http://www.obeonetwork.org/dsl/jarvis/workflow/description"; //$NON-NLS-1$

    /**
     * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    String eNS_PREFIX = "description"; //$NON-NLS-1$

    /**
     * The singleton instance of the package. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    DescriptionPackage eINSTANCE = org.obeonetwork.jarvis.workflow.description.impl.DescriptionPackageImpl.init();

    /**
     * The meta object id for the
     * '{@link org.obeonetwork.jarvis.workflow.description.impl.WorkflowDescriptionImpl
     * <em>Workflow Description</em>}' class. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @see org.obeonetwork.jarvis.workflow.description.impl.WorkflowDescriptionImpl
     * @see org.obeonetwork.jarvis.workflow.description.impl.DescriptionPackageImpl#getWorkflowDescription()
     * @generated
     */
    int WORKFLOW_DESCRIPTION = 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int WORKFLOW_DESCRIPTION__NAME = org.eclipse.sirius.viewpoint.description.DescriptionPackage.EXTENSION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int WORKFLOW_DESCRIPTION__LABEL = org.eclipse.sirius.viewpoint.description.DescriptionPackage.EXTENSION_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int WORKFLOW_DESCRIPTION__DOCUMENTATION = org.eclipse.sirius.viewpoint.description.DescriptionPackage.EXTENSION_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Pages</b></em>' containment reference
     * list. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int WORKFLOW_DESCRIPTION__PAGES = org.eclipse.sirius.viewpoint.description.DescriptionPackage.EXTENSION_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Workflow Description</em>'
     * class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int WORKFLOW_DESCRIPTION_FEATURE_COUNT = org.eclipse.sirius.viewpoint.description.DescriptionPackage.EXTENSION_FEATURE_COUNT + 4;

    /**
     * The meta object id for the
     * '{@link org.obeonetwork.jarvis.workflow.description.impl.PageDescriptionImpl
     * <em>Page Description</em>}' class. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @see org.obeonetwork.jarvis.workflow.description.impl.PageDescriptionImpl
     * @see org.obeonetwork.jarvis.workflow.description.impl.DescriptionPackageImpl#getPageDescription()
     * @generated
     */
    int PAGE_DESCRIPTION = 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int PAGE_DESCRIPTION__NAME = org.eclipse.sirius.viewpoint.description.DescriptionPackage.IDENTIFIED_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int PAGE_DESCRIPTION__LABEL = org.eclipse.sirius.viewpoint.description.DescriptionPackage.IDENTIFIED_ELEMENT__LABEL;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int PAGE_DESCRIPTION__DOCUMENTATION = org.eclipse.sirius.viewpoint.description.DescriptionPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Title Expression</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int PAGE_DESCRIPTION__TITLE_EXPRESSION = org.eclipse.sirius.viewpoint.description.DescriptionPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Image Path</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int PAGE_DESCRIPTION__IMAGE_PATH = org.eclipse.sirius.viewpoint.description.DescriptionPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Description Expression</b></em>'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int PAGE_DESCRIPTION__DESCRIPTION_EXPRESSION = org.eclipse.sirius.viewpoint.description.DescriptionPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Sections</b></em>' containment reference
     * list. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int PAGE_DESCRIPTION__SECTIONS = org.eclipse.sirius.viewpoint.description.DescriptionPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>Page Description</em>'
     * class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int PAGE_DESCRIPTION_FEATURE_COUNT = org.eclipse.sirius.viewpoint.description.DescriptionPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 5;

    /**
     * The meta object id for the
     * '{@link org.obeonetwork.jarvis.workflow.description.impl.SectionDescriptionImpl
     * <em>Section Description</em>}' class. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @see org.obeonetwork.jarvis.workflow.description.impl.SectionDescriptionImpl
     * @see org.obeonetwork.jarvis.workflow.description.impl.DescriptionPackageImpl#getSectionDescription()
     * @generated
     */
    int SECTION_DESCRIPTION = 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int SECTION_DESCRIPTION__NAME = org.eclipse.sirius.viewpoint.description.DescriptionPackage.IDENTIFIED_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int SECTION_DESCRIPTION__LABEL = org.eclipse.sirius.viewpoint.description.DescriptionPackage.IDENTIFIED_ELEMENT__LABEL;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int SECTION_DESCRIPTION__DOCUMENTATION = org.eclipse.sirius.viewpoint.description.DescriptionPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Title Expression</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int SECTION_DESCRIPTION__TITLE_EXPRESSION = org.eclipse.sirius.viewpoint.description.DescriptionPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Icon Path</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int SECTION_DESCRIPTION__ICON_PATH = org.eclipse.sirius.viewpoint.description.DescriptionPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Description Expression</b></em>'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int SECTION_DESCRIPTION__DESCRIPTION_EXPRESSION = org.eclipse.sirius.viewpoint.description.DescriptionPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Activities</b></em>' containment reference
     * list. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int SECTION_DESCRIPTION__ACTIVITIES = org.eclipse.sirius.viewpoint.description.DescriptionPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>Section Description</em>'
     * class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int SECTION_DESCRIPTION_FEATURE_COUNT = org.eclipse.sirius.viewpoint.description.DescriptionPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 5;

    /**
     * The meta object id for the
     * '{@link org.obeonetwork.jarvis.workflow.description.impl.ActivityDescriptionImpl
     * <em>Activity Description</em>}' class. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @see org.obeonetwork.jarvis.workflow.description.impl.ActivityDescriptionImpl
     * @see org.obeonetwork.jarvis.workflow.description.impl.DescriptionPackageImpl#getActivityDescription()
     * @generated
     */
    int ACTIVITY_DESCRIPTION = 3;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int ACTIVITY_DESCRIPTION__NAME = org.eclipse.sirius.viewpoint.description.DescriptionPackage.IDENTIFIED_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int ACTIVITY_DESCRIPTION__LABEL = org.eclipse.sirius.viewpoint.description.DescriptionPackage.IDENTIFIED_ELEMENT__LABEL;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int ACTIVITY_DESCRIPTION__DOCUMENTATION = org.eclipse.sirius.viewpoint.description.DescriptionPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Label Expression</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int ACTIVITY_DESCRIPTION__LABEL_EXPRESSION = org.eclipse.sirius.viewpoint.description.DescriptionPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Icon Path</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int ACTIVITY_DESCRIPTION__ICON_PATH = org.eclipse.sirius.viewpoint.description.DescriptionPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Operation</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int ACTIVITY_DESCRIPTION__OPERATION = org.eclipse.sirius.viewpoint.description.DescriptionPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Activity Description</em>'
     * class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int ACTIVITY_DESCRIPTION_FEATURE_COUNT = org.eclipse.sirius.viewpoint.description.DescriptionPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 4;

    /**
     * Returns the meta object for class
     * '{@link org.obeonetwork.jarvis.workflow.description.WorkflowDescription
     * <em>Workflow Description</em>}'. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @return the meta object for class '<em>Workflow Description</em>'.
     * @see org.obeonetwork.jarvis.workflow.description.WorkflowDescription
     * @generated
     */
    EClass getWorkflowDescription();

    /**
     * Returns the meta object for the containment reference list
     * '{@link org.obeonetwork.jarvis.workflow.description.WorkflowDescription#getPages
     * <em>Pages</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list
     *         '<em>Pages</em>'.
     * @see org.obeonetwork.jarvis.workflow.description.WorkflowDescription#getPages()
     * @see #getWorkflowDescription()
     * @generated
     */
    EReference getWorkflowDescription_Pages();

    /**
     * Returns the meta object for class
     * '{@link org.obeonetwork.jarvis.workflow.description.PageDescription
     * <em>Page Description</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @return the meta object for class '<em>Page Description</em>'.
     * @see org.obeonetwork.jarvis.workflow.description.PageDescription
     * @generated
     */
    EClass getPageDescription();

    /**
     * Returns the meta object for the attribute
     * '{@link org.obeonetwork.jarvis.workflow.description.PageDescription#getTitleExpression
     * <em>Title Expression</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @return the meta object for the attribute '<em>Title Expression</em>'.
     * @see org.obeonetwork.jarvis.workflow.description.PageDescription#getTitleExpression()
     * @see #getPageDescription()
     * @generated
     */
    EAttribute getPageDescription_TitleExpression();

    /**
     * Returns the meta object for the attribute
     * '{@link org.obeonetwork.jarvis.workflow.description.PageDescription#getImagePath
     * <em>Image Path</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Image Path</em>'.
     * @see org.obeonetwork.jarvis.workflow.description.PageDescription#getImagePath()
     * @see #getPageDescription()
     * @generated
     */
    EAttribute getPageDescription_ImagePath();

    /**
     * Returns the meta object for the attribute
     * '{@link org.obeonetwork.jarvis.workflow.description.PageDescription#getDescriptionExpression
     * <em>Description Expression</em>}'. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Description
     *         Expression</em>'.
     * @see org.obeonetwork.jarvis.workflow.description.PageDescription#getDescriptionExpression()
     * @see #getPageDescription()
     * @generated
     */
    EAttribute getPageDescription_DescriptionExpression();

    /**
     * Returns the meta object for the containment reference list
     * '{@link org.obeonetwork.jarvis.workflow.description.PageDescription#getSections
     * <em>Sections</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list
     *         '<em>Sections</em>'.
     * @see org.obeonetwork.jarvis.workflow.description.PageDescription#getSections()
     * @see #getPageDescription()
     * @generated
     */
    EReference getPageDescription_Sections();

    /**
     * Returns the meta object for class
     * '{@link org.obeonetwork.jarvis.workflow.description.SectionDescription
     * <em>Section Description</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @return the meta object for class '<em>Section Description</em>'.
     * @see org.obeonetwork.jarvis.workflow.description.SectionDescription
     * @generated
     */
    EClass getSectionDescription();

    /**
     * Returns the meta object for the attribute
     * '{@link org.obeonetwork.jarvis.workflow.description.SectionDescription#getTitleExpression
     * <em>Title Expression</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @return the meta object for the attribute '<em>Title Expression</em>'.
     * @see org.obeonetwork.jarvis.workflow.description.SectionDescription#getTitleExpression()
     * @see #getSectionDescription()
     * @generated
     */
    EAttribute getSectionDescription_TitleExpression();

    /**
     * Returns the meta object for the attribute
     * '{@link org.obeonetwork.jarvis.workflow.description.SectionDescription#getIconPath
     * <em>Icon Path</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Icon Path</em>'.
     * @see org.obeonetwork.jarvis.workflow.description.SectionDescription#getIconPath()
     * @see #getSectionDescription()
     * @generated
     */
    EAttribute getSectionDescription_IconPath();

    /**
     * Returns the meta object for the attribute
     * '{@link org.obeonetwork.jarvis.workflow.description.SectionDescription#getDescriptionExpression
     * <em>Description Expression</em>}'. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Description
     *         Expression</em>'.
     * @see org.obeonetwork.jarvis.workflow.description.SectionDescription#getDescriptionExpression()
     * @see #getSectionDescription()
     * @generated
     */
    EAttribute getSectionDescription_DescriptionExpression();

    /**
     * Returns the meta object for the containment reference list
     * '{@link org.obeonetwork.jarvis.workflow.description.SectionDescription#getActivities
     * <em>Activities</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list
     *         '<em>Activities</em>'.
     * @see org.obeonetwork.jarvis.workflow.description.SectionDescription#getActivities()
     * @see #getSectionDescription()
     * @generated
     */
    EReference getSectionDescription_Activities();

    /**
     * Returns the meta object for class
     * '{@link org.obeonetwork.jarvis.workflow.description.ActivityDescription
     * <em>Activity Description</em>}'. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @return the meta object for class '<em>Activity Description</em>'.
     * @see org.obeonetwork.jarvis.workflow.description.ActivityDescription
     * @generated
     */
    EClass getActivityDescription();

    /**
     * Returns the meta object for the attribute
     * '{@link org.obeonetwork.jarvis.workflow.description.ActivityDescription#getLabelExpression
     * <em>Label Expression</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @return the meta object for the attribute '<em>Label Expression</em>'.
     * @see org.obeonetwork.jarvis.workflow.description.ActivityDescription#getLabelExpression()
     * @see #getActivityDescription()
     * @generated
     */
    EAttribute getActivityDescription_LabelExpression();

    /**
     * Returns the meta object for the attribute
     * '{@link org.obeonetwork.jarvis.workflow.description.ActivityDescription#getIconPath
     * <em>Icon Path</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Icon Path</em>'.
     * @see org.obeonetwork.jarvis.workflow.description.ActivityDescription#getIconPath()
     * @see #getActivityDescription()
     * @generated
     */
    EAttribute getActivityDescription_IconPath();

    /**
     * Returns the meta object for the containment reference
     * '{@link org.obeonetwork.jarvis.workflow.description.ActivityDescription#getOperation
     * <em>Operation</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference
     *         '<em>Operation</em>'.
     * @see org.obeonetwork.jarvis.workflow.description.ActivityDescription#getOperation()
     * @see #getActivityDescription()
     * @generated
     */
    EReference getActivityDescription_Operation();

    /**
     * Returns the factory that creates the instances of the model. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the factory that creates the instances of the model.
     * @generated
     */
    DescriptionFactory getDescriptionFactory();

    /**
     * <!-- begin-user-doc --> Defines literals for the meta objects that
     * represent
     * <ul>
     * <li>each class,</li>
     * <li>each feature of each class,</li>
     * <li>each enum,</li>
     * <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     *
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the
         * '{@link org.obeonetwork.jarvis.workflow.description.impl.WorkflowDescriptionImpl
         * <em>Workflow Description</em>}' class. <!-- begin-user-doc --> <!--
         * end-user-doc -->
         *
         * @see org.obeonetwork.jarvis.workflow.description.impl.WorkflowDescriptionImpl
         * @see org.obeonetwork.jarvis.workflow.description.impl.DescriptionPackageImpl#getWorkflowDescription()
         * @generated
         */
        EClass WORKFLOW_DESCRIPTION = DescriptionPackage.eINSTANCE.getWorkflowDescription();

        /**
         * The meta object literal for the '<em><b>Pages</b></em>' containment
         * reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EReference WORKFLOW_DESCRIPTION__PAGES = DescriptionPackage.eINSTANCE.getWorkflowDescription_Pages();

        /**
         * The meta object literal for the
         * '{@link org.obeonetwork.jarvis.workflow.description.impl.PageDescriptionImpl
         * <em>Page Description</em>}' class. <!-- begin-user-doc --> <!--
         * end-user-doc -->
         *
         * @see org.obeonetwork.jarvis.workflow.description.impl.PageDescriptionImpl
         * @see org.obeonetwork.jarvis.workflow.description.impl.DescriptionPackageImpl#getPageDescription()
         * @generated
         */
        EClass PAGE_DESCRIPTION = DescriptionPackage.eINSTANCE.getPageDescription();

        /**
         * The meta object literal for the '<em><b>Title Expression</b></em>'
         * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute PAGE_DESCRIPTION__TITLE_EXPRESSION = DescriptionPackage.eINSTANCE.getPageDescription_TitleExpression();

        /**
         * The meta object literal for the '<em><b>Image Path</b></em>'
         * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute PAGE_DESCRIPTION__IMAGE_PATH = DescriptionPackage.eINSTANCE.getPageDescription_ImagePath();

        /**
         * The meta object literal for the '<em><b>Description
         * Expression</b></em>' attribute feature. <!-- begin-user-doc --> <!--
         * end-user-doc -->
         *
         * @generated
         */
        EAttribute PAGE_DESCRIPTION__DESCRIPTION_EXPRESSION = DescriptionPackage.eINSTANCE.getPageDescription_DescriptionExpression();

        /**
         * The meta object literal for the '<em><b>Sections</b></em>'
         * containment reference list feature. <!-- begin-user-doc --> <!--
         * end-user-doc -->
         *
         * @generated
         */
        EReference PAGE_DESCRIPTION__SECTIONS = DescriptionPackage.eINSTANCE.getPageDescription_Sections();

        /**
         * The meta object literal for the
         * '{@link org.obeonetwork.jarvis.workflow.description.impl.SectionDescriptionImpl
         * <em>Section Description</em>}' class. <!-- begin-user-doc --> <!--
         * end-user-doc -->
         *
         * @see org.obeonetwork.jarvis.workflow.description.impl.SectionDescriptionImpl
         * @see org.obeonetwork.jarvis.workflow.description.impl.DescriptionPackageImpl#getSectionDescription()
         * @generated
         */
        EClass SECTION_DESCRIPTION = DescriptionPackage.eINSTANCE.getSectionDescription();

        /**
         * The meta object literal for the '<em><b>Title Expression</b></em>'
         * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute SECTION_DESCRIPTION__TITLE_EXPRESSION = DescriptionPackage.eINSTANCE.getSectionDescription_TitleExpression();

        /**
         * The meta object literal for the '<em><b>Icon Path</b></em>' attribute
         * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute SECTION_DESCRIPTION__ICON_PATH = DescriptionPackage.eINSTANCE.getSectionDescription_IconPath();

        /**
         * The meta object literal for the '<em><b>Description
         * Expression</b></em>' attribute feature. <!-- begin-user-doc --> <!--
         * end-user-doc -->
         *
         * @generated
         */
        EAttribute SECTION_DESCRIPTION__DESCRIPTION_EXPRESSION = DescriptionPackage.eINSTANCE.getSectionDescription_DescriptionExpression();

        /**
         * The meta object literal for the '<em><b>Activities</b></em>'
         * containment reference list feature. <!-- begin-user-doc --> <!--
         * end-user-doc -->
         *
         * @generated
         */
        EReference SECTION_DESCRIPTION__ACTIVITIES = DescriptionPackage.eINSTANCE.getSectionDescription_Activities();

        /**
         * The meta object literal for the
         * '{@link org.obeonetwork.jarvis.workflow.description.impl.ActivityDescriptionImpl
         * <em>Activity Description</em>}' class. <!-- begin-user-doc --> <!--
         * end-user-doc -->
         *
         * @see org.obeonetwork.jarvis.workflow.description.impl.ActivityDescriptionImpl
         * @see org.obeonetwork.jarvis.workflow.description.impl.DescriptionPackageImpl#getActivityDescription()
         * @generated
         */
        EClass ACTIVITY_DESCRIPTION = DescriptionPackage.eINSTANCE.getActivityDescription();

        /**
         * The meta object literal for the '<em><b>Label Expression</b></em>'
         * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute ACTIVITY_DESCRIPTION__LABEL_EXPRESSION = DescriptionPackage.eINSTANCE.getActivityDescription_LabelExpression();

        /**
         * The meta object literal for the '<em><b>Icon Path</b></em>' attribute
         * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute ACTIVITY_DESCRIPTION__ICON_PATH = DescriptionPackage.eINSTANCE.getActivityDescription_IconPath();

        /**
         * The meta object literal for the '<em><b>Operation</b></em>'
         * containment reference feature. <!-- begin-user-doc --> <!--
         * end-user-doc -->
         *
         * @generated
         */
        EReference ACTIVITY_DESCRIPTION__OPERATION = DescriptionPackage.eINSTANCE.getActivityDescription_Operation();

    }

} // DescriptionPackage
