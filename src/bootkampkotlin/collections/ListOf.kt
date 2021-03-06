package bootkampkotlin.collections

data class Funcionario(
    val nome: String,
    val salario: Double,
    val tipoContrato: String
){
    override fun toString() = "$nome R$$salario"
}

fun main(){

    val f1 = Funcionario ( "Jonas", 0900.0, "CLT")
    val f2 = Funcionario ( "Pedro", 1400.0, "PJ")
    val f3 = Funcionario ( "Maria", 1300.0, "CLT")
    val f4 = Funcionario ( "Lucas", 1880.0, "PJ")

    val funcionarios = listOf( f1, f2, f3, f4 )

    println("SALÁRIOS MAIORES QUE 1000.00")
    funcionarios
        .filter   { it.salario > 1000 }
        .sortedBy { it.nome }
        .forEach  { println(it.toString()) }

    println("ORGANIZADOS POR TIPO DE CONTRATAÇÃO")
    funcionarios
        //.sortedBy { it.nome }
        .groupBy  { it.tipoContrato }
        .forEach  { println(it.toString()) }

}
