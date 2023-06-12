package graub;

public class Eletronicos extends Produto{
	private String marca;
	private String tipo;
	
	// Constructors
	public Eletronicos(String nome, float preco, int quantidade, int id, String marca, String tipo) {
		super(nome, preco, id, quantidade);
		this.marca = marca;
		this.tipo = tipo;
	}

	// Getters and Setters
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

	@Override
	public String toString() {
		return "Eletronicos [marca=" + marca + ", tipo=" + tipo + ", nome=" + getNome() + ", Preco="
				+ getPreco() + ", Id=" + getId() +  ", quantidade=" + getQuantidade() + "]";
	}
	
	
}
