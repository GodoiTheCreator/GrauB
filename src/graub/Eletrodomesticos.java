package graub;

public class Eletrodomesticos extends Produto{
	private String marca;
	private String cor;
	private String tensao;
	
	// Construtores
	public Eletrodomesticos(String nome, float preco, int id, int quantidade, String marca, String cor, String tensao) {
		super(nome, preco, id, quantidade);
		this.marca = marca;
		this.cor = cor;
		this.tensao = tensao;
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
	public String getTensao() {
		return tensao;
	}
	public void setTensao(String tensao) {
		this.tensao = tensao;
	}

	// toString
	@Override
	public String toString() {
		return "ELETRODOMESTICOS -- quantidade = " + getQuantidade()+ ", ID = " + getId() + ", marca = " + marca + ", cor = " + cor + ", tensao = " + tensao + ", nome = " + getNome()
				+ ", preco = R$" + getPreco() + "\n";

	}
}

