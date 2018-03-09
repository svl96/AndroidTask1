package com.yandex.android.androidyandextask1

import android.app.Application
import android.content.res.Configuration
import android.util.Log


class MyApplication : Application() {
    private var _tag: String = "MyApplicationTest"

    override fun onCreate() {
        super.onCreate()
        Log.d(_tag, "onCreate()")
    }

    override fun onConfigurationChanged(newConfig: Configuration?) {
        super.onConfigurationChanged(newConfig)
        Log.d(_tag, "onConfigurationChanged()")
    }

    override fun onTerminate() {
        super.onTerminate()
        Log.d(_tag, "onTerminate()")
    }
}