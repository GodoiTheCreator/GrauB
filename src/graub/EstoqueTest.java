package graub;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EstoqueTest {

	 private Estoque estoque;
	    private Carrinho carrinho;

	    @Before
	    public void setUp() {
	        estoque = new Estoque();
	    }

	    @Test
	    public void testAdicionarProduto() {
	        Produto produto1 = new Produto("Produto 1", 10.0f, 1, 5);

	        assertTrue(estoque.adicionarProduto(produto1));

	        Produto produto2 = new Produto("Produto 2", 20.0f, 2, 3);

	        assertTrue(estoque.adicionarProduto(produto2));

	        assertFalse(estoque.adicionarProduto(produto1)); // Tentando adicionar um produto com o mesmo ID

	        assertEquals(2, estoque.estoque.size());
	    }

	    @Test
	    public void testRemoverProduto() {
	        Produto produto1 = new Produto("Produto 1", 10.0f, 1, 5);
	        Produto produto2 = new Produto("Produto 2", 20.0f, 2, 3);

	        estoque.adicionarProduto(produto1);
	        estoque.adicionarProduto(produto2);

	        estoque.removerProduto(1); // Remover o produto com ID 1

	        assertEquals(1, estoque.estoque.size());

	        estoque.removerProduto(3); // Tentando remover um produto inexistente

	        assertEquals(1, estoque.estoque.size());
	    }
	    
	   

	    @Test
	    public void testEfetuarCompra() {
	        Carrinho carrinho = new Carrinho();
	        Produto produto1 = new Produto("Produto 1", 10.0f, 1, 5);
	        Produto produto2 = new Produto("Produto 2", 20.0f, 2, 3);

	        estoque.alimetarEstoque(produto1);
	        estoque.alimetarEstoque(produto2);

	        assertTrue(estoque.efetuarCompra(carrinho, 1, 3)); // Compra válida
	        assertFalse(estoque.efetuarCompra(carrinho, 2, 5)); // Quantidade inválida
	        assertFalse(estoque.efetuarCompra(carrinho, 3, 1)); // Produto não disponível

	        // Verifica se a quantidade foi atualizada corretamente após a compra
	        assertEquals(2, produto1.getQuantidade());
	        assertEquals(3, produto2.getQuantidade());

	        // Verifica se o produto foi adicionado ao carrinho corretamente
	        assertEquals(1, carrinho.carrinho.size());
	        ProdutoCarrinho produtoCarrinho = carrinho.carrinho.get(0);
	        assertEquals(3, produtoCarrinho.getQuantidade());
	    }
	    @Test
	    public void testToStringGeral() {
	        Produto produto1 = new Produto("Produto 1", 10.0f, 1, 5);
	        Produto produto2 = new Produto("Produto 2", 20.0f, 2, 3);

	        estoque.adicionarProduto(produto1);
	        estoque.adicionarProduto(produto2);

	        String expected = "Produto: Produto 1, Preço: R$10.0, ID: 1, Quantidade: 5\n"
	                        + "Produto: Produto 2, Preço: R$20.0, ID: 2, Quantidade: 3\n";

	      
}
}
