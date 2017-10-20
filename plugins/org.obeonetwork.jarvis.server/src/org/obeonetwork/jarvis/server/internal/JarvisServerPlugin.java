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
package org.obeonetwork.jarvis.server.internal;

import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.obeonetwork.jarvis.server.api.IJarvisServerStaticResourceProvider;
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
		 * The name of the extension point for the static resource provider.
		 */
		private static final String JARVIS_SERVER_STATIC_RESOURCE_PROVIDER_EXTENSION_POINT = "jarvisServerStaticResourceProvider"; //$NON-NLS-1$

		/**
		 * The registry used to retrieve the static resource providers for the jarvis server.
		 */
		private IItemRegistry<IJarvisServerStaticResourceProvider> jarvisServerStaticResourceProviderRegistry;

		/**
		 * The listener used to populate the registry of the static resource providers.
		 */
		private AbstractRegistryEventListener jarvisServerStaticResourceProviderListener;

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
			this.jarvisServerStaticResourceProviderRegistry = new ItemRegistry<IJarvisServerStaticResourceProvider>();
			this.jarvisServerStaticResourceProviderListener = new DescriptorRegistryEventListener<IJarvisServerStaticResourceProvider>(PLUGIN_ID,
					JARVIS_SERVER_STATIC_RESOURCE_PROVIDER_EXTENSION_POINT, this.jarvisServerStaticResourceProviderRegistry);
			registry.addListener(this.jarvisServerStaticResourceProviderListener,
					PLUGIN_ID + '.' + JARVIS_SERVER_STATIC_RESOURCE_PROVIDER_EXTENSION_POINT);
			this.jarvisServerStaticResourceProviderListener.readRegistry(registry);

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

			registry.removeListener(this.jarvisServerStaticResourceProviderListener);
			this.jarvisServerStaticResourceProviderListener = null;
			this.jarvisServerStaticResourceProviderRegistry = null;
		}

		/**
		 * Return the jarvisServerStaticResourceProviderRegistry.
		 *
		 * @return the jarvisServerStaticResourceProviderRegistry
		 */
		public IItemRegistry<IJarvisServerStaticResourceProvider> getJarvisServerStaticResourceProviderRegistry() {
			return this.jarvisServerStaticResourceProviderRegistry;
		}

	}
}
