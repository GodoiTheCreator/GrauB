package graub;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest {

	 @Test
    public void testAdicionarProduto() {
        Estoque estoque = new Estoque();
        Produto produto1 = new Produto("Produto 1", 10.0f, 1, 10);
        Produto produto2 = new Produto("Produto 2", 20.0f, 2, 5);

        assertTrue(estoque.adicionarProduto(produto1));
        assertFalse(estoque.adicionarProduto(produto1)); // Tentar adicionar o mesmo produto novamente
        assertTrue(estoque.adicionarProduto(produto2));
    }

    @Test
    public void testAlimentarEstoque() {
        Estoque estoque = new Estoque();
        Produto produto1 = new Produto("Produto 1", 10.0f, 1, 10);
        Produto produto2 = new Produto("Produto 2", 20.0f, 2, 5);

        estoque.alimetarEstoque(produto1);
        assertEquals(1, estoque.estoque.size());
        assertEquals(produto1, estoque.estoque.get(0));

        estoque.alimetarEstoque(produto2);
        assertEquals(2, estoque.estoque.size());
        assertEquals(produto2, estoque.estoque.get(1));

        Produto produto3 = new Produto("Produto 3", 30.0f, 1, 8);
        estoque.alimetarEstoque(produto3);
        assertEquals(2, estoque.estoque.size());
        assertEquals(18, estoque.estoque.get(0).getQuantidade());
    }

}
