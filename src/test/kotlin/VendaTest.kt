
import org.junit.Test
import kotlin.test.assertEquals

class VendaTest {
    private val venda = Venda()
    @Test
    fun testarSeRetornaOValorTotalDoPedidoSemDesconto(){
        val pedido = arrayListOf("Maça","Laranja","Maça")
        val totalPedido = venda.vendaSemDesconto(pedido)

        assertEquals("Valor total do pedido: R$1.45\nStatus do pedido: Finalizado", totalPedido )
    }
    @Test
    fun testarSeRetornaOvalorTotalDoPedidoComDesconto(){
        val pedido = arrayListOf("Maça","Laranja","Maça")
        val totalPedido = venda.vendaComDesconto(pedido)

        assertEquals("Valor total do pedido: R$0.85\nStatus do pedido: Finalizado", totalPedido )
    }
}