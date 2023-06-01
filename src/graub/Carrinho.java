package graub;

import java.util.ArrayList;

public class Carrinho {
	ArrayList<Produto> carrinho = new ArrayList<>();
	
	
	public void addCarrinho(Produto produto) {
		carrinho.add(produto);
	}
	
	public void limpaCarrinho(Produto produto) {
		carrinho.clear();
	}
	
	public void deleteCarrinho(Produto produto) {
		carrinho.remove(produto);
	}
	
}
