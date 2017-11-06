package org.obeonetwork.jarvis.demo.design;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.sirius.common.ui.tools.api.util.EclipseUIUtil;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;

/**
 * The services class used by VSM.
 */
public class Services {

	public EObject jarvisSays(EObject self, String arg) {
		Shell shell = EclipseUIUtil.getActiveEditor().getEditorSite().getShell();
		MessageDialog.openInformation(shell, "Jarvis says...", arg);
		return self;
	}
	
	public EObject inspect(EObject self) {
		Shell sh = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
		PlatformUI.getWorkbench().getDisplay().syncExec(() -> {
			MessageDialog.openInformation(sh, "Inspector", String.valueOf(self));
		});
		return self;
	}
}
