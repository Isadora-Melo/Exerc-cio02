package loja;

public class Produto {

	private String nome;
	private float preco;
	
	
	public Produto() {
		this.nome = "";
		this.preco = 0;
		
	}

	public Produto(String nome, float preco) {
		
		this.nome = nome;
		this.preco = preco;
		
	}

	
	public String getNome() {
		return nome;
	}

	
	public void setNome(String setNome) {
		this.nome = setNome;
	}

	
	public float getPreco() {
		return preco;
	}

	
	public void setPreco(float setPreco) {
		this.preco = setPreco;
	}

	public String toString() {
	
		return "Nome do produto: " + this.nome + " -> " + this.preco ;
	}
	
}
