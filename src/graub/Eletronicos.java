package graub;

public class Eletronicos extends Produto{
	private String marca;
	private String tipo;
	
	// Constructors
	public Eletronicos(String nome, float preco, int id, String marca, String tipo) {
		super(nome, preco, id);
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
}
