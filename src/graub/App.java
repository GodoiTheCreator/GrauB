package graub;

import java.util.Scanner;

public class App {
	public static void cancelarCompra(Estoque estoque, Carrinho carro) {
		estoque.cancelarCompra(carro.carrinho);
		carro.limpaCarrinho();
	}

	public static int abreLoja(Scanner op) {
		System.out.println(
				"-----------------------------------------------\n" + "Digite o numero da acao que deseja realizar:\n"
						+ "1) Ver itens disponiveis;\n" + "2) Ver carrinho;\n" + "3) Finalizar compra;\n" + "0) Sair;\n"
						+ "-----------------------------------------------");
		return op.nextInt();
	}
	public static int mostrarMenuOpcoes() {
		Scanner menu2 = new Scanner(System.in);

	public static int verItens(Scanner s) {
		System.out.println("-----------------------------------------------\n" + "Digite o número do tipo de produto:\n"
				+ "1) Eletronicos;\n" + "2) Eletrodomesticos;\n" + "3) Livros;\n" + "4) Roupas;\n" + "5) Voltar"
				+ "-----------------------------------------------\n");

		return s.nextInt();
	}

	public static int verCarrinho(Scanner s) {
		System.out.println("-----------------------------------------------\n" + "Digite a opcao desejada:\n"
				+ "1) Deletar algum item;\n" + "2) Voltar;\n" + "-----------------------------------------------\n");
		return s.nextInt();
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int op = 99;
		int conta = 0;
		int id = 0;

		// Estoque
		Estoque estoque1 = new Estoque();
		estoque1.adicionarEstoque(
				new Eletrodomesticos("Geladeira Eletrolux", 1200.0f, 001, 4, "Eletrolux", "Cinza", "220v"));
		estoque1.adicionarEstoque(
				new Eletrodomesticos("Cafeteira Philips", 300.0f, 002, 10, "Philips", "Preto", "220v"));
		estoque1.adicionarEstoque(new Livro("Harry Potter", 15.2f, 1221212, 10, "RJ Holland", "Editora"));
		estoque1.adicionarEstoque(new Livro("Percy jackson", 35.2f, 12123333, 20, "Maria", "Filanema"));
		estoque1.adicionarEstoque(new Livro("Album do Brasileirao", 40, 1111212, 50, "Eduardo Rodrigues", "Panini"));
		estoque1.adicionarEstoque(new Livro("O poder do hábito", 44.2f, 53252352, 100, "RJ Holland", "Filanema"));
		estoque1.adicionarEstoque(
				new Livro("Harry Potter e a Pedra Filosofal", 15.2f, 12211212, 50, "RJ Holland", "Editora"));
		Carrinho c1 = new Carrinho();

		for (Produto item : c1.carrinho) {
			if (item instanceof Livro) {
				System.out.println(item.toString());
			}
			// Menu
			System.out
					.println("Bem vindo a Amazon!\n" + "Digite o tipo de conta:\n" + "1) Funcionario\n" + "2) Cliente");
			conta = scanner.nextInt();

			if (conta == 1) {
				System.out.println(" Funcionário");
			} else {
				do {
					op = abreLoja(scanner);
					int op2 = 0;
					switch (op) {
					case 1:
						do {
							op2 = verItens(scanner);
							switch (op2) {
							case 1:
								System.out.println("Eletronicos:");
								System.out.println(estoque1.toStringEletronicos());
								System.out.println("Digite o id do item para adicionar ao carrinho:");
								id = scanner.nextInt();
								// Adiciona item no carrinho deve receber id
								break;
							case 2:
								System.out.println("Eletrodomesticos:");
								System.out.println(estoque1.toStringEletrodomesticos());
								System.out.println("Digite o id do item para adicionar ao carrinho:");
								id = scanner.nextInt();
								// Adiciona item no carrinho deve receber id

								break;
							case 3:
								System.out.println("Livros:");
								System.out.println(estoque1.toStringLivros());
								System.out.println("Digite o id do item para adicionar ao carrinho:");
								id = scanner.nextInt();
								// Adiciona item no carrinho deve receber id

								break;
							case 4:
								System.out.println("Roupas:");
								System.out.println(estoque1.toStringRoupas());
								System.out.println("Digite o id do item para adicionar ao carrinho:");
								id = scanner.nextInt();
								// Adiciona item no carrinho deve receber id

								break;
							case 5:
								break;
							}
						} while (op2 != 5);
						break;
					case 2:
						c1.toString();
						do {
							op2 = verCarrinho(scanner);
							switch (op2) {
							case 1:
								System.out.println("Digite o id do item que deseja deletar:");
								// c1.deleteCarrinho() -> Consertar função para receber o id e não o objeto;
								break;
							case 2:
								break;
							}
						} while (op2 != 3);

						break;
					case 3:
						System.out.println("Compra Finalizada!\n1) Sair;\n2) Comprar novamente;");
						int cfinalizada = scanner.nextInt();
						if (cfinalizada == 1) {
							return;
						}
						break;
					case 0:
						break;
					}
				} while (op != 0);
			}

			Carrinho carro = new Carrinho();
			for (Produto item1 : estoque1.produtos) {
				System.out.println(item1.toString());

			}

		}
	}
}
