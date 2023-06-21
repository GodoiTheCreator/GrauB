package graub;

public class Roupas extends Produto{
	private String marca;
	private String cor;
	private String tamanho;
	
	// Construtores
	public Roupas(String nome, float preco, int id, int quantidade, String marca, String cor, String tamanho) {
		super(nome, preco, id, quantidade);
		this.marca = marca;
		this.cor = cor;
		this.tamanho = tamanho;
	}

	// Getters e Setters
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

	// toString
	@Override
	public String toString() {
		return "ROUPAS -- quantidade = " + getQuantidade() + ", ID = " + getId() + ", nome = " + getNome() +", marca = " + marca + ", cor = " + cor + ", tamanho = " + tamanho
				+ ", preco = R$" + getPreco() + "\n";
	}
	

}
