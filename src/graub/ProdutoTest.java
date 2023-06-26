package graub;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class ProdutoTest {

	 @Test
	    public void testGetNome() {
	        // Arrange
	        Produto produto = new Produto("Produto A", 10.0f, 1, 5);

	        // Act
	        String nome = produto.getNome();

	        // Assert
	        Assert.assertEquals("Produto A", nome);
	    }

	    @Test
	    public void testSetNome() {
	        // Arrange
	        Produto produto = new Produto("Produto A", 10.0f, 1, 5);

	        // Act
	        produto.setNome("Produto B");

	        // Assert
	        Assert.assertEquals("Produto B", produto.getNome());
	    }

	    @Test
	    public void testGetPreco() {
	        // Arrange
	        Produto produto = new Produto("Produto A", 10.0f, 1, 5);

	        // Act
	        float preco = produto.getPreco();

	        // Assert
	        Assert.assertEquals(10.0f, preco, 0.0f);
	    }

	    @Test
	    public void testSetPreco() {
	        // Arrange
	        Produto produto = new Produto("Produto A", 10.0f, 1, 5);

	        // Act
	        produto.setPreco(20.0f);

	        // Assert
	        Assert.assertEquals(20.0f, produto.getPreco(), 0.0f);
	    }

	    @Test
	    public void testGetId() {
	        // Arrange
	        Produto produto = new Produto("Produto A", 10.0f, 1, 5);

	        // Act
	        int id = produto.getId();

	        // Assert
	        Assert.assertEquals(1, id);
	    }

	    @Test
	    public void testSetId() {
	        // Arrange
	        Produto produto = new Produto("Produto A", 10.0f, 1, 5);

	        // Act
	        produto.setId(2);

	        // Assert
	        Assert.assertEquals(2, produto.getId());
	    }

	    @Test
	    public void testGetQuantidade() {
	        // Arrange
	        Produto produto = new Produto("Produto A", 10.0f, 1, 5);

	        // Act
	        int quantidade = produto.getQuantidade();

	        // Assert
	        Assert.assertEquals(5, quantidade);
	    }

	    @Test
	    public void testSetQuantidade() {
	        // Arrange
	        Produto produto = new Produto("Produto A", 10.0f, 1, 5);

	        // Act
	        produto.setQuantidade(10);

	        // Assert
	        Assert.assertEquals(10, produto.getQuantidade());
	    }

}
