package com.github.jsbeckr.tailwindidea.listeners

import com.github.jsbeckr.tailwindidea.services.TailwindService
import com.intellij.openapi.project.Project
import com.intellij.openapi.project.ProjectManagerListener

internal class MyProjectManagerListener : ProjectManagerListener {

  override fun projectOpened(project: Project) {
    project.getService(TailwindService::class.java)
  }
}
