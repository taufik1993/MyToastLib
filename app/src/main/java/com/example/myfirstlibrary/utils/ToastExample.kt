package com.example.myfirstlibrary.utils

import android.content.Context
import android.widget.Toast

object ToastExample {

    fun showToastMessageShort(context: Context, msg: String) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
    }

}