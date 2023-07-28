fun main() {
    val venda = Venda()
    println("Bem-vindo(a) ao serviço de compras de frutas!")
    println("Maçãs custam 60 centavos e laranjas custam 25 centavos.")
    val pedido = arrayListOf<String>("Maça","Laranja","Maça")

    println(venda.vendaSemDesconto(pedido))
}