enum class BobAnswer(val answer: String) {
    QUESTION("Sure."),
    SHOUT("Whoa, chill out!"),
    SHOUT_QUESTION("Calm down, I know what I'm doing!"),
    EMPTY("Fine. Be that way!"),
    ELSE("Whatever.")
}

const val INTERROGATION = "?"

object Bob {
    
    fun hey(input: String): String {
        val text = input.trim()
        
        val answer = when {
            text.isBlank() -> BobAnswer.EMPTY
            text.isShout() && text.isQuestion() -> BobAnswer.SHOUT_QUESTION
            text.isQuestion() -> BobAnswer.QUESTION
            text.isShout() -> BobAnswer.SHOUT
            else -> BobAnswer.ELSE
        }

        return answer.answer
    }

    private fun String.isQuestion() = this.endsWith("?")
    
    private fun String.isShout(): Boolean {
        val letters = this.filter { it.isLetter() }

        return letters.isNotEmpty() && letters.all { it.isUpperCase() }
    }
}