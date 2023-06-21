package graub;

import java.util.ArrayList;

public class Carrinho {
	ArrayList<ProdutoCarrinho> carrinho = new ArrayList<>();

	// Construtor
	public Carrinho() {}
	
	// Adicionar e Remover
	public void adicionarCarrinho(Produto produto, int quantidade) {
		ProdutoCarrinho produtoCarrinho = new ProdutoCarrinho(produto.getNome(), produto.getId(), produto.getPreco(), quantidade);
		int x = 0;
		for (ProdutoCarrinho p : carrinho) {
			if (produtoCarrinho.getId() == p.getId()) {
				p.setQuantidade(p.getQuantidade() + quantidade);
				x = 1;
			}
		}
		if (x == 0){
			carrinho.add(produtoCarrinho);
		}
	}
	
	public void limpaCarrinho() {
		carrinho.clear();
	}
	
	public void removerCarrinho(ProdutoCarrinho produtoCarrinho) {
		carrinho.remove(produtoCarrinho);
	}


	// Cancela compra
	public void cancelarCompra(Estoque estoque, int id, int quantidade){
		for (ProdutoCarrinho p : carrinho){
			if (p.getId() == id){
				if (quantidade == p.getQuantidade()){
					removerCarrinho(p);
					estoque.retornaProduto(id, quantidade);
					
				} if (quantidade < p.getQuantidade() && quantidade > 0){
					p.setQuantidade(p.getQuantidade() - quantidade);
					estoque.retornaProduto(id, quantidade);

				} else {
					System.out.println("Opcao invalida, tente novamente");
				}
			}
		}
	}

	// Calcula preço
	public float calculaPreco(){
		float preco = 0;
		for (ProdutoCarrinho p : carrinho) {
			preco += (p.getPreco() * p.getQuantidade());
		}
		return preco;
	}

	// toString
	@Override
	public String toString() {
		String lista = "";
		for (ProdutoCarrinho p : carrinho) {
			lista += p.toString();
		}
		return lista;
	}

	
	
}