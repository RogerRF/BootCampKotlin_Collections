package bootkampkotlin.collections

data class Funcionario(
    val nome: String,
    val salario: Double,
    val tipoContrato: String
){
    override fun toString() = "$nome R$$salario"
}