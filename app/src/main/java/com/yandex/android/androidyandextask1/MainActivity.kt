package com.yandex.android.androidyandextask1

import android.content.res.Configuration
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    private var _tag: String = "MainActivityTest"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(_tag, "onCreate()")
    }

    override fun onStart() {
        super.onStart()
        Log.d(_tag, "onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.d(_tag, "onResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.d(_tag, "onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.d(_tag, "onStop()")
    }

    override fun onSaveInstanceState(outState: Bundle?, outPersistentState: PersistableBundle?) {
        super.onSaveInstanceState(outState, outPersistentState)
        Log.d(_tag, "onSaveInstanceState()")
    }

    override fun onConfigurationChanged(newConfig: Configuration?) {
        super.onConfigurationChanged(newConfig)
        Log.d(_tag, "onConfigurationChanged()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(_tag, "onDestroy()")
    }
}
