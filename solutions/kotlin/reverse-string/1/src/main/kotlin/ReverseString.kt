fun reverse(input: String): String {
    val resultado = StringBuilder()
    
    for (i in input.lastIndex downTo 0) {
        resultado.append(input[i])
    }
    
    return resultado.toString()
}
