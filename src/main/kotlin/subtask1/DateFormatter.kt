package subtask1

import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.*

class DateFormatter {

    // TODO: Complete the following function
    fun toTextDay(day: String, month: String, year: String): String {
        Locale.setDefault(Locale("ru"))

        var dateFormat = SimpleDateFormat("d M yyyy")
        dateFormat.isLenient = false

        val date: Date? = try {
            dateFormat.parse("$day $month $year")
        } catch (e: ParseException) {
            null
        }

        dateFormat = SimpleDateFormat("d MMMM, EEEE", Locale.getDefault())

        return if (date != null) dateFormat.format(date) else "Такого дня не существует"
    }
}
