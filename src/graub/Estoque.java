package graub;

import java.util.ArrayList;

public class Estoque {

	public ArrayList<Produto> produtos = new ArrayList();

	public Estoque() {

	}

	public boolean adicionarEstoque(Produto produto) {
		for (Produto item : produtos) {
			if (produto.getId() == item.getId()) {
				return false;
			}
		}
		produtos.add(produto);
		return true;
	}

	public void adicionarEstoque(ArrayList<Produto> produtos) {
		for (Produto p : produtos) {
			this.adicionarEstoque(p);
		}
	}

	public void removerEstoque(Produto produto) {
		produtos.remove(produto);
	}

	public void removerEstoque(ArrayList<Produto> produtos) {
		for (Produto p : produtos) {
			this.produtos.remove(p);
		}
	}

	public String toStringEletrodomesticos() {
		String lista = "";
		for (Produto prod : produtos) {
			if (prod instanceof Eletrodomesticos) {
				lista += prod.toString() + " ";
			}
		}
		return lista;
	}

	public String toStringEletronicos() {
		String lista = "";
		for (Produto prod : produtos) {
			if (prod instanceof Eletronicos) {
				lista += prod.toString() + " ";
			}
		}
		return lista;
	}

	public String toStringLivros() {
		String lista = "";
		for (Produto prod : produtos) {
			if (prod instanceof Livro) {
				lista += prod.toString() + " ";
			}
		}
		return lista;
	}

	public String toStringRoupas() {
		String lista = "";
		for (Produto prod : produtos) {
			if (prod instanceof Roupas) {
				lista += prod.toString() + " ";
			}
		}
		return lista;
	}

	public String toStringGeral() {
		String lista = "";
		for (Produto prod : produtos) {
			lista += prod.toString() + " ";
		}
		return lista;
	}

	public void cancelarCompra(ArrayList<Produto> produtosCarrinho) {
		for (Produto item : produtosCarrinho) {
			produtos.add(item);
		}
	}
}
