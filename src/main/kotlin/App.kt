package design.patterns

import design.patterns.basic.calculator.Calculator

class App {
    val greeting: String
        get() {
            return "Hola Universidad Nacional de Costa Rica."
        }
}

fun main() {
//    println(App().greeting)
    println(Calculator(6,2,"+").Calculate())
}