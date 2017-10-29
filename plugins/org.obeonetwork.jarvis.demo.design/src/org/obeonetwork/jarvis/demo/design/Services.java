package org.obeonetwork.jarvis.demo.design;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.sirius.common.ui.tools.api.util.EclipseUIUtil;
import org.eclipse.swt.widgets.Shell;

/**
 * The services class used by VSM.
 */
public class Services {

	public EObject jarvisSays(EObject self, String arg) {
		Shell shell = EclipseUIUtil.getActiveEditor().getEditorSite().getShell();
		MessageDialog.openInformation(shell, "Jarvis says...", arg);
		return self;
	}
}
