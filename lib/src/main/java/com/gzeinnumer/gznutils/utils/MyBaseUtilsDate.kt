package com.gzeinnumer.gznutils.utils

import java.text.SimpleDateFormat
import java.util.*

fun String.reformatDate(from: Array<String?>, to: Array<String?>, locale: Locale? = Locale.getDefault()): String? {
    val patternFrom = StringBuilder()
    for (s in from) patternFrom.append(s)
    var format = SimpleDateFormat(patternFrom.toString(), locale)
    val newDate = this.let {
        format.parse(it)
    }
    val patternTo = StringBuilder()
    for (s in to) patternTo.append(s)
    format = SimpleDateFormat(patternTo.toString(), locale)
    return if (newDate != null) {
        format.format(newDate)
    } else {
        "Date formater error"
    }
}

fun String.reformatDate(from: String?, to: String?, locale: Locale? = Locale.getDefault()): String? {
    var format = SimpleDateFormat(from, locale)
    val newDate = this.let {
        format.parse(it)
    }
    format = SimpleDateFormat(to, locale)
    return if (newDate != null) {
        format.format(newDate)
    } else {
        "Date formater error"
    }
}

fun String.getCurrentTime(requestFormat: String?, locale: Locale? = Locale.getDefault()): String? {
    val format = SimpleDateFormat(requestFormat, locale) //dd/MM/yyyy
    val now = Date()
    return format.format(now)
}