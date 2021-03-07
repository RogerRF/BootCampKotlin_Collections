package bootkampkotlin.collections

fun main() {

    val f1 = Funcionario("Jonas", 0900.0, "CLT")
    val f2 = Funcionario("Pedro", 1400.0, "PJ")
    val f3 = Funcionario("Maria", 1300.0, "CLT")
    val f4 = Funcionario("Lucas", 1880.0, "PJ")

    val funcsA = mutableListOf(f1, f2, f3, f4)

    funcsA.removeAt(0)
    funcsA.add(f4)

    println("FUNCIONÁRIOS")
    funcsA
        .forEach { println(it.toString()) }
}