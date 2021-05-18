package com.damlacim.bookshelf.utils

import android.content.Context
import android.content.SharedPreferences

abstract class PreferenceManager(context: Context) {
    private var preferencesName: String = ""
    protected lateinit var targetPreferences: SharedPreferences

    init {
        targetPreferences = context.getSharedPreferences(preferencesName, Context.MODE_PRIVATE)
    }

    fun getBooleanValue(key: String): Boolean {
        return targetPreferences.getBoolean(key, false)
    }

    fun getBooleanValue(key: String, defaultValue: Boolean):Boolean{
        return targetPreferences.getBoolean(key, defaultValue)
    }

    fun getBooleanDefaultValue(key:String, defaultValue: Boolean):Boolean{
       return targetPreferences.getBoolean(key, defaultValue)
    }

    fun putBoolean(key: String, value: Boolean): Boolean {
        val targetEditor = targetPreferences.edit()
        targetEditor.putBoolean(key, value)
        return targetEditor.commit()
    }
}