package com.github.notgiveup.bookmarks.services

import com.intellij.openapi.project.Project
import com.github.notgiveup.bookmarks.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
