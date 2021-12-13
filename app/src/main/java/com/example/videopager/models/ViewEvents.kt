package com.example.videopager.models

sealed class ViewEvent

object LoadVideoDataEvent : ViewEvent()

sealed class PlayerLifecycleEvent : ViewEvent() {
    object Start : PlayerLifecycleEvent()
    data class Stop(val isChangingConfigurations: Boolean) : PlayerLifecycleEvent()
}

object TappedPlayerEvent : ViewEvent()

data class OnPageSettledEvent(val page: Int) : ViewEvent()

object PauseVideoEvent : ViewEvent()
