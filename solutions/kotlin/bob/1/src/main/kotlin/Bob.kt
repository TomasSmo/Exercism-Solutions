object Bob {
    fun hey(input: String): String {
        var text = input.trim();

        if (text.isEmpty()) {
            return "Fine. Be that way!"
        }
        
        if (text == text.uppercase() &&
                   text != text.lowercase() &&
                   text.endsWith("?")) {
            return "Calm down, I know what I'm doing!"
        } else if (text.endsWith("?")) {
            return "Sure."
        } else if (text == text.uppercase() &&
                   text != text.lowercase()) {
            return "Whoa, chill out!"
        } else {
            return "Whatever."
        }
    }
}