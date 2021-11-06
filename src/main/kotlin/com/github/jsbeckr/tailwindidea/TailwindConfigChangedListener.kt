package com.github.jsbeckr.tailwindidea

import java.util.EventListener

interface TailwindConfigChangedListener : EventListener {
  fun tailwindConfigChanged()
}
