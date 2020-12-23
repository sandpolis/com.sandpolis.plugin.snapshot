//============================================================================//
//                                                                            //
//                Copyright © 2015 - 2020 Subterranean Security               //
//                                                                            //
//  This source file is subject to the terms of the Mozilla Public License    //
//  version 2. You may not use this file except in compliance with the MPL    //
//  as published by the Mozilla Foundation at:                                //
//                                                                            //
//    https://mozilla.org/MPL/2.0                                             //
//                                                                            //
//=========================================================S A N D P O L I S==//

plugins {
	id("java-library")
	id("sandpolis-java")
	id("sandpolis-module")
	id("sandpolis-protobuf")
	id("sandpolis-publish")
	id("sandpolis-soi")
	id("com.sandpolis.gradle.plugin")
}

dependencies {
	testImplementation("org.junit.jupiter:junit-jupiter-engine:5.3.2")

	api(project(":module:com.sandpolis.core.instance"))
	api(project(":module:com.sandpolis.core.net"))
}

sandpolis_plugin {
	id = project.name
	coordinate = "com.sandpolis:sandpolis-plugin-snapshot"
	name = "Snapshot Plugin"
	description = "Snapshot Plugin"
}
