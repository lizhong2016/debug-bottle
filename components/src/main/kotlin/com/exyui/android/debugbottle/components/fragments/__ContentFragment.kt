package com.exyui.android.debugbottle.components.fragments

import android.app.Activity
import android.os.Bundle
import android.support.v4.app.Fragment

/**
 * Created by yuriel on 9/3/16.
 */
open class __ContentFragment: Fragment() {
    open val TAG = "__ContentFragment"

    open protected var context: Activity? = null

    open val isHome = false

    open fun onBackPressed(): Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onAttach(activity: Activity?) {
        super.onAttach(activity)
        context = activity
    }
}