package graub;

public class Roupas extends Produto{
	private String marca;
	private String cor;
	private String tamanho;
	
	// Constructors
	public Roupas(String nome, float preco, int id, int quantidade, String marca, String cor, String tamanho) {
		super(nome, preco, id, quantidade);
		this.marca = marca;
		this.cor = cor;
		this.tamanho = tamanho;
	}

	// Getters and Setters
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	@Override
	public String toString() {
		return "Roupas [Id()=" + getId() + ", marca=" + marca + ", cor=" + cor + ", tamanho=" + tamanho + ", Nome=" + getNome()
				+ ", Preco=" + getPreco() + ", quantidade=" + getQuantidade() + "]";
	}
	

}
