package graub;

import graub.Carrinho;
import graub.Estoque;
import graub.Produto;
import graub.ProdutoCarrinho;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.Before;
import static org.junit.jupiter.api.Assertions.*;


public class CarrinhoTest {
	private Carrinho carrinho;
    private Estoque estoque;

    @BeforeEach
    void setUp() {
        carrinho = new Carrinho();
        estoque = new Estoque();
    }

    @Test
    void testAdicionarCarrinho() {
        Produto produto = new Produto("Produto Teste", 10.0f, 1, 5);
        carrinho.adicionarCarrinho(produto, 2);

        assertEquals(1, carrinho.carrinho.size());
        ProdutoCarrinho produtoCarrinho = carrinho.carrinho.get(0);
        assertEquals("Produto Teste", produtoCarrinho.getNome());
        assertEquals(1, produtoCarrinho.getId());
        assertEquals(10.0f, produtoCarrinho.getPreco());
        assertEquals(2, produtoCarrinho.getQuantidade());
    }

    @Test
    void testRemoverCarrinho() {
        Produto produto1 = new Produto("Produto 1", 10.0f, 1, 5);
        Produto produto2 = new Produto("Produto 2", 20.0f, 2, 3);

        carrinho.adicionarCarrinho(produto1, 2);
        carrinho.adicionarCarrinho(produto2, 1);

        ProdutoCarrinho produtoCarrinho = carrinho.carrinho.get(0);
        carrinho.removerCarrinho(produtoCarrinho);

        assertEquals(1, carrinho.carrinho.size());
        assertEquals("Produto 2", carrinho.carrinho.get(0).getNome());
    }

    @Test
    void testCancelarCompra() {
        Produto produto1 = new Produto("Produto 1", 10.0f, 1, 5);
        Produto produto2 = new Produto("Produto 2", 20.0f, 2, 3);

        carrinho.adicionarCarrinho(produto1, 3);
        carrinho.adicionarCarrinho(produto2, 2);

        carrinho.cancelarCompra(estoque, 1, 2);

        assertEquals(2, carrinho.carrinho.size());
        assertEquals(1, carrinho.carrinho.get(0).getQuantidade());
        assertEquals(2, carrinho.carrinho.get(1).getQuantidade());
    }

    @Test
    void testCalculaPreco() {
        Produto produto1 = new Produto("Produto 1", 10.0f, 1, 2);
        Produto produto2 = new Produto("Produto 2", 20.0f, 2, 3);

        carrinho.adicionarCarrinho(produto1, 2);
        carrinho.adicionarCarrinho(produto2, 1);

        float preco = carrinho.calculaPreco();

        assertEquals(40.0f, preco);
    }

    @Test
    void testLimpaCarrinho() {
        Produto produto1 = new Produto("Produto 1", 10.0f, 1, 5);
        Produto produto2 = new Produto("Produto 2", 20.0f, 2, 3);

        carrinho.adicionarCarrinho(produto1, 2);
        carrinho.adicionarCarrinho(produto2, 1);

        carrinho.limpaCarrinho();

        assertEquals(0, carrinho.carrinho.size());
    }

    @Test
    void testToString() {
        Produto produto1 = new Produto("Produto 1", 10.0f, 1, 2);
        Produto produto2 = new Produto("Produto 2", 20.0f, 2, 3);

        carrinho.adicionarCarrinho(produto1, 2);
        carrinho.adicionarCarrinho(produto2, 1);

        String carrinhoString = carrinho.toString();

        String expectedString = "Produto 1, ID = 1  preco = R$10.0  quantidade = 2\n" +
                "Produto 2, ID = 2  preco = R$20.0  quantidade = 1\n";

        assertEquals(expectedString, carrinhoString);
    }
   
}
