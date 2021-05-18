package com.damlacim.bookshelf.utils

import android.content.Context

class ClientPreferences(val context: Context) : PreferenceManager(context) {
    companion object {
        private const val KEY_TUTORIAL_COMPLETED = "TUTORIAL_COMPLETED"
    }

    fun setTutorialCompleted(completed: Boolean) {
        putBoolean(KEY_TUTORIAL_COMPLETED, completed)
    }

    fun getTutorialCompleted(): Boolean {
        return getBooleanValue(KEY_TUTORIAL_COMPLETED, false)
    }
}