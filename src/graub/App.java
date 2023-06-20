package graub;

import java.util.Scanner;

public class App {

	public static int mostrarMenu() {
		Scanner menu = new Scanner(System.in);
		System.out.println("Bem vindo ao sistema de controle de estoque da Amazon!\n"
				+ "Digite o número da ação que deseja realizar:\n"
				+ "1) Adicionar items ao estoque\n"
				+ "2) Adicionar items ao carrinho\n"
				+ "3) Mostrar estoque\n"
				+ "4) Mostrar carrinho\n"
				+ "5) Finalizar compra");
		int opcao = menu.nextInt();
		return opcao;
	public static int abreLoja(Scanner op) {
		System.out.println(
				"-----------------------------------------------\n"
						+ "Digite o numero da acao que deseja realizar:\n"
						+ "1) Ver itens disponiveis;\n"
						+ "2) Ver carrinho;\n"
						+ "3) Finalizar compra;\n"
						+ "0) Sair;\n"
						+ "-----------------------------------------------");
		return op.nextInt();
	}
	public static int mostrarMenuOpcoes() {
		Scanner menu2 = new Scanner(System.in);
		System.out.println("Digite o número do item que deseja adicionar !\n"
				+ "1) Livro\n"
				+ "2) Eletrodoméstico\n"
				+ "3) Roupa\n"
				+ "4) Eletrônico\n"
				+ "5) Voltar");
		int opcao = menu2.nextInt();
		return opcao;
	public static int verItens(Scanner s) {
		System.out.println(
				"-----------------------------------------------\n"
						+ "Digite o número do tipo de produto:\n"
						+ "1) Eletronicos;\n"
						+ "2) Eletrodomesticos;\n"
						+ "3) Livros;\n"
						+ "4) Roupas;\n"
						+ "5) Voltar"
						+ "-----------------------------------------------\n");
		
		return s.nextInt();
	}

	public static int verCarrinho(Scanner s) {
		System.out.println(
				"-----------------------------------------------\n"
						+ "Digite a opcao desejada:\n"
						+ "1) Deletar algum item;\n"
						+ "2) Voltar;\n"
						+ "-----------------------------------------------\n");
		return s.nextInt();
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int op = 99;
		int conta = 0;
		int id = 0;

		// Estoque
		Estoque estoque = new Estoque();
		estoque.adicionarEstoque(new Eletrodomesticos("Geladeira Eletrolux", 1200.0f, 001, 4, "Eletrolux", "Cinza", "220v"));
		estoque.adicionarEstoque(new Eletrodomesticos("Cafeteira Philips", 300.0f, 002, 10, "Philips", "Preto", "220v"));
				
		Carrinho c1 = new Carrinho();
		
		for (Produto item : c1.carrinho) {
			if (item instanceof livro){
				System.out.println(item.toString());
		}
		// Menu
		System.out.println("Bem vindo a Amazon!\n"
				+ "Digite o tipo de conta:\n"
				+ "1) Funcionario\n"
				+ "2) Cliente");
		conta = scanner.nextInt();
		
		
		if(conta == 1) {
			System.out.println(" Funcionário");
		} else {
			do {
				op = abreLoja(scanner);
				int op2 = 0;
				switch(op) {
					case 1:
						do {
							op2 = verItens(scanner);
							switch(op2) {
							case 1:
								System.out.println("Eletronicos:");
								System.out.println(estoque.toStringEletronicos());
								System.out.println("Digite o id do item para adicionar ao carrinho:");
								id = scanner.nextInt();
								//Adiciona item no carrinho deve receber id
								break;
							case 2:
								System.out.println("Eletrodomesticos:");
								System.out.println(estoque.toStringEletrodomesticos());
								System.out.println("Digite o id do item para adicionar ao carrinho:");
								id = scanner.nextInt();
								//Adiciona item no carrinho deve receber id

								break;
							case 3:
								System.out.println("Livros:");
								System.out.println(estoque.toStringLivros());
								System.out.println("Digite o id do item para adicionar ao carrinho:");
								id = scanner.nextInt();
								//Adiciona item no carrinho deve receber id

								break;
							case 4:
								System.out.println("Roupas:");
								System.out.println(estoque.toStringRoupas());
								System.out.println("Digite o id do item para adicionar ao carrinho:");
								id = scanner.nextInt();
								//Adiciona item no carrinho deve receber id

								break;
							case 5:
								break;
							}
						} while(op2 != 5);
						break;
					case 2:
						c1.toString();
						do {
							op2 = verCarrinho(scanner);
							switch(op2) {
							case 1:
								System.out.println("Digite o id do item que deseja deletar:");
								//c1.deleteCarrinho() -> Consertar função para receber o id e não o objeto;
								break;
							case 2:
								break;
							}
						} while(op2 != 3);
						
						break;
					case 3:
						System.out.println("Compra Finalizada!\n1) Sair;\n2) Comprar novamente;");
						int cfinalizada = scanner.nextInt();
						if(cfinalizada == 1) {
							return;
						}
						break;
					case 0:
						break;
				}
			}while(op !=0);
		}

	}

}
