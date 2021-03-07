package bootkampkotlin.collections

fun main(){

    val f1 = Funcionario ( "Jonas", 0900.0, "CLT")
    val f2 = Funcionario ( "Pedro", 1400.0, "PJ")
    val f3 = Funcionario ( "Maria", 1300.0, "CLT")
    val f4 = Funcionario ( "Lucas", 1880.0, "PJ")

    val funcsA = listOf( f1, f2, f3, f4 )

    println("SALÁRIOS MAIORES QUE 1000.00")
    funcsA
        .filter   { it.salario > 1000 }
        .sortedBy { it.nome }
        .forEach  { println(it.toString()) }

    println("ORGANIZADOS POR TIPO DE CONTRATAÇÃO")
    funcsA
        //.sortedBy { it.nome }
        .groupBy  { it.tipoContrato }
        .forEach  { println(it.toString()) }

    val funcsB = listOf(f1,f2)
    val funcsC = listOf(f3,f4)

    println("FUNCIONÁRIOS - UNION DE LISTS = B + C")
    (funcsB union funcsC).forEach  { println(it.toString()) }
    println("FUNCIONÁRIOS - SUBTRACT DE LISTS = A - C")
    (funcsA subtract funcsC).forEach  { println(it.toString()) }
    println("FUNCIONÁRIOS - INTERSECT DE LISTS = B ∩ A")
    (funcsA intersect funcsB).forEach  { println(it.toString()) }
}
