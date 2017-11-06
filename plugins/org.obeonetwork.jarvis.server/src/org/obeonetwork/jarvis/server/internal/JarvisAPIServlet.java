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
package org.obeonetwork.jarvis.server.internal;

import com.google.gson.Gson;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.obeonetwork.jarvis.server.internal.dtos.representations.CreateRepresentationDto;
import org.obeonetwork.jarvis.server.internal.dtos.representations.RepresentationDto;
import org.obeonetwork.jarvis.server.internal.dtos.representations.RepresentationsDto;
import org.obeonetwork.jarvis.server.internal.dtos.session.SessionsDto;
import org.obeonetwork.jarvis.server.internal.dtos.workflow.PageDto;
import org.obeonetwork.jarvis.server.internal.dtos.workflow.WorkflowDto;
import org.obeonetwork.jarvis.server.internal.services.representations.RepresentationServices;
import org.obeonetwork.jarvis.server.internal.services.session.SessionServices;
import org.obeonetwork.jarvis.server.internal.services.workflow.WorkflowServices;

/**
 * The servlet of the HTTP API.
 *
 * @author sbegaudeau
 */
public class JarvisAPIServlet extends HttpServlet {

	/**
	 * The path of the servlet.
	 */
	public static final String ALIAS = "/api/*"; //$NON-NLS-1$

	/**
	 * The generated serial version UID.
	 */
	private static final long serialVersionUID = -4962587827140237763L;

	/**
	 * The application/json content type.
	 */
	private static final String APPLICATION_JSON = "application/json"; //$NON-NLS-1$

	/**
	 * The UTF-8 charset.
	 */
	private static final String UTF_8 = "UTF-8"; //$NON-NLS-1$

	/**
	 * The segment used for the sessions.
	 */
	private static final String SESSIONS = "sessions"; //$NON-NLS-1$

	/**
	 * The segment used for the workflow.
	 */
	private static final String WORKFLOW = "workflow"; //$NON-NLS-1$

	/**
	 * The segment used for the pages of the workflow.
	 */
	private static final String PAGES = "pages"; //$NON-NLS-1$

	/**
	 * The segment used for the representations of the workflow.
	 */
	private static final String REPRESENTATIONS = "representations"; //$NON-NLS-1$

	/**
	 * The segment used for the commands.
	 */
	private static final String COMMANDS = "commands"; //$NON-NLS-1$

	/**
	 * The segment used for the create representation command.
	 */
	private static final String CREATE_REPRESENTATION = "create_representation"; //$NON-NLS-1$

	/**
	 * {@inheritDoc}
	 *
	 * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest,
	 *      javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String path = req.getPathInfo();
		List<String> segments = Arrays.asList(path.split("/")); //$NON-NLS-1$

		if (this.isSessions(segments)) {
			this.getSessions(req, resp);
		} else if (this.isPages(segments)) {
			String sessionId = segments.get(2);
			String pageId = segments.get(5);
			this.getPage(req, resp, sessionId, pageId);
		} else if (this.isWorkflow(segments)) {
			String sessionId = segments.get(2);
			this.getWorkflow(req, resp, sessionId);
		} else if (this.isRepresentations(segments)) {
			String sessionId = segments.get(2);
			this.getRepresentations(req, resp, sessionId);
		} else {
			resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
		}
	}

	/**
	 * Indicates if the segments of the path match the sessions API.
	 *
	 * @param segments
	 *            The segments of the path of the request
	 * @return <code>true</code> if the segments match the sessions API, <code>false</code> otherwise
	 */
	private boolean isSessions(List<String> segments) {
		return segments.size() == 2 && SESSIONS.equals(segments.get(1));
	}

	/**
	 * Returns the sessions.
	 *
	 * @param req
	 *            The request
	 * @param resp
	 *            The response
	 * @throws IOException
	 *             In case of error
	 */
	private void getSessions(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		SessionsDto sessionsDto = new SessionServices().getSessions();
		String jsonSessionsDto = new Gson().toJson(sessionsDto);

		resp.setContentType(APPLICATION_JSON);
		resp.setCharacterEncoding(UTF_8);
		resp.getWriter().write(jsonSessionsDto);
	}

	/**
	 * Indicates if the segments of the path match the workflow API.
	 *
	 * @param segments
	 *            The segments of the path of the request
	 * @return <code>true</code> if the segments match the workflow API path, <code>false</code> otherwise
	 */
	private boolean isWorkflow(List<String> segments) {
		return segments.size() > 3 && SESSIONS.equals(segments.get(1)) && WORKFLOW.equals(segments.get(3));
	}

