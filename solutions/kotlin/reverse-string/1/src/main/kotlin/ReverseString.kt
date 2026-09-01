fun reverse(input: String): String {
    var reversedInput = ""

    for (index in input.length - 1 downTo 0) {
        reversedInput += input[index]
    }

    return reversedInput
}
