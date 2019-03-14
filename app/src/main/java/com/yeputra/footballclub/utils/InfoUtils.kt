package com.yeputra.footballclub.utils

import android.app.Activity
import android.content.Context
import android.support.design.widget.Snackbar
import android.support.v4.app.Fragment
import android.widget.Toast

fun Context.toast(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}

fun Activity.snackbar(message: String) {
    Snackbar.make(window.decorView, message, Snackbar.LENGTH_LONG).show()
}

fun Fragment.snacbar(message: String) {
    activity?.window?.decorView?.let {
        Snackbar.make(it, message, Snackbar.LENGTH_LONG).show()
    }
}