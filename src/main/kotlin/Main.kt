fun main() {
    val venda = Venda()
    println("Bem-vindo(a) ao serviço de compras de frutas!")
    println("Maçãs custam 60 centavos e laranjas custam 25 centavos.\n")

    val pedidoSemDesconto = arrayListOf<String>("Maça","Laranja","Maça")
    println("Lista de compra: $pedidoSemDesconto")
    println("${venda.vendaSemDesconto(pedidoSemDesconto)}\n")

    val pedidoComDesconto = arrayListOf<String>("Maça","Laranja","Maça")
    println("Lista de compra: $pedidoComDesconto")
    println(venda.vendaComDesconto(pedidoComDesconto))
}