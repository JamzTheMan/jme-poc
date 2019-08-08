plugins {
    java
    application
    id("org.openjfx.javafxplugin") version "0.0.7"
}

repositories {
    jcenter()
    mavenCentral()
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

javafx {
    version = "11.0.2"
    modules = listOf("javafx.controls", "javafx.fxml")
}

dependencies {
    implementation("com.jayfella:jme-jfx-11:1.1.0")

    implementation("org.jmonkeyengine:jme3-core:3.2.3-stable")
    implementation ("org.jmonkeyengine:jme3-desktop:3.2.3-stable")

    implementation ("org.jmonkeyengine:jme3-terrain:3.2.3-stable")
    implementation ("org.jmonkeyengine:jme3-effects:3.2.3-stable")
    implementation ("org.jmonkeyengine:jme3-jogg:3.2.3-stable")
    implementation ("org.jmonkeyengine:jme3-blender:3.2.3-stable")
    implementation ("org.jmonkeyengine:jme3-plugins:3.2.3-stable")
    implementation ("org.jmonkeyengine:jme3-bullet:3.2.3-stable")
    implementation ("org.jmonkeyengine:jme3-bullet-native:3.2.3-stable")

    runtime ("org.jmonkeyengine:jme3-lwjgl3:3.2.3-stable")
    // runtime ("org.jmonkeyengine:jme3-jogl:3.2.3-stable")

    // https://mvnrepository.com/artifact/net.sf.sociaal/jME3-testdata
    implementation ("net.sf.sociaal:jME3-testdata:3.0.0.20130526")


    // Use JUnit test framework
    testImplementation("org.junit.jupiter:junit-jupiter:5.4.0")
    testImplementation("org.mockito:mockito-core:2.28.2")
    testImplementation("org.mockito:mockito-junit-jupiter:2.28.2")
}

application {
    // Define the main class for the application
    mainClassName = "Main"
    applicationDefaultJvmArgs = listOf("--enable-preview", "--add-opens")
}

tasks.named<JavaExec>("run") {
    doFirst {
        jvmArgs = listOf()
    }
}

tasks.wrapper {
    gradleVersion = "5.4.1"
    distributionType = Wrapper.DistributionType.ALL
}