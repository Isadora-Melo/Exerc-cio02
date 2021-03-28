package loja;

public class Venda {

	private String cpf;
	private String data;
	private Produto[] produtos;
	
	
	public Venda() {
		this.produtos = new Produto[10];
		this.cpf = "";
		this.data = "";
		
	}



	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public void adicionarProduto(Produto p) {
		
		for (int i = 0; i < produtos.length; i++) {
			
			if (produtos[i] == null) {
				
				this.produtos[i] = p;
				break;
				
			}
			
		}
		
	}

	public Produto retirarProduto(String nome) {
		
		for (int i = 0; i < produtos.length; i++) {
			
			if (produtos[i] != null) {
				
				if (produtos[i].getNome().equalsIgnoreCase(nome)) {
					
					Produto auxiliar = produtos[i];
					produtos[i] = null;
					return auxiliar;
					
				}
				
			}
			
		}
		
		return null;
	}

	public float totalDaVenda() {
	
		float totalVenda = 0;
		
		for (int i = 0; i < produtos.length; i++) {
			
			if (produtos[i] != null) {
				
				totalVenda += produtos[i].getPreco();
			}
			
		}
		return totalVenda;
	}
	
	public String toString() {
		
		String aux = "";
		
		for (int i = 0; i < produtos.length; i++) {
			
			if (produtos[i] != null) {
				
				aux = aux + produtos[i].toString() + "\n";
				
			}
			
		}
		
		return "Cpf: " + this.cpf + "\nData: " + this.data + "Produtos: \n\n" + aux;
	}
	
}
