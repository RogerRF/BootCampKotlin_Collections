package bootkampkotlin.collections

fun main() {
    var values = DoubleArray ( 5)

    //Atribuição de dados
    values[0] = 1600.0
    values[1] =  700.0
    values[2] = 1500.0
    values[3] = 1200.0
    values[4] =  900.0

    //Iteração
    println()
    values.forEachIndexed {
            index, d ->  values[index] = d*1.1
    }
    values.forEach { println(it) }

    println("\nMenor: ")
    print(values.minOrNull())
    println("\nMaior: ")
    print(values.maxOrNull())
    println("\nMédia: ")
    print(values.average())

    print("\nMaiores que 1000.00 = ")
    println(values.size - values.count { it in 0.0..1000.0 })
    values.filter { it > 1000 }.forEach { println(it) }

    print("\nValor = 1320.0 : indice = ")
    print(values.indexOfFirst { it == 1320.0 })
    print("\nAlgum valor menor que 1000.0? ")
    print(values.any { it in 0.0..1000.0 })
    print("\nAlgum valor menor que 0.0? ")
    print(values.any { it < 0.0 })

}