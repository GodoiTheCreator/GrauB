package graub;

public class Produto {
	private String nome;
	private float preco;
	private int id;
	private int quantidade;
	
	// Constructors
	public Produto(String nome, float preco, int id, int quantidade) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.id = id;
		this.quantidade = quantidade;
	}

	// Getters and Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
		
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
}
