package graub;

import java.util.ArrayList;

public class Estoque {

	public ArrayList<Produto> estoque = new ArrayList();

	// Construtores
	public Estoque() {}

	// Adicionar
	public boolean adicionarProduto(Produto produto) {
		for (Produto p : estoque) {
			if (produto.getId() == p.getId()) {
				return false;
			}
		}
		estoque.add(produto);
		return true;
	}

	public void alimetarEstoque(Produto produto){
		if (adicionarProduto(produto)){
			System.out.println("Produto adicionado.");
		} else {
			for(Produto p : estoque){
				if (p.getId() == produto.getId()){
					retornaProduto(p.getId(), produto.getQuantidade());
					System.out.println("Produto adicionado.");
				}
			}
		}
	}

	public void retornaProduto(int id, int quantidade){
		for (Produto p : estoque) {
			if(p.getId() == id){
				p.setQuantidade(p.getQuantidade() + quantidade);
			}
		}
	}

	public void removerProduto(int id) {
		for (Produto p : estoque) {
			if (p.getId() == id){
				estoque.remove(p);
			}
		}
		
	}

	// toString com filtro
	public String toStringEletrodomesticos() {
		String lista = "";
		for (Produto p : estoque) {
			if (p instanceof Eletrodomesticos) {
				lista += p.toString();
			}
		}
		return lista;
	}

	public String toStringEletronicos() {
		String lista = "";
		for (Produto p : estoque) {
			if (p instanceof Eletronicos) {
				lista += p.toString();
			}
		}
		return lista;
	}

	public String toStringLivros() {
		String lista = "";
		for (Produto p : estoque) {
			if (p instanceof Livro) {
				lista += p.toString();
			}
		}
		return lista;
	}

	public String toStringRoupas() {
		String lista = "";
		for (Produto p : estoque) {
			if (p instanceof Roupas) {
				lista += p.toString();
			}
		}
		return lista;
	}

	public String toStringGeral() {
		String lista = "";
		for (Produto p : estoque) {
			lista += p.toString();
		}
		return lista;
	}

	// Métodos de compra
	public boolean efetuarCompra(Carrinho carrinho, int id, int quantidade) {
		for(Produto p : estoque){
			if (p.getId() == id){
				if (p.getQuantidade() == 0){
					System.out.println("Infelizmente não temos este produto disponivel no momento, EM BREVE TEREMOS");
				} else {
					if (p.getQuantidade() >= quantidade && quantidade > 0){
						carrinho.adicionarCarrinho(p, quantidade);
						p.setQuantidade(p.getQuantidade() - quantidade);
						return true;
					} else {
					System.out.println("Quantidade invalida");
					return false;
					}
				}
			}
		}
		return false;
	}
}
