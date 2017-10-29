/*******************************************************************************
 * Copyright (c) 2017 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/
package org.obeonetwork.jarvis.workflow.ui;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.ResourceSetChangeEvent;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.sirius.business.api.helper.task.ICommandTask;
import org.eclipse.sirius.business.api.helper.task.TaskHelper;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.internal.session.danalysis.DAnalysisSessionImpl;
import org.eclipse.sirius.common.tools.api.util.StringUtil;
import org.eclipse.sirius.ecore.extender.business.api.accessor.ModelAccessor;
import org.eclipse.sirius.tools.api.command.SiriusCommand;
import org.eclipse.sirius.ui.editor.SessionEditor;
import org.eclipse.sirius.ui.editor.SessionEditorPlugin;
import org.eclipse.sirius.ui.editor.api.pages.AbstractSessionEditorPage;
import org.eclipse.sirius.ui.editor.api.pages.PageProviderRegistry.PositioningKind;
import org.eclipse.sirius.ui.editor.api.pages.PageUpdateCommandBuilder.PageUpdateCommand;
import org.eclipse.sirius.viewpoint.SiriusPlugin;
import org.eclipse.sirius.viewpoint.description.Viewpoint;
import org.eclipse.sirius.viewpoint.description.tool.InitialOperation;
import org.eclipse.sirius.viewpoint.description.tool.ModelOperation;
import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.browser.LocationEvent;
import org.eclipse.swt.browser.LocationListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.obeonetwork.jarvis.workflow.Activity;
import org.obeonetwork.jarvis.workflow.Page;
import org.obeonetwork.jarvis.workflow.Section;

public class WorkflowPage extends AbstractSessionEditorPage {
    private Browser browser;

    private Session session;

    private Page page;

    public WorkflowPage(Page page) {
        super(String.format("%x", System.identityHashCode(page.getDescription())), page.getTitle());
        this.page = page;
    }

    @Override
    protected void createFormContent(IManagedForm managedForm) {
        super.createFormContent(managedForm);
        FormToolkit toolkit = managedForm.getToolkit();
        final ScrolledForm scrolledForm = managedForm.getForm();
        scrolledForm.setText(page.getTitle());
        toolkit.decorateFormHeading(scrolledForm.getForm());

        Composite body = managedForm.getForm().getBody();
        body.setLayout(GridLayoutFactory.swtDefaults().create());

        Composite subBody = toolkit.createComposite(body);
        subBody.setLayout(GridLayoutFactory.swtDefaults().numColumns(2).equalWidth(false).create());
        subBody.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
        browser = new Browser(subBody, SWT.FILL);
        GridData browserGridData = new GridData(SWT.FILL, SWT.FILL, true, true);
        // necessary to avoid bad interaction with expandable toolkit sections
        browserGridData.widthHint = 0;
        browserGridData.heightHint = 0;
        browser.setLayoutData(browserGridData);
        browser.setText(getContentHTML());
        browser.addLocationListener(new LocationListener() {
            @Override
            public void changing(LocationEvent event) {
                if (event.location != null && event.location.startsWith("exec:")) {
                    URI tool = URI.createURI(event.location.substring("exec:".length()));;
                    TransactionalEditingDomain ted = session.getTransactionalEditingDomain();
                    ted.getCommandStack().execute(new RecordingCommand(ted) {
                        @Override
                        protected void doExecute() {
                            executeOperation(((DAnalysisSessionImpl) session).getAnalyses().iterator().next(), tool.toString());
                            event.doit = false;
                        }
                    });
                }
            }

            @Override
            public void changed(LocationEvent event) {
                // Nothing
            }
        });
        session = ((SessionEditor) getEditor()).getSession();
    }

    private String getContentHTML() {
        StringBuilder html = new StringBuilder();
        html.append("<html><head><title>").append(page.getTitle()).append("</title>");
        html.append("<link href=\"http://localhost:8080/css/bootstrap.min.css\" rel=\"stylesheet\" />");
        html.append("</head><body>");
        html.append("<h1 class='page'>").append(page.getTitle()).append("</h1>");
        if (!StringUtil.isEmpty(page.getDescriptionText())) {
            html.append("<p class='pageDescription'>").append(page.getDescriptionText()).append("</p>");
        }
        for (Section section : page.getOwnedSections()) {
            html.append("<h2 class='section'>").append(section.getTitle()).append("</h2>");
            if (!StringUtil.isEmpty(section.getDescriptionText())) {
                html.append("<p class='sectionDescription'>").append(section.getDescriptionText()).append("</p>");
            }
            List<Activity> activities = section.getOwnedActivities();
            if (!activities.isEmpty()) {
                html.append("<ul class'activities'>");
                for (Activity activity : activities) {
                    html.append("<li><a href=\"").append(getActionURL(activity)).append("\"/>").append(activity.getLabel()).append("</a></li>");
                }
                html.append("</ul>");
            }
        }
        html.append("</body></html>");
        return html.toString();
    }

    private String getActionURL(Activity activity) {
        return "exec:" + EcoreUtil.getURI(activity.getDescription().getOperation());
    }
    
    public EObject executeOperation(EObject eObject, String initialCommandUri) {
        if (!eObject.eIsProxy()) {
            if (session != null) {
                ModelOperation modelOperation = findModelOperation(initialCommandUri, session);
                if (modelOperation != null) {
                    ModelAccessor modelAccessor = session.getModelAccessor();
                    ICommandTask task = new TaskHelper(modelAccessor, SiriusPlugin.getDefault().getUiCallback()).buildTaskFromModelOperation(eObject, modelOperation);
                    SiriusCommand command = new SiriusCommand(session.getTransactionalEditingDomain(), "SiriusToolServices#executeOperation"); //$NON-NLS-1$
                    command.getTasks().add(task);
                    try {
                        if (command.canExecute()) {
                            command.execute();
                        }
                    } finally {
                        command.dispose();
                    }
                }
            }
        }
        return eObject;
    }
    
    private ModelOperation findModelOperation(String initialCommandUri, Session session) {
        URI commandResourceURI = URI.createURI(initialCommandUri).trimFragment();
        for (Resource res : getResourcesInScope(session)) {
            if (commandResourceURI.equals(res.getURI())) {
                EObject modelOperationEObject = res.getEObject(URI.createURI(initialCommandUri).fragment());
                if (modelOperationEObject instanceof InitialOperation) {
                    return ((InitialOperation) modelOperationEObject).getFirstModelOperations();
                }
            }
        }
        return null;
    }
    
    private Set<Resource> getResourcesInScope(Session session) {
        Set<Resource> result = new LinkedHashSet<>();
        Collection<Viewpoint> selectedViewpoints = session.getSelectedViewpoints(true);
        for (Viewpoint viewpoint : selectedViewpoints) {
            Resource eResource = viewpoint.eResource();
            if (eResource != null) {
                result.add(eResource);
            }
        }
        return result;
    }


    @Override
    public Optional<String> getLocationId() {
        return Optional.of(SessionEditorPlugin.DEFAULT_PAGE_ID);
    }

    @Override
    public Optional<PositioningKind> getPositioning() {
        return Optional.of(PositioningKind.AFTER);
    }

    @Override
    public Optional<PageUpdateCommand> pageChanged(boolean isVisible) {
        return Optional.empty();
    }

    @Override
    public Optional<PageUpdateCommand> resourceSetChanged(ResourceSetChangeEvent resourceSetChangeEvent) {
        return Optional.empty();
    }
}
