package subtask2

class Abbreviation {

    // TODO: Complete the following function
    fun abbreviationFromA(a: String, b: String): String {
        var isInARow = true
        var index = -1
        var findIndex: Int

        for (item in b) {
            findIndex = a.indexOf(item, index, true)
            if (findIndex > index) {
                index = findIndex
            } else {
                isInARow = false
            }
        }

        return if (isInARow) "YES" else "NO"
    }
}
