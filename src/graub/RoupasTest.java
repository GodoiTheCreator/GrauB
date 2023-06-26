package graub;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



public class RoupasTest {

	 private Estoque estoque;
	    private Roupas roupas1;
	    private Roupas roupas2;

	    @BeforeEach
	    public void setUp() {
	        estoque = new Estoque();
	        roupas1 = new Roupas("Camiseta", 29.99f, 1, 10, "Nike", "Branco", "M");
	        roupas2 = new Roupas("Calça Jeans", 99.99f, 2, 5, "Levis", "Azul", "38");
	    }

	    @Test
	    public void testAdicionarProduto() {
	        // Adicionar um produto válido
	        boolean result = estoque.adicionarProduto(roupas1);
	        Assertions.assertTrue(result);
	        
	        // Tentar adicionar um produto com o mesmo ID (deve retornar false)
	        result = estoque.adicionarProduto(roupas1);
	        Assertions.assertFalse(result);
	    }

	    @Test
	    public void testAlimentarEstoque() {
	        // Adicionar um produto novo ao estoque
	        estoque.alimetarEstoque(roupas1);
	        Assertions.assertEquals(1, estoque.estoque.size());
	        
	        // Adicionar um produto já existente no estoque
	        estoque.alimetarEstoque(roupas1);
	        Assertions.assertEquals(1, estoque.estoque.size());
	        Assertions.assertEquals(20, roupas1.getQuantidade());
	    }

	    @Test
	    public void testRemoverProduto() {
	        // Adicionar produtos ao estoque
	        estoque.alimetarEstoque(roupas1);
	        estoque.alimetarEstoque(roupas2);
	        
	        // Remover um produto do estoque
	        estoque.removerProduto(1);
	        Assertions.assertEquals(1, estoque.estoque.size());
	        
	        // Remover um produto inexistente (não deve causar alterações)
	        estoque.removerProduto(3);
	        Assertions.assertEquals(1, estoque.estoque.size());
	    }

	    @Test
	    public void testToStringRoupas() {
	        // Adicionar produtos de diferentes tipos ao estoque
	        estoque.alimetarEstoque(roupas1);
	        estoque.alimetarEstoque(new Eletrodomesticos("Geladeira", 1999.99f, 3, 2, "Brastemp", "Branca", "110V"));
	        
	        // Verificar se apenas as roupas são retornadas no toStringRoupas
	        String result = estoque.toStringRoupas();
	        Assertions.assertTrue(result.contains("ROUPAS"));
	        Assertions.assertFalse(result.contains("ELETRODOMESTICOS"));
	    }

}
