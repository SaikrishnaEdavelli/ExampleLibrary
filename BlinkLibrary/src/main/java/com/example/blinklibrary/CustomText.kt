package com.example.blinklibrary

import android.content.Context
import android.widget.TextView
import org.w3c.dom.Text


class CustomText {
    fun toastMessage(context: Context, message: String) {
        TextView.TEXT_ALIGNMENT_CENTER
        TextView(context).text = message
        TextView(context).textSize = 26F
    }
}