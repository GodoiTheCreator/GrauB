package graub;

public class Livro extends Produto {

	private String autor;
	private String editora;
	
	// Constructor
	public Livro(String nome, float preco, int id, int quantidade, String autor, String editora) {
		super(nome, preco, id, quantidade);
		this.autor = autor;
		this.editora = editora;
	}
	
	// Getters and Setters
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

	@Override
	public String toString() {
		return "Livro [Id=" + getId() +", autor=" + autor + ", editora=" + editora + ", Título=" + getNome() +  ", quantidade=" + getQuantidade() +
				", Preco=" + getPreco() "]";
	}
	
	
}
