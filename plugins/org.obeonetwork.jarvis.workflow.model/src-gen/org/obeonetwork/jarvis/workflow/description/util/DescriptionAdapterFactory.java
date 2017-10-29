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
package org.obeonetwork.jarvis.workflow.description.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.viewpoint.description.DocumentedElement;
import org.eclipse.sirius.viewpoint.description.Extension;
import org.eclipse.sirius.viewpoint.description.IdentifiedElement;
import org.obeonetwork.jarvis.workflow.description.ActivityDescription;
import org.obeonetwork.jarvis.workflow.description.DescriptionPackage;
import org.obeonetwork.jarvis.workflow.description.PageDescription;
import org.obeonetwork.jarvis.workflow.description.SectionDescription;
import org.obeonetwork.jarvis.workflow.description.WorkflowDescription;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides
 * an adapter <code>createXXX</code> method for each class of the model. <!--
 * end-user-doc -->
 *
 * @see org.obeonetwork.jarvis.workflow.description.DescriptionPackage
 * @generated
 */
public class DescriptionAdapterFactory extends AdapterFactoryImpl {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static final String copyright = "Copyright (c) 2017 Obeo.\r\nAll rights reserved. This program and the accompanying materials\r\nare made available under the terms of the Eclipse Public License v1.0\r\nwhich accompanies this distribution, and is available at\r\nhttp://www.eclipse.org/legal/epl-v10.html\r\n\r\nContributors:\r\n   Obeo - initial API and implementation\r\n"; //$NON-NLS-1$

    /**
     * The cached model package. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected static DescriptionPackage modelPackage;

    /**
     * Creates an instance of the adapter factory. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    public DescriptionAdapterFactory() {
        if (DescriptionAdapterFactory.modelPackage == null) {
            DescriptionAdapterFactory.modelPackage = DescriptionPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc --> This implementation returns <code>true</code> if
     * the object is either the model's package or is an instance object of the
     * model. <!-- end-user-doc -->
     *
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object object) {
        if (object == DescriptionAdapterFactory.modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject) object).eClass().getEPackage() == DescriptionAdapterFactory.modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected DescriptionSwitch<Adapter> modelSwitch = new DescriptionSwitch<Adapter>() {
        @Override
        public Adapter caseWorkflowDescription(WorkflowDescription object) {
            return createWorkflowDescriptionAdapter();
        }

        @Override
        public Adapter casePageDescription(PageDescription object) {
            return createPageDescriptionAdapter();
        }

        @Override
        public Adapter caseSectionDescription(SectionDescription object) {
            return createSectionDescriptionAdapter();
        }

        @Override
        public Adapter caseActivityDescription(ActivityDescription object) {
            return createActivityDescriptionAdapter();
        }

        @Override
        public Adapter caseExtension(Extension object) {
            return createExtensionAdapter();
        }

        @Override
        public Adapter caseIdentifiedElement(IdentifiedElement object) {
            return createIdentifiedElementAdapter();
        }

        @Override
        public Adapter caseDocumentedElement(DocumentedElement object) {
            return createDocumentedElementAdapter();
        }

        @Override
        public Adapter defaultCase(EObject object) {
            return createEObjectAdapter();
        }
    };

    /**
     * Creates an adapter for the <code>target</code>. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param target
     *            the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject) target);
    }

    /**
     * Creates a new adapter for an object of class
     * '{@link org.obeonetwork.jarvis.workflow.description.WorkflowDescription
     * <em>Workflow Description</em>}'. <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see org.obeonetwork.jarvis.workflow.description.WorkflowDescription
     * @generated
     */
    public Adapter createWorkflowDescriptionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class
     * '{@link org.obeonetwork.jarvis.workflow.description.PageDescription
     * <em>Page Description</em>}'. <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see org.obeonetwork.jarvis.workflow.description.PageDescription
     * @generated
     */
    public Adapter createPageDescriptionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class
     * '{@link org.obeonetwork.jarvis.workflow.description.SectionDescription
     * <em>Section Description</em>}'. <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see org.obeonetwork.jarvis.workflow.description.SectionDescription
     * @generated
     */
    public Adapter createSectionDescriptionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class
     * '{@link org.obeonetwork.jarvis.workflow.description.ActivityDescription
     * <em>Activity Description</em>}'. <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see org.obeonetwork.jarvis.workflow.description.ActivityDescription
     * @generated
     */
    public Adapter createActivityDescriptionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class
     * '{@link org.eclipse.sirius.viewpoint.description.Extension
     * <em>Extension</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a
     * case when inheritance will catch all the cases anyway. <!-- end-user-doc
     * -->
     *
     * @return the new adapter.
     * @see org.eclipse.sirius.viewpoint.description.Extension
     * @generated
     */
    public Adapter createExtensionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class
     * '{@link org.eclipse.sirius.viewpoint.description.IdentifiedElement
     * <em>Identified Element</em>}'. <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see org.eclipse.sirius.viewpoint.description.IdentifiedElement
     * @generated
     */
    public Adapter createIdentifiedElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class
     * '{@link org.eclipse.sirius.viewpoint.description.DocumentedElement
     * <em>Documented Element</em>}'. <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see org.eclipse.sirius.viewpoint.description.DocumentedElement
     * @generated
     */
    public Adapter createDocumentedElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case. <!-- begin-user-doc --> This
     * default implementation returns null. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} // DescriptionAdapterFactory
