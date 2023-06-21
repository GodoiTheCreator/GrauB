package graub;

public class Eletronicos extends Produto{
	private String marca;
	private String tipo;
	
	// Construtores
	public Eletronicos(String nome, float preco, int quantidade, int id, String marca, String tipo) {
		super(nome, preco, id, quantidade);
		this.marca = marca;
		this.tipo = tipo;
	}

	// Getters e Setters
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	// toString
	@Override
	public String toString() {
		return "ELETRONICO -- quantidade = " + getQuantidade() + ", ID = " + getId() + ", marca = " + marca + ", tipo=" + tipo + ", nome=" + getNome() + ", preco = R$"
				+ getPreco() + "\n";
	}
	
	
}
