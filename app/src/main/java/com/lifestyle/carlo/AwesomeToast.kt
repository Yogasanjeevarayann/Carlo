package com.lifestyle.carlo

import android.content.Context
import android.widget.Toast

object AwesomeToast {

    fun makeAwesomeToast(context: Context){
        Toast.makeText(context,"Hello World",Toast.LENGTH_LONG).show()
    }
}