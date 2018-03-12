package com.yandex.android.androidyandextask1

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Canvas
import android.support.v7.widget.AppCompatTextView
import android.util.AttributeSet
import android.util.Log
import android.view.View
import android.widget.TextView


class MyTextView : AppCompatTextView {
    constructor(ctx: Context) : super(ctx)

    constructor(ctx: Context, attrs: AttributeSet) : super(ctx, attrs)

    private var _tag : String = "MyTextViewTest"

    override fun onFinishInflate() {
        super.onFinishInflate()
        Log.d(_tag, "onFinishInflate()")
    }

    override fun onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int) {
        super.onSizeChanged(w, h, oldw, oldh)
        Log.d(_tag, "onSizeChanged()")
    }

    override fun onLayout(changed: Boolean, left: Int, top: Int, right: Int, bottom: Int) {
        super.onLayout(changed, left, top, right, bottom)

        Log.d(_tag, "onLayout()")
    }

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()

        Log.d(_tag, "onAttachedToWindow()")
    }

    override fun onDetachedFromWindow() {
        super.onDetachedFromWindow()

        Log.d(_tag, "onDetachedFromWindow()")
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)

        Log.d(_tag, "onDraw()")
    }

}