fun main() {
    val venda = Venda()
    val status = venda.status
    println("Bem-vindo(a) ao serviço de compras de frutas!")
    println("Maçãs - R$00,60 | laranjas R$00,25.\n")

    println(status)
    val pedidoSemDesconto = arrayListOf("Maça","Laranja","Maça")
    println("Lista de compra: $pedidoSemDesconto")
    println("${venda.vendaSemDesconto(pedidoSemDesconto)}\n")

    println(status)
    val pedidoComDesconto = arrayListOf("Maça","Laranja","Maça")
    println("Lista de compra: $pedidoComDesconto")
    println(venda.vendaComDesconto(pedidoComDesconto))
}