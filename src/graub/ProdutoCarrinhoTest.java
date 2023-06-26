package graub;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;



public class ProdutoCarrinhoTest {

	@Test
    public void testGettersAndSetters() {
        // Arrange
        ProdutoCarrinho produto = new ProdutoCarrinho("Produto 1", 1, 10.0f, 5);
        
        // Act
        produto.setNome("Novo Produto");
        produto.setId(2);
        produto.setPreco(15.0f);
        produto.setQuantidade(3);
        
        // Assert
        Assertions.assertEquals("Novo Produto", produto.getNome());
        Assertions.assertEquals(2, produto.getId());
        Assertions.assertEquals(15.0f, produto.getPreco(), 0.01);
        Assertions.assertEquals(3, produto.getQuantidade());
    }
    
    @Test
    public void testToString() {
        // Arrange
        ProdutoCarrinho produto = new ProdutoCarrinho("Produto 1", 1, 10.0f, 5);
        
        // Act
        String produtoString = produto.toString();
        
        // Assert
        String expectedString = "Produto 1, ID = 1  preco = R$10.0  quantidade = 5\n";
        Assertions.assertEquals(expectedString, produtoString);
    }

}
