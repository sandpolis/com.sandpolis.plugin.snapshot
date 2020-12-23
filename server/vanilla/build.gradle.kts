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
	id("eclipse")
	id("java-library")
	id("sandpolis-soi")
}

dependencies {
	testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.1")
	testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.6.1")

	compileOnly(project(":plugin:com.sandpolis.plugin.snapshot"))
}

eclipse {
	project {
		name = "com.sandpolis.plugin.snapshot:server:vanilla"
		comment = "com.sandpolis.plugin.snapshot:server:vanilla"
	}
}
