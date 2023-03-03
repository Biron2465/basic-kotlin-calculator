package design.patterns.basic.calculator

class Calculator(
    private val n1: Int,
    private val n2: Int,
    private val operator: String,
) {
    fun Calculate():Int{
        return when (operator) {
            "+" -> sum(n1, n2)
            "-" -> res(n1, n2)
            "*" -> multi(n1, n2)
            "/" -> div(n1, n2)
            else -> throw IllegalArgumentException("Operador inválido: $operator")
        }
    }
    fun sum(n1:Int,n2:Int): Int{
        return n1 + n2
    }

    fun res(n1:Int,n2:Int): Int{
        return n1 - n2
    }

    fun multi(n1:Int,n2:Int): Int{
        return n1 * n2
    }

    fun div(n1:Int,n2:Int): Int{
        return n1 / n2
    }
}







