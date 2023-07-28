
class Venda{
    var status: String = "Pendente"
        private set
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
        status = "Finalizado"
        return "Valor total do pedido: R$$totalPedido\n${notificarCliente(status)}"
    }
    fun vendaComDesconto(pedido: List<String>): String {
        val precoMaca = 0.60
        val precoLaranja = 0.25
        var totalPedido = 0.0

        val quantidadeMacas = pedido.count { it.equals("maça", ignoreCase = true) }
        val quantidadeLaranjas = pedido.count { it.equals("laranja", ignoreCase = true) }

        totalPedido += (quantidadeMacas / 2 + quantidadeMacas % 2) * precoMaca
        totalPedido += (quantidadeLaranjas / 3 * 2 + quantidadeLaranjas % 3) * precoLaranja

        status = "Finalizado"
        return "Valor total do pedido: R$$totalPedido\n${notificarCliente(status)}"
    }
    private fun notificarCliente(status: String): String {
         return "Status do pedido: $status"
    }
}