object Isogram {

    fun isIsogram(input: String): Boolean {
        val letters = input.uppercase().filter { it != ' ' && it != '-' }
        return letters.length == letters.toSet().size
    }
}
