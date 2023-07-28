fun main() {
    val venda = Venda()
    val status = venda.status
    println("===== Bem-vindo(a) ao serviço de compras de frutas =====")
    println("\t\t\tMaçãs - R$00,60 | laranjas R$00,25.\n")

    println(status)
    val pedidoSemDesconto = arrayListOf<String>("Maça","Laranja","Maça")
    println("Lista de compra: $pedidoSemDesconto")
    println("${venda.vendaSemDesconto(pedidoSemDesconto)}\n")

    println(status)
    val pedidoComDesconto = arrayListOf<String>("Maça","Laranja","Maça","Laranja")
    println("Lista de compra: $pedidoComDesconto")
    println(venda.vendaComDesconto(pedidoComDesconto))
}