package visao;

import java.util.Scanner;

import javax.swing.JOptionPane;

import loja.Produto;
import loja.Venda;

public class Principal {

	public static String menu() {
		
		String aux = "=============== Menu ==============="
				+ "\n1)Inserir produtos"
				+ "\n2)Retirar produtos"
				+ "\n3)Total das vendas"
				+ "\n4)Imprimir Produtos"
				+ "\n5)Sair\n"
				+ "====================================\n"
				+ "Informe a opção desejada: ";
		
		return aux;
	}
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		Venda v1 = new Venda();
		int key = 0;
		
		String cpf = JOptionPane.showInputDialog("Insira o cpf:");
		v1.setCpf(cpf);
		String data = JOptionPane.showInputDialog("Insira a data: ");
		v1.setData(data);
				
		do {
			
			key = Integer.parseInt(JOptionPane.showInputDialog(menu()));

			switch (key) {
			case 1:
				
				Produto p = new Produto();
				
				String nome = JOptionPane.showInputDialog("Informe o nome do produto: ");
				p.setNome(nome);
				
				float preco = Float.parseFloat(JOptionPane.showInputDialog("Informe o preço do produto: "));
				p.setPreco(preco);
				
				v1.adicionarProduto(p);
				

				//=================================================================
				
				//Outra forma de fazer seria:
				
			/*
				String nome2 = JOptionPane.showInputDialog("Informe o nome do produto: ");
				float preco2 = Float.parseFloat(JOptionPane.showInputDialog("Informe o preço do produto: "));
				Produto p2 = new Produto(nome2, preco2);
				v1.adicionarProduto(p2);
				 							*/
				
				
				break;

			case 2:
				
				String delete = JOptionPane.showInputDialog("Informe o nome do produto para ser deletado: ");
				v1.retirarProduto(delete);
				
				
				break;

			case 3:
				
				JOptionPane.showMessageDialog(null, v1.totalDaVenda());
				
				break;

			case 4:
				
				JOptionPane.showMessageDialog(null, v1.toString());
				
				break;

			case 5:
				
				JOptionPane.showMessageDialog(null, "Programa finalizado com sucesso!");
				
				break;


			default: JOptionPane.showMessageDialog(null, "Opção inválida, informe uma opção correta!");
				break;
			}
			
			
		} while (key != 5);
		
		entrada.close();
		
	}
	
}
