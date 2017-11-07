/*******************************************************************************
 * Copyright (c) 2017 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/
package org.obeonetwork.jarvis.server.internal.services.representations;

import com.google.common.io.BaseEncoding;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.ui.business.api.dialect.DialectUIManager;
import org.eclipse.sirius.ui.tools.internal.views.common.item.RepresentationDescriptionItemImpl;
import org.eclipse.sirius.ui.tools.internal.wizards.CreateRepresentationWizard;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.DRepresentationDescriptor;
import org.eclipse.sirius.viewpoint.description.RepresentationDescription;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;
import org.obeonetwork.jarvis.server.internal.dtos.representations.CreateRepresentationDto;
import org.obeonetwork.jarvis.server.internal.dtos.representations.OpenRepresentationDto;
import org.obeonetwork.jarvis.server.internal.dtos.representations.RepresentationDto;
import org.obeonetwork.jarvis.server.internal.dtos.representations.RepresentationsDto;
import org.obeonetwork.jarvis.server.internal.services.session.SessionServices;

/**
 * The service class for the representations.
 *
 * @author sbegaudeau
 */
public class RepresentationServices {

	/**
	 * Returns the representations for the session with the given sessionId.
	 *
	 * @param sessionId
	 *            The identifier of the session
	 * @return The representations of the session
	 */
	public RepresentationsDto getRepresentations(String sessionId) {
		List<RepresentationDto> representations = new ArrayList<>();
		new SessionServices().findSessionByID(sessionId).ifPresent(s -> {
			for (DRepresentationDescriptor descriptor : DialectManager.INSTANCE.getAllRepresentationDescriptors(s)) {
				URI uri = EcoreUtil.getURI(descriptor);
				RepresentationDto dto = new RepresentationDto(BaseEncoding.base64().encode(uri.toString().getBytes()), descriptor.getName());
				representations.add(dto);
			}
		});
		return new RepresentationsDto(representations);
	}

	/**
	 * Creates a new representation in the session with the given sessionId.
	 *
	 * @param sessionId
	 *            The identifier of the session
	 * @param createRepresentationDto
	 *            The details of the representation to create
	 * @return An optional with the representation created or an empty optional if it could not be created
	 */
	@SuppressWarnings("restriction")
	public Optional<RepresentationDto> createRepresentation(String sessionId, CreateRepresentationDto createRepresentationDto) {
		Optional<Session> session = new SessionServices().findSessionByID(sessionId);
		if (session.isPresent()) {
			String repDescId = createRepresentationDto.getRepresentationId();
			findRepresentationDescription(session.get(), repDescId).ifPresent(repDesc -> {
				RepresentationDescriptionItemImpl item = new RepresentationDescriptionItemImpl(session.get(), repDesc, null);
				CreateRepresentationWizard wizard = new CreateRepresentationWizard(session.get(), item);
				wizard.init();
				Display display = PlatformUI.getWorkbench().getDisplay();
				display.syncExec(() -> {
					final WizardDialog dialog = new WizardDialog(display.getActiveShell(), wizard);
					dialog.setMinimumPageSize(CreateRepresentationWizard.MIN_PAGE_WIDTH, CreateRepresentationWizard.MIN_PAGE_HEIGHT);
					dialog.create();
					dialog.getShell().setText("Create Representation"); //$NON-NLS-1$
					dialog.open();
				});
			});
		}
		return Optional.empty();
	}

	/**
	 * Locate a {@link RepresentationDescription} in a session's enabled Viewpoints from its identifier.
	 *
	 * @param session
	 *            the session.
	 * @param id
	 *            the identified of the {@link RepresentationDescription} to find.
	 * @return the {@link RepresentationDescription}, if it could be found.
	 */
	private Optional<RepresentationDescription> findRepresentationDescription(Session session, String id) {
		return session.getSelectedViewpoints(true).stream().flatMap(vp -> vp.getOwnedRepresentations().stream())
				.filter(desc -> Objects.equals(id, desc.getName())).findFirst();
	}

	/**
	 * Opens a representation in the session with the given sessionId.
	 *
	 * @param sessionId
	 *            The identifier of the session
	 * @param openRepresentationDto
	 *            The details of the representation to open
	 * @return An optional with the representation opened or an empty optional if it could not be opened
	 */
	public Optional<RepresentationDto> openRepresentation(String sessionId, OpenRepresentationDto openRepresentationDto) {
		SessionServices svc = new SessionServices();
		Optional<Session> session = svc.findSessionByID(sessionId);
		if (session.isPresent()) {
			String repURI = new String(BaseEncoding.base64().decode(openRepresentationDto.getRepresentationId()));
			ResourceSet rs = session.get().getTransactionalEditingDomain().getResourceSet();
			DRepresentationDescriptor repDesc = (DRepresentationDescriptor) rs.getEObject(URI.createURI(repURI), false);
			DRepresentation rep = repDesc.getRepresentation();
			PlatformUI.getWorkbench().getDisplay().syncExec(() -> {
				DialectUIManager.INSTANCE.openEditor(session.get(), rep, new NullProgressMonitor());
			});
		}
		return Optional.empty();
	}
}
