package bootkampkotlin.collections

fun main(){

    val values = intArrayOf(3,1,2,6,4)

    //Ordenar o arranjo
    values.sort()

    //Iteração - modo 1
    println()
    for (i in values) print ( "$i " )
}