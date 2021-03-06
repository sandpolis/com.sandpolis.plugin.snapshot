//============================================================================//
//                                                                            //
//                         Copyright © 2015 Sandpolis                         //
//                                                                            //
//  This source file is subject to the terms of the Mozilla Public License    //
//  version 2. You may not use this file except in compliance with the MPL    //
//  as published by the Mozilla Foundation.                                   //
//                                                                            //
//============================================================================//

plugins {
	id("java-library")
	id("sandpolis-java")
	id("sandpolis-module")
	id("sandpolis-protobuf")
	id("sandpolis-soi")
	id("sandpolis-plugin")
	id("sandpolis-publish")
}

dependencies {
	testImplementation("org.junit.jupiter:junit-jupiter-engine:5.7.2")

	if (project.getParent() == null) {
		api("com.sandpolis:core.instance:+")
		api("com.sandpolis:core.net:+")
	} else {
		api(project(":module:com.sandpolis.core.instance"))
		api(project(":module:com.sandpolis.core.net"))
	}
}

sandpolis_plugin {
	id = project.name
	coordinate = "com.sandpolis:sandpolis-plugin-snapshot"
	name = "Snapshot Plugin"
	description = "Snapshot Plugin"
}
