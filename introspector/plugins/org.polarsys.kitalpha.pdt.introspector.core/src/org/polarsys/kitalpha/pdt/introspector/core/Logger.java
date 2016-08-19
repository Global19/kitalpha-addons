/*******************************************************************************
 * Copyright (c) 2016 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.pdt.introspector.core;

import org.eclipse.core.runtime.Platform;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.Feature;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.Plugin;

public class Logger {
	private static final String DEBUG_PLUGIN = "org.polarsys.kitalpha.pdt.introspector.core/debug/plugins";
	private static final boolean debugPluginChoice = Boolean
			.parseBoolean(Platform.getDebugOption(DEBUG_PLUGIN));
	
	private static final String DEBUG_FEATURE = "org.polarsys.kitalpha.pdt.introspector.core/debug/features";
	private static final boolean debugFeatureChoice = Boolean
			.parseBoolean(Platform.getDebugOption(DEBUG_FEATURE));

	public static void logPlugin(String msg, Plugin plugin) {
		if (debugPluginChoice)
			log(msg);
	}
	
	public static void logFeature(String msg, Feature feature){
		if(debugFeatureChoice)
			log(msg);
	}

	public static void log(String msg) {
		System.out.println(msg);
	}
}
