package com.github.bmalehorn.jetbrainsvimspired.services

import com.github.bmalehorn.jetbrainsvimspired.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
