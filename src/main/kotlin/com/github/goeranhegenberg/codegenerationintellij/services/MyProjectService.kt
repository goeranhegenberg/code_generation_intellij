package com.github.goeranhegenberg.codegenerationintellij.services

import com.github.goeranhegenberg.codegenerationintellij.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
