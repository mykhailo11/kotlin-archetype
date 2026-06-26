plugins {
    id("common-conventions")
    id("application")
}

application {
    mainClass = "me.programs.ApplicationKt"
}

tasks.jar {
    manifest {
        attributes("Main-Class" to "me.programs.ApplicationKt")
    }
}