	/**
	 * Returns the workflow for the session with the given sessionId.
	 *
	 * @param req
	 *            The request
	 * @param resp
	 *            The response
	 * @param sessionId
	 *            The identifier of the session
	 * @throws IOException
	 *             In case of error
	 */
	private void getWorkflow(HttpServletRequest req, HttpServletResponse resp, String sessionId) throws IOException {
		Optional<WorkflowDto> optionalWorkflow = new WorkflowServices().getWorkflow(sessionId);
		if (optionalWorkflow.isPresent()) {
			WorkflowDto workflowDto = optionalWorkflow.get();
			String jsonWorkflowDto = new Gson().toJson(workflowDto);

			resp.setContentType(APPLICATION_JSON);
			resp.setCharacterEncoding(UTF_8);
			resp.getWriter().write(jsonWorkflowDto);
		} else {
			resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
		}
	}

	/**
	 * Indicates if the segment of the path match the page API.
	 *
	 * @param segments
	 *            The segment of the path of the request
	 * @return <code>true</code> if the segments match the page API path, <code>false</code> otherwise
	 */
	private boolean isPages(List<String> segments) {
		return segments.size() == 6 && SESSIONS.equals(segments.get(1)) && WORKFLOW.equals(segments.get(3)) && PAGES.equals(segments.get(4));
	}

	/**
	 * Returns the page of the workflow with the given pageId.
	 *
	 * @param req
	 *            The request
	 * @param resp
	 *            The response
	 * @param sessionId
	 *            The identifier of the session
	 * @param pageId
	 *            The identifier of the page
	 * @throws IOException
	 *             In case of error
	 */
	private void getPage(HttpServletRequest req, HttpServletResponse resp, String sessionId, String pageId) throws IOException {
		Optional<PageDto> optionalPage = new WorkflowServices().getPage(sessionId, pageId);
		if (optionalPage.isPresent()) {
			PageDto pageDto = optionalPage.get();
			String jsonPageDto = new Gson().toJson(pageDto);

			resp.setContentType(APPLICATION_JSON);
			resp.setCharacterEncoding(UTF_8);
			resp.getWriter().write(jsonPageDto);
		} else {
			resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
		}
	}

	/**
	 * Indicates if the segments match the path of the representations API.
	 *
	 * @param segments
	 *            The segments of the path of the request
	 * @return <code>true</code> if the segments match the path of the representation API, <code>false</code> otherwise
	 */
	private boolean isRepresentations(List<String> segments) {
		return segments.size() > 3 && SESSIONS.equals(segments.get(1)) && REPRESENTATIONS.equals(segments.get(3));
	}

	/**
	 * Returns the representations of the session with the given sessionId.
	 *
	 * @param req
	 *            The request
	 * @param resp
	 *            The response
	 * @param sessionId
	 *            The identifier of the session
	 * @throws IOException
	 *             In case of errors
	 */
	private void getRepresentations(HttpServletRequest req, HttpServletResponse resp, String sessionId) throws IOException {
		RepresentationsDto representationsDto = new RepresentationServices().getRepresentations(sessionId);
		String jsonRepresentationsDto = new Gson().toJson(representationsDto);

		resp.setContentType(APPLICATION_JSON);
		resp.setCharacterEncoding(UTF_8);
		resp.getWriter().write(jsonRepresentationsDto);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.HttpServletRequest,
	 *      javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String path = req.getPathInfo();
		List<String> segments = Arrays.asList(path.split("/")); //$NON-NLS-1$

		if (this.isCreateRepresentation(segments)) {
			String sessionId = segments.get(2);
			this.createRepresentation(req, resp, sessionId);
		} else {
			resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
		}
	}

	/**
	 * Indicates if the segments match the path of the create representation API.
	 *
	 * @param segments
	 *            The segments of the path of the request
	 * @return <code>true</code> if the segments match the create representation API, <code>false</code> otherwise
	 */
	private boolean isCreateRepresentation(List<String> segments) {
		return segments.size() == 5 && SESSIONS.equals(segments.get(1)) && COMMANDS.equals(segments.get(3))
				&& CREATE_REPRESENTATION.equals(segments.get(4));
	}

	/**
	 * Creates a new representation in the session with the given session identifier.
	 *
	 * @param req
	 *            The request
	 * @param resp
	 *            The response
	 * @param sessionId
	 *            The identifier of the session
	 * @throws IOException
	 *             In case of error
	 */
	private void createRepresentation(HttpServletRequest req, HttpServletResponse resp, String sessionId) throws IOException {
		CreateRepresentationDto createRepresentationDto = new Gson().fromJson(req.getReader(), CreateRepresentationDto.class);
		Optional<RepresentationDto> optionalRepresentation = new RepresentationServices().createRepresentation(sessionId, createRepresentationDto);
		if (optionalRepresentation.isPresent()) {
			RepresentationDto representationDto = optionalRepresentation.get();
			String jsonRepresentationDto = new Gson().toJson(representationDto);

			resp.setContentType(APPLICATION_JSON);
			resp.setCharacterEncoding(UTF_8);
			resp.getWriter().write(jsonRepresentationDto);
		} else {
			resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
		}
	}

}
