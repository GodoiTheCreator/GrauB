package graub;

import java.util.ArrayList;

public class Carrinho {
	ArrayList<Produto> carrinho = new ArrayList<>();
	public Carrinho() {}
	
	public void addCarrinho(Produto produto, int quantidade) {
		carrinho.add(produto);
		produto.setQuantidade(produto.getQuantidade() - quantidade);
	}
	
	public void limpaCarrinho() {
		carrinho.clear();
	}
	
	public void deleteCarrinho(Produto produto) {
		carrinho.remove(produto);
	}
	
}