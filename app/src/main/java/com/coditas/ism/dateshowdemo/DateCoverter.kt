package com.coditas.ism.dateshowdemo

import java.text.SimpleDateFormat
import java.util.*

object DateConverter {
    private const val DATE_FORMAT = "yyyy/MM/dd"

    fun getDate(days: Int): String {
        val calendar = Calendar.getInstance()
        val date = SimpleDateFormat(DATE_FORMAT, Locale.getDefault())
        calendar.add(Calendar.DAY_OF_YEAR, days)
        return date.format(Date(calendar.timeInMillis))
    }
}