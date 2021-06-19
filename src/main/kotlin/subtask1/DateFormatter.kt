package subtask1

import java.lang.Exception
import java.text.SimpleDateFormat
import java.util.*


class DateFormatter {

    fun toTextDay(day: String, month: String, year: String): String {
        //throw NotImplementedError("Not implemented")
        val sdf1 = SimpleDateFormat("dd MM yyyy")
        sdf1.isLenient = false
        return try {
            val c = sdf1.parse("$day $month $year")
            val dayOfWeek = SimpleDateFormat("dd MMMM, EEEE", Locale("ru"))
            (dayOfWeek.format(c))
        } catch (e: Exception) {
            ("Такого дня не существует")
        }
    }
}
