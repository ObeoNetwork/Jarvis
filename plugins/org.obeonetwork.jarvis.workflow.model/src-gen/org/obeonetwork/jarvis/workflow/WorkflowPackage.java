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
package org.obeonetwork.jarvis.workflow;

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
 * @see org.obeonetwork.jarvis.workflow.WorkflowFactory
 * @model kind="package"
 * @generated
 */
public interface WorkflowPackage extends EPackage {
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
    String eNAME = "workflow"; //$NON-NLS-1$

    /**
     * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    String eNS_URI = "http://www.obeonetwork.org/dsl/jarvis/workflow"; //$NON-NLS-1$

    /**
     * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    String eNS_PREFIX = "workflow"; //$NON-NLS-1$

    /**
     * The singleton instance of the package. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    WorkflowPackage eINSTANCE = org.obeonetwork.jarvis.workflow.impl.WorkflowPackageImpl.init();

    /**
     * The meta object id for the
     * '{@link org.obeonetwork.jarvis.workflow.impl.WorkflowImpl
     * <em>Workflow</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.obeonetwork.jarvis.workflow.impl.WorkflowImpl
     * @see org.obeonetwork.jarvis.workflow.impl.WorkflowPackageImpl#getWorkflow()
     * @generated
     */
    int WORKFLOW = 0;

    /**
     * The feature id for the '<em><b>Owned Pages</b></em>' containment
     * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int WORKFLOW__OWNED_PAGES = 0;

    /**
     * The number of structural features of the '<em>Workflow</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int WORKFLOW_FEATURE_COUNT = 1;

    /**
     * The meta object id for the
     * '{@link org.obeonetwork.jarvis.workflow.impl.PageImpl <em>Page</em>}'
     * class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.obeonetwork.jarvis.workflow.impl.PageImpl
     * @see org.obeonetwork.jarvis.workflow.impl.WorkflowPackageImpl#getPage()
     * @generated
     */
    int PAGE = 1;

    /**
     * The feature id for the '<em><b>Title</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int PAGE__TITLE = 0;

    /**
     * The feature id for the '<em><b>Description Text</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int PAGE__DESCRIPTION_TEXT = 1;

    /**
     * The feature id for the '<em><b>Image Path</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int PAGE__IMAGE_PATH = 2;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int PAGE__DESCRIPTION = 3;

    /**
     * The feature id for the '<em><b>Owned Sections</b></em>' containment
     * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int PAGE__OWNED_SECTIONS = 4;

    /**
     * The number of structural features of the '<em>Page</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int PAGE_FEATURE_COUNT = 5;

    /**
     * The meta object id for the
     * '{@link org.obeonetwork.jarvis.workflow.impl.SectionImpl
     * <em>Section</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.obeonetwork.jarvis.workflow.impl.SectionImpl
     * @see org.obeonetwork.jarvis.workflow.impl.WorkflowPackageImpl#getSection()
     * @generated
     */
    int SECTION = 2;

    /**
     * The feature id for the '<em><b>Title</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int SECTION__TITLE = 0;

    /**
     * The feature id for the '<em><b>Description Text</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int SECTION__DESCRIPTION_TEXT = 1;

    /**
     * The feature id for the '<em><b>Icon Path</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int SECTION__ICON_PATH = 2;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int SECTION__DESCRIPTION = 3;

    /**
     * The feature id for the '<em><b>Owned Activities</b></em>' containment
     * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int SECTION__OWNED_ACTIVITIES = 4;

    /**
     * The number of structural features of the '<em>Section</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int SECTION_FEATURE_COUNT = 5;

    /**
     * The meta object id for the
     * '{@link org.obeonetwork.jarvis.workflow.impl.ActivityImpl
     * <em>Activity</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.obeonetwork.jarvis.workflow.impl.ActivityImpl
     * @see org.obeonetwork.jarvis.workflow.impl.WorkflowPackageImpl#getActivity()
     * @generated
     */
    int ACTIVITY = 3;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int ACTIVITY__LABEL = 0;

