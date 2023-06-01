package graub;

public class Livro extends Produto {
	private String autor;
	private String editora;
	
	// Constructor
	public Livro(String nome, float preco, int id, String autor, String editora) {
		super(nome, preco, id);
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
}
