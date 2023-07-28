import org.junit.Test
import org.testng.Assert
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
    @Test
    fun testValidarTipoDeFruta_ComFrutasInvalidas() {
        val pedido = listOf("Maça", "Banana", "Laranja")
        Assert.assertThrows(IllegalArgumentException::class.java) {
            venda.validarTipoDeFruta(pedido)
        }
    }
    @Test
    fun testValidarTipoDeFruta_ComFrutasValidas() {
        val pedido = listOf("Maça", "Laranja", "Maça")
        venda.validarTipoDeFruta(pedido)
    }
    @Test
    fun testValidarEstoqueZerado() {
        val pedido = listOf("Maça", "Maça", "Laranja","Maça","Laranja","Laranja")
        Assert.assertThrows(IllegalArgumentException::class.java) {
            venda.validarEstoque(pedido)
        }
    }
}