    /**
     * The feature id for the '<em><b>Icon Path</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int ACTIVITY__ICON_PATH = 1;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int ACTIVITY__DESCRIPTION = 2;

    /**
     * The number of structural features of the '<em>Activity</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int ACTIVITY_FEATURE_COUNT = 3;

    /**
     * Returns the meta object for class
     * '{@link org.obeonetwork.jarvis.workflow.Workflow <em>Workflow</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Workflow</em>'.
     * @see org.obeonetwork.jarvis.workflow.Workflow
     * @generated
     */
    EClass getWorkflow();

    /**
     * Returns the meta object for the containment reference list
     * '{@link org.obeonetwork.jarvis.workflow.Workflow#getOwnedPages <em>Owned
     * Pages</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>Owned
     *         Pages</em>'.
     * @see org.obeonetwork.jarvis.workflow.Workflow#getOwnedPages()
     * @see #getWorkflow()
     * @generated
     */
    EReference getWorkflow_OwnedPages();

    /**
     * Returns the meta object for class
     * '{@link org.obeonetwork.jarvis.workflow.Page <em>Page</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Page</em>'.
     * @see org.obeonetwork.jarvis.workflow.Page
     * @generated
     */
    EClass getPage();

    /**
     * Returns the meta object for the attribute
     * '{@link org.obeonetwork.jarvis.workflow.Page#getTitle <em>Title</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Title</em>'.
     * @see org.obeonetwork.jarvis.workflow.Page#getTitle()
     * @see #getPage()
     * @generated
     */
    EAttribute getPage_Title();

    /**
     * Returns the meta object for the attribute
     * '{@link org.obeonetwork.jarvis.workflow.Page#getDescriptionText
     * <em>Description Text</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @return the meta object for the attribute '<em>Description Text</em>'.
     * @see org.obeonetwork.jarvis.workflow.Page#getDescriptionText()
     * @see #getPage()
     * @generated
     */
    EAttribute getPage_DescriptionText();

    /**
     * Returns the meta object for the attribute
     * '{@link org.obeonetwork.jarvis.workflow.Page#getImagePath <em>Image
     * Path</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Image Path</em>'.
     * @see org.obeonetwork.jarvis.workflow.Page#getImagePath()
     * @see #getPage()
     * @generated
     */
    EAttribute getPage_ImagePath();

    /**
     * Returns the meta object for the reference
     * '{@link org.obeonetwork.jarvis.workflow.Page#getDescription
     * <em>Description</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the reference '<em>Description</em>'.
     * @see org.obeonetwork.jarvis.workflow.Page#getDescription()
     * @see #getPage()
     * @generated
     */
    EReference getPage_Description();

    /**
     * Returns the meta object for the containment reference list
     * '{@link org.obeonetwork.jarvis.workflow.Page#getOwnedSections <em>Owned
     * Sections</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>Owned
     *         Sections</em>'.
     * @see org.obeonetwork.jarvis.workflow.Page#getOwnedSections()
     * @see #getPage()
     * @generated
     */
    EReference getPage_OwnedSections();

    /**
     * Returns the meta object for class
     * '{@link org.obeonetwork.jarvis.workflow.Section <em>Section</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Section</em>'.
     * @see org.obeonetwork.jarvis.workflow.Section
     * @generated
     */
    EClass getSection();

    /**
     * Returns the meta object for the attribute
     * '{@link org.obeonetwork.jarvis.workflow.Section#getTitle
     * <em>Title</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Title</em>'.
     * @see org.obeonetwork.jarvis.workflow.Section#getTitle()
     * @see #getSection()
     * @generated
     */
    EAttribute getSection_Title();

    /**
     * Returns the meta object for the attribute
     * '{@link org.obeonetwork.jarvis.workflow.Section#getDescriptionText
     * <em>Description Text</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @return the meta object for the attribute '<em>Description Text</em>'.
     * @see org.obeonetwork.jarvis.workflow.Section#getDescriptionText()
     * @see #getSection()
     * @generated
     */
    EAttribute getSection_DescriptionText();

    /**
     * Returns the meta object for the attribute
     * '{@link org.obeonetwork.jarvis.workflow.Section#getIconPath <em>Icon
     * Path</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Icon Path</em>'.
     * @see org.obeonetwork.jarvis.workflow.Section#getIconPath()
     * @see #getSection()
     * @generated
     */
    EAttribute getSection_IconPath();

    /**
     * Returns the meta object for the reference
     * '{@link org.obeonetwork.jarvis.workflow.Section#getDescription
     * <em>Description</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the reference '<em>Description</em>'.
     * @see org.obeonetwork.jarvis.workflow.Section#getDescription()
     * @see #getSection()
     * @generated
     */
    EReference getSection_Description();

    /**
     * Returns the meta object for the containment reference list
     * '{@link org.obeonetwork.jarvis.workflow.Section#getOwnedActivities
     * <em>Owned Activities</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @return the meta object for the containment reference list '<em>Owned
     *         Activities</em>'.
     * @see org.obeonetwork.jarvis.workflow.Section#getOwnedActivities()
     * @see #getSection()
     * @generated
     */
    EReference getSection_OwnedActivities();

    /**
     * Returns the meta object for class
     * '{@link org.obeonetwork.jarvis.workflow.Activity <em>Activity</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Activity</em>'.
     * @see org.obeonetwork.jarvis.workflow.Activity
     * @generated
     */
    EClass getActivity();

    /**
     * Returns the meta object for the attribute
     * '{@link org.obeonetwork.jarvis.workflow.Activity#getLabel
     * <em>Label</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Label</em>'.
     * @see org.obeonetwork.jarvis.workflow.Activity#getLabel()
     * @see #getActivity()
     * @generated
     */
    EAttribute getActivity_Label();

    /**
     * Returns the meta object for the attribute
     * '{@link org.obeonetwork.jarvis.workflow.Activity#getIconPath <em>Icon
     * Path</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Icon Path</em>'.
     * @see org.obeonetwork.jarvis.workflow.Activity#getIconPath()
     * @see #getActivity()
     * @generated
     */
    EAttribute getActivity_IconPath();

    /**
     * Returns the meta object for the reference
     * '{@link org.obeonetwork.jarvis.workflow.Activity#getDescription
     * <em>Description</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the reference '<em>Description</em>'.
     * @see org.obeonetwork.jarvis.workflow.Activity#getDescription()
     * @see #getActivity()
     * @generated
     */
    EReference getActivity_Description();

    /**
     * Returns the factory that creates the instances of the model. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the factory that creates the instances of the model.
     * @generated
     */
    WorkflowFactory getWorkflowFactory();

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
         * '{@link org.obeonetwork.jarvis.workflow.impl.WorkflowImpl
         * <em>Workflow</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
         * -->
         *
         * @see org.obeonetwork.jarvis.workflow.impl.WorkflowImpl
         * @see org.obeonetwork.jarvis.workflow.impl.WorkflowPackageImpl#getWorkflow()
         * @generated
         */
        EClass WORKFLOW = WorkflowPackage.eINSTANCE.getWorkflow();

        /**
         * The meta object literal for the '<em><b>Owned Pages</b></em>'
         * containment reference list feature. <!-- begin-user-doc --> <!--
         * end-user-doc -->
         *
         * @generated
         */
        EReference WORKFLOW__OWNED_PAGES = WorkflowPackage.eINSTANCE.getWorkflow_OwnedPages();

        /**
         * The meta object literal for the
         * '{@link org.obeonetwork.jarvis.workflow.impl.PageImpl <em>Page</em>}'
         * class. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.obeonetwork.jarvis.workflow.impl.PageImpl
         * @see org.obeonetwork.jarvis.workflow.impl.WorkflowPackageImpl#getPage()
         * @generated
         */
        EClass PAGE = WorkflowPackage.eINSTANCE.getPage();

        /**
         * The meta object literal for the '<em><b>Title</b></em>' attribute
         * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute PAGE__TITLE = WorkflowPackage.eINSTANCE.getPage_Title();

        /**
         * The meta object literal for the '<em><b>Description Text</b></em>'
         * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute PAGE__DESCRIPTION_TEXT = WorkflowPackage.eINSTANCE.getPage_DescriptionText();

        /**
         * The meta object literal for the '<em><b>Image Path</b></em>'
         * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute PAGE__IMAGE_PATH = WorkflowPackage.eINSTANCE.getPage_ImagePath();

        /**
         * The meta object literal for the '<em><b>Description</b></em>'
         * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EReference PAGE__DESCRIPTION = WorkflowPackage.eINSTANCE.getPage_Description();

        /**
         * The meta object literal for the '<em><b>Owned Sections</b></em>'
         * containment reference list feature. <!-- begin-user-doc --> <!--
         * end-user-doc -->
         *
         * @generated
         */
        EReference PAGE__OWNED_SECTIONS = WorkflowPackage.eINSTANCE.getPage_OwnedSections();

        /**
         * The meta object literal for the
         * '{@link org.obeonetwork.jarvis.workflow.impl.SectionImpl
         * <em>Section</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
         * -->
         *
         * @see org.obeonetwork.jarvis.workflow.impl.SectionImpl
         * @see org.obeonetwork.jarvis.workflow.impl.WorkflowPackageImpl#getSection()
         * @generated
         */
        EClass SECTION = WorkflowPackage.eINSTANCE.getSection();

        /**
         * The meta object literal for the '<em><b>Title</b></em>' attribute
         * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute SECTION__TITLE = WorkflowPackage.eINSTANCE.getSection_Title();

        /**
         * The meta object literal for the '<em><b>Description Text</b></em>'
         * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute SECTION__DESCRIPTION_TEXT = WorkflowPackage.eINSTANCE.getSection_DescriptionText();

        /**
         * The meta object literal for the '<em><b>Icon Path</b></em>' attribute
         * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute SECTION__ICON_PATH = WorkflowPackage.eINSTANCE.getSection_IconPath();

        /**
         * The meta object literal for the '<em><b>Description</b></em>'
         * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EReference SECTION__DESCRIPTION = WorkflowPackage.eINSTANCE.getSection_Description();

        /**
         * The meta object literal for the '<em><b>Owned Activities</b></em>'
         * containment reference list feature. <!-- begin-user-doc --> <!--
         * end-user-doc -->
         *
         * @generated
         */
        EReference SECTION__OWNED_ACTIVITIES = WorkflowPackage.eINSTANCE.getSection_OwnedActivities();

        /**
         * The meta object literal for the
         * '{@link org.obeonetwork.jarvis.workflow.impl.ActivityImpl
         * <em>Activity</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
         * -->
         *
         * @see org.obeonetwork.jarvis.workflow.impl.ActivityImpl
         * @see org.obeonetwork.jarvis.workflow.impl.WorkflowPackageImpl#getActivity()
         * @generated
         */
        EClass ACTIVITY = WorkflowPackage.eINSTANCE.getActivity();

        /**
         * The meta object literal for the '<em><b>Label</b></em>' attribute
         * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute ACTIVITY__LABEL = WorkflowPackage.eINSTANCE.getActivity_Label();

        /**
         * The meta object literal for the '<em><b>Icon Path</b></em>' attribute
         * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute ACTIVITY__ICON_PATH = WorkflowPackage.eINSTANCE.getActivity_IconPath();

        /**
         * The meta object literal for the '<em><b>Description</b></em>'
         * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EReference ACTIVITY__DESCRIPTION = WorkflowPackage.eINSTANCE.getActivity_Description();

    }

} // WorkflowPackage
