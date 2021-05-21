package com.damlacim.bookshelf

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.damlacim.bookshelf.utils.ClientPreferences

open class BaseActivity : AppCompatActivity() {
    companion object {
        lateinit var clientPreferences: ClientPreferences
        lateinit var appContext: Context
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initApi()
    }

    private fun initApi() {
        clientPreferences = ClientPreferences(applicationContext)
    }

}