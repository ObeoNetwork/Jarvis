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

import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.obeonetwork.jarvis.server.api.AbstractJarvisModule;
import org.obeonetwork.jarvis.server.internal.extensions.AbstractRegistryEventListener;
import org.obeonetwork.jarvis.server.internal.extensions.DescriptorRegistryEventListener;
import org.obeonetwork.jarvis.server.internal.extensions.IItemRegistry;
import org.obeonetwork.jarvis.server.internal.extensions.ItemRegistry;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

/**
 * The plugin of the bundle.
 *
 * @author sbegaudeau
 */
public final class JarvisServerPlugin {

	/**
	 * The identifier of the plugin.
	 */
	public static final String PLUGIN_ID = "org.obeonetwork.jarvis.server"; //$NON-NLS-1$

	/**
	 * The sole instance of the plugin.
	 */
	public static final JarvisServerPlugin INSTANCE = new JarvisServerPlugin();

	/**
	 * The sole instance of the bundle activator.
	 */
	private static Implementation plugin;

	/**
	 * The constructor.
	 */
	private JarvisServerPlugin() {
		super();
	}

	/**
	 * Returns the bundle activator.
	 *
	 * @return the bundle activator
	 */
	public static Implementation getPlugin() {
		return plugin;
	}

	/**
	 * The bundle activator of the bundle.
	 *
	 * @author sbegaudeau
	 */
	public static class Implementation implements BundleActivator {

		/**
		 * The name of the extension point for the Jarvis module.
		 */
		private static final String JARVIS_MODULE_EXTENSION_POINT = "jarvisModule"; //$NON-NLS-1$

		/**
		 * The registry used to retrieve the Jarvis modules for the server.
		 */
		private IItemRegistry<AbstractJarvisModule> jarvisModuleRegistry;

		/**
		 * The listener used to populate the registry of the Jarvis modules.
		 */
		private AbstractRegistryEventListener jarvisModuleRegistryListener;

		/**
		 * Manager of the Jarvis server.
		 */
		private JarvisServerManager jarvisServerManager;

		/**
		 * The constructor.
		 */
		public Implementation() {
			super();
			plugin = this;
		}

		/**
		 * {@inheritDoc}
		 *
		 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
		 */
		@Override
		public void start(BundleContext context) throws Exception {
			IExtensionRegistry registry = Platform.getExtensionRegistry();
			this.jarvisModuleRegistry = new ItemRegistry<AbstractJarvisModule>();
			this.jarvisModuleRegistryListener = new DescriptorRegistryEventListener<AbstractJarvisModule>(PLUGIN_ID, JARVIS_MODULE_EXTENSION_POINT,
					this.jarvisModuleRegistry);
			registry.addListener(this.jarvisModuleRegistryListener, PLUGIN_ID + '.' + JARVIS_MODULE_EXTENSION_POINT);
			this.jarvisModuleRegistryListener.readRegistry(registry);

			this.jarvisServerManager = new JarvisServerManager();
			this.jarvisServerManager.start(context);
		}

		/**
		 * {@inheritDoc}
		 *
		 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
		 */
		@Override
		public void stop(BundleContext context) throws Exception {
			this.jarvisServerManager.stop();

			IExtensionRegistry registry = Platform.getExtensionRegistry();

			registry.removeListener(this.jarvisModuleRegistryListener);
			this.jarvisModuleRegistryListener = null;
			this.jarvisModuleRegistry = null;
		}

		/**
		 * Returns the Jarvis module registry.
		 *
		 * @return the Jarvis module registry
		 */
		public IItemRegistry<AbstractJarvisModule> getJarvisModuleRegistry() {
			return this.jarvisModuleRegistry;
		}

	}
}
