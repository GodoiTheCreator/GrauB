package graub;

public class ProdutoCarrinho {
    private String nome;
    private int id;
    private float preco;
    private int quantidade;

    // Construtor
    public ProdutoCarrinho(String nome, int id, float preco, int quantidade) {
        this.nome = nome;
        this.id = id;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    
    // Getters e Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public float getPreco() {
        return preco;
    }
    public void setPreco(float preco) {
        this.preco = preco;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    // toString
    @Override
    public String toString() {
        return nome + ", ID = " + id + "  preco = R$" + preco + "  quantidade = " + quantidade + "\n";
    }

    
}
