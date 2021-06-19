package subtask3

import java.text.SimpleDateFormat
import java.time.LocalDate
import java.util.*
import kotlin.reflect.KClass

class Blocks {

    // TODO: Complete the following function
    fun getData(blockA: Array<*>, blockB: KClass<*>): Any {
        //throw NotImplementedError("Not implemented")
        return when (blockB) {
            Int::class -> {
                ifInt(blockA)
            }
            String::class ->{
                ifString(blockA)
            }
            LocalDate::class ->{
                ifLocalDate(blockA)
            }
            else -> (0)
        }
    }
    private fun ifInt(array: Array<*>):Int{
        var result = 0
        for (i in array) {
            if (i is Int) {
                result += i
            }
        }
        return (result)
    }
    private fun ifString(array: Array<*>):String{
        var result = ""
        for (i in array) {
            if (i is String) {
                result += i
            }
        }
        return (result)
    }
    private fun ifLocalDate(array: Array<*>):String{
        var result = LocalDate.parse("0001-01-01")
        for (i in array) {
            if (i is LocalDate && i>=result) result = i
        }
        val sdf = SimpleDateFormat("yyyy-MM-dd").parse(result.toString())
        val result2 = SimpleDateFormat("dd.MM.yyyy").format(sdf)
        return (result2)
    }
}
