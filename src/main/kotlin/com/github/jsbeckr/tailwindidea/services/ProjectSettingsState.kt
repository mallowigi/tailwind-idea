package com.github.jsbeckr.tailwindidea.services

import com.intellij.openapi.components.PersistentStateComponent
import com.intellij.openapi.components.State
import com.intellij.util.xmlb.XmlSerializerUtil

@State(name = "TailwindSettings")
class ProjectSettingsState : PersistentStateComponent<ProjectSettingsState> {
  var mainCssPath: String = "tailwind.js"

  override fun getState(): ProjectSettingsState = this

  override fun loadState(state: ProjectSettingsState) {
    XmlSerializerUtil.copyBean(state, this)
  }
}
