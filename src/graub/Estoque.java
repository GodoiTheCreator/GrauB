package graub;

import java.util.ArrayList;

public class Estoque {

	private ArrayList<Produto> produtos = new ArrayList();

	public Estoque() {
		
	}
	
	
	public void adicionarEstoque(Produto produto) {
		produtos.add(produto);
	}
	
	public void adicionarEstoque(ArrayList<Produto> produtos) {
		for(Produto p:produtos) {
			this.produtos.add(p);
		}
	}
	
	public void removerEstoque(Produto produto) {
		produtos.remove(produto);
	}
	
	public void removerEstoque(ArrayList<Produto> produtos) {
		for(Produto p:produtos) {
			this.produtos.remove(p);
		}
	}
		
	public String toStringEletrodomesticos() {
		String lista = "";
		for(Produto prod : produtos) {
			if(prod instanceof Eletrodomesticos) {
				lista += prod.toString() + " ";
			}
		}
		return lista;
	}
	
	public String toStringEletronicos() {
		String lista = "";
		for(Produto prod : produtos) {
			if(prod instanceof Eletronicos) {
				lista += prod.toString() + " ";
			}
		}
		return lista;
	}
	
	public String toStringLivros() {
		String lista = "";
		for(Produto prod : produtos) {
			if(prod instanceof Livro) {
				lista += prod.toString() + " ";
			}
		}
		return lista;
	}
	
	public String toStringRoupas() {
		String lista = "";
		for(Produto prod : produtos) {
			if(prod instanceof Roupas) {
				lista += prod.toString() + " ";
			}
		}
		return lista;
	}
	
	
	
	
	
	
}
