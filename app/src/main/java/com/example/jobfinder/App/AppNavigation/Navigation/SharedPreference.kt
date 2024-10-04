package com.example.jobfinder.App.UI.Navigation

import android.content.Context
import android.content.SharedPreferences

class SharedPrefsHelper(context: Context) {
    private val SharedPreferences: SharedPreferences =
        context.getSharedPreferences("prefs", Context.MODE_PRIVATE)

    fun setBoolean(key: String, value: Boolean) {
        SharedPreferences.edit().putBoolean( key, value ).apply()
    }
    fun getBoolean(key: String, defaultValue: Boolean): Boolean {
        return SharedPreferences.getBoolean(key, defaultValue) ?: defaultValue
    }
}