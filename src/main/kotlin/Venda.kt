class Venda {
    var status: String = "Status do pedido: Pendente"
        private set
    var estoqueMaca = 3
    var estoqueLaranja = 2
    val precoMaca = 0.60
    val precoLaranja = 0.25
    var totalPedido = 0.0

    // ETAPA-1
    fun vendaSemDesconto(pedido: List<String>): String {
        validarTipoDeFruta(pedido)
        validarEstoque(pedido)
        for (pedidos in pedido) {
            if (pedidos.equals("maça", ignoreCase = true)) {
                totalPedido += precoMaca
            } else if (pedidos.equals("laranja", ignoreCase = true)) {
                totalPedido += precoLaranja
            }
        }
        status = "Finalizado"
        return "Valor total do pedido: R$$totalPedido\n${notificarCliente(status)}"
    }

    // ETAPA-2
    fun vendaComDesconto(pedido: List<String>): String {
        validarTipoDeFruta(pedido)
        validarEstoque(pedido)
        val quantidadeMacas = pedido.count { it.equals("maça", ignoreCase = true) }
        val quantidadeLaranjas = pedido.count { it.equals("laranja", ignoreCase = true) }

        totalPedido += (quantidadeMacas / 2 + quantidadeMacas % 2) * precoMaca
        totalPedido += (quantidadeLaranjas / 3 * 2 + quantidadeLaranjas % 3) * precoLaranja

        status = "Finalizado"
        return "Valor total do pedido: R$$totalPedido\n${notificarCliente(status)}"
    }

    // ETAPA-3
    fun notificarCliente(status: String): String {
        return "Status do pedido: $status"
    }

    fun validarTipoDeFruta(pedido: List<String>) {
//        try {
        for (pedidos in pedido) {
            if (!pedidos.equals("maça", ignoreCase = true) && !pedidos.equals("laranja", ignoreCase = true)) {
                throw IllegalArgumentException("Por favor, digite frutas válidas!")
            }
        }
//        }catch (exception: IllegalArgumentException){
//            println(exception.message)
//        }
    }

    // ETAPA-4
    fun validarEstoque(pedidos: List<String>): Boolean {
//        try {
        val macasPedidas = pedidos.count { it.equals("maçã", ignoreCase = true) }
        val laranjasPedidas = pedidos.count { it.equals("laranja", ignoreCase = true) }

        if (macasPedidas > estoqueMaca || laranjasPedidas > estoqueLaranja) {
            throw IllegalArgumentException("Desculpe, não temos estoque suficiente para atender ao seu pedido.")
        }
        estoqueMaca -= macasPedidas
        estoqueLaranja -= laranjasPedidas
        return true
//        } catch (exception: IllegalArgumentException) {
//            println(exception.message)
//        }
    }

}