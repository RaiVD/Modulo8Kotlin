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
    fun vendaComDesconto(pedido: List<String>): String {
        val precoMaca = 0.60
        val precoLaranja = 0.25
        var totalPedido = 0.0

        val quantidadeMacas = pedido.count { it.equals("maça", ignoreCase = true) }
        val quantidadeLaranjas = pedido.count { it.equals("laranja", ignoreCase = true) }

        // Oferta: Compre um e ganhe outro grátis nas maçãs
        totalPedido += (quantidadeMacas / 2 + quantidadeMacas % 2) * precoMaca

        // Oferta: 3 pelo preço de 2 em laranjas
        totalPedido += (quantidadeLaranjas / 3 * 2 + quantidadeLaranjas % 3) * precoLaranja

        return "Valor total do pedido: R$$totalPedido"
    }
}