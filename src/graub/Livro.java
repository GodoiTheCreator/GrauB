package graub;

public class Livro extends Produto {

	private String autor;
	private String editora;
	
	// Construtores
	public Livro(String nome, float preco, int id, int quantidade, String autor, String editora) {
		super(nome, preco, id, quantidade);
		this.autor = autor;
		this.editora = editora;
	}
	
	// Getters e Setters
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}

	// toString
	@Override
	public String toString() {

		return "LIVRO -- quantidade = " + getQuantidade() + ", ID= " + getId() + ", título = " + getNome() + ", autor = " + autor + ", editora = " + editora +
				", preco = R$" + getPreco() + "\n";

	}
	
	
}
