class Venda{
    fun vendaSemDesconto(pedido: List<String>): String {
        val precoMaca = 0.60
        val precoLaranja = 0.25
        var totalPedido = 0.0

        for(pedidos in pedido){
            if (pedidos.equals("maça", ignoreCase = true)) {
                totalPedido+=precoMaca
            } else if (pedidos.equals("laranja", ignoreCase = true)) {
                totalPedido+=precoLaranja
            } else {
                println("Inválido digite.")
            }
        }
        return "Valor total do pedido: R$$totalPedido"
    }
}