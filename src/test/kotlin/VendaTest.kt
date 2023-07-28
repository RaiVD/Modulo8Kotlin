import org.junit.Test
import org.testng.Assert
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class VendaTest {
    private val venda = Venda()
    @Test
    fun listaDeProdutoVazia(){
        val pedido = arrayListOf<String>()
        val totalPedido = venda.vendaSemDesconto(pedido)

        assertEquals("Valor total do pedido: R$0.0\nStatus do pedido: Finalizado", totalPedido )
    }
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
    fun testValidarEstoqueZeradoParaOsDois() {
        val pedido = listOf("Maça", "Maça", "Laranja","Maça","Laranja","Laranja")
        Assert.assertThrows(IllegalArgumentException::class.java) {
            venda.validarEstoque(pedido)
        }
    }
    @Test
    fun testValidarEstoqueZeradoParaMaca() {
        val pedido = listOf("Maça", "Maça", "Laranja","Maça","Laranja","Laranja")
        Assert.assertThrows(IllegalArgumentException::class.java) {
            venda.validarEstoque(pedido)
        }
    }
    @Test
    fun testValidarEstoqueZeradoParaLaranja() {
        val pedido = listOf("Laranja", "Laranja","Laranja","Laranja")
        Assert.assertThrows(IllegalArgumentException::class.java) {
            venda.validarEstoque(pedido)
        }
    }
    @Test
    fun validarEstoqueCompleto(){
        val pedido = listOf("Laranja","Maça")
        assertTrue {venda.validarEstoque(pedido)}
    }

}