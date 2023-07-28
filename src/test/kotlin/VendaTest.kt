import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class VendaTest {
    private val venda = Venda()
    @Test
    fun testarSeRetornaOValorTotalDoPedido(){
        val pedido = arrayListOf<String>("Maça","Laranja","Maça")
        val totalPedido = venda.vendaSemDesconto(pedido)

        assertEquals("Valor total do pedido: R$1.45", totalPedido )
    }
    @Test
    fun testarSeRetornaOvalorTotalDoPedidoComDesconto(){
        val pedido = arrayListOf<String>("Maça","Laranja","Maça")
        val totalPedido = venda.vendaComDesconto(pedido)

        assertEquals("Valor total do pedido: R$0.85", totalPedido )
    }
}