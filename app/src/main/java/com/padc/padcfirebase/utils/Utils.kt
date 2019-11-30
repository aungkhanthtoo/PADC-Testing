package com.padc.padcfirebase.utils

import android.text.format.DateUtils

fun getPostedAgoTimeWithTimeStamp(timeStamp: String): String {
    val long = if (timeStamp.length == 10) (timeStamp.toLongOrNull() ?: 0) * 1000
    else timeStamp.toLongOrNull() ?: 0

    return if (DateUtils.getRelativeTimeSpanString(long).toString() == "0 minutes ago") "Just now"
    else DateUtils.getRelativeTimeSpanString(long).toString()
}

fun format959(phone: String): String {

    return when {
        phone.startsWith("959") -> phone
        phone.startsWith("09") -> "959" + phone.substring(2, phone.length)
        else -> "959$phone"
    }
}