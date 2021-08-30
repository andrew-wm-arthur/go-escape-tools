package com.github.andrewwmarthur.goescapetools.services

import com.github.andrewwmarthur.goescapetools.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
