package subtask3

import java.time.LocalDate
import java.time.chrono.ChronoLocalDate
import java.time.format.DateTimeFormatter
import kotlin.reflect.KClass

class Blocks {

    // TODO: Complete the following function
    fun getData(blockA: Array<*>, blockB: KClass<*>): Any {
        if (blockA.isEmpty()) {
            throw IllegalArgumentException("Block can't be empty!")
        }
        var result: Any
        return when(blockB) {
            Int::class -> {
                result = 0
                for (item in blockA) {
                    if (item is Int) {
                        result += item
                    }
                }
                result
            }
            String::class -> {
                result = StringBuilder()
                for (item in blockA) {
                    if (item is String) {
                        result.append(item)
                    }
                }
                result.toString()
            }
            LocalDate::class -> {
                result = LocalDate.MIN
                for (item in blockA) {
                    if (item is LocalDate && item.isAfter(result as ChronoLocalDate?)) {
                        result = item
                    }
                }
                result as LocalDate
                result.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"))
            }
            else -> throw IllegalArgumentException("BlockB should be Int, String or Date!")
        }
    }
}
