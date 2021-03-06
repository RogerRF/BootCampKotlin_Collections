package bootkampkotlin.collections

fun main(){

    val values = Array(3) {""}
    values[0] = "Banana"
    values[1] = "Caju"
    values[2] = "Goiaba"

    val valuez = arrayOf("Banana","Caju","Goiaba")

    //Iteração - modo 1
    println()
    for (i in values) print ( "$i " )

    //Iteração - modo 2
    println()
    valuez.forEach { i -> print ( "$i " ) }
}