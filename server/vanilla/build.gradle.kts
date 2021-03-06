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
	id("sandpolis-soi")
}

repositories {
	maven("https://maven.pkg.github.com/cilki/qcow4j") {
		credentials {
			username = System.getenv("GITHUB_ACTOR")
			password = System.getenv("GITHUB_TOKEN")
		}
	}
}

dependencies {
	testImplementation("org.junit.jupiter:junit-jupiter-api:5.7.2")
	testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.7.2")

	implementation("com.github.cilki:qcow4j:0.0.1")

	compileOnly(project.getParent()?.getParent()!!)
}

eclipse {
	project {
		name = "com.sandpolis.plugin.snapshot:server:vanilla"
		comment = "com.sandpolis.plugin.snapshot:server:vanilla"
	}
}
