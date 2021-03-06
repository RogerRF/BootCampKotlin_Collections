package bootkampkotlin.collections

fun main() {
    var array = IntArray ( 5)

    //Atribuição de dados
    array[0] = 16
    array[1] = 13
    array[2] = 15
    array[3] = 12
    array[4] = 14

    //Ordenar o arranjo
    array.sort()

    //Iteração - modo 1
    println()
    for (i in array) print ( "$i " )
    //Iteração - modo 2
    println()
    array.forEach { i -> print ( "$i " ) }
    //Iteração - modo 3
    println()
    for (i in array.indices) print ( "${array[i]} " )
}