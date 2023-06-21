package graub;

import java.util.Scanner;

public class App {

	// Funções do menu
	public static int abreLoja(Scanner op) {
		System.out.println("-----------------------------------------------\n" 
			+ "Digite o numero da acao que deseja realizar:\n"
			+ "1) Ver itens disponiveis;\n" 
			+ "2) Ver carrinho;\n" 
			+ "3) Finalizar compra;\n" 
			+ "0) Sair;\n"
			+ "-----------------------------------------------\n");
		return op.nextInt();
	}

	public static int abreLojaFunc(Scanner op) {
		System.out.println("-----------------------------------------------\n" 
			+ "Digite o numero da acao que deseja realizar:\n"
			+ "1) Adicionar eletrodomestico no estoque;\n" 
			+ "2) Adicionar eletronicos no estoque;\n" 
			+ "3) Adicionar livros no estoque;\n" 
			+ "4) Adicionar roupas no estoque;\n"
			+ "4) Remover produtos do estoque;\n"
			+ "0) Sair;\n"
			+ "-----------------------------------------------\n");
		return op.nextInt();
	}

	public static int verItens(Scanner s) {
		System.out.println("-----------------------------------------------\n" 
			+ "Digite o número do tipo de produto:\n"
			+ "1) Eletronicos;\n"
			+ "2) Eletrodomesticos;\n"
			+ "3) Livros;\n" 
			+ "4) Roupas;\n" 
			+ "5) Voltar\n"
			+ "-----------------------------------------------\n");
		return s.nextInt();
	}

	public static int verCarrinho(Scanner s) {
		System.out.println("-----------------------------------------------\n" 
			+ "Digite a opcao desejada:\n"
			+ "1) Deletar algum item;\n" 
			+ "2) Voltar;\n" 
			+ "-----------------------------------------------\n");
		return s.nextInt();
	}

	// Main
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Scanner scannerF = new Scanner(System.in);
		int op = 99;
		int conta = 0;
		int id = 0;
		int quant = 0;
		boolean exit = false;

		// Estoque
		Estoque estoque = new Estoque();

		// Eletrodomesticos
		estoque.adicionarProduto(new Eletrodomesticos("Geladeira Eletrolux", 1200.0f, 101, 4, "Eletrolux", "Cinza", "220v"));
		estoque.adicionarProduto(new Eletrodomesticos("Cafeteira Philips", 300.0f, 102, 10, "Philips", "Preto", "220v"));

		// Livros
		estoque.adicionarProduto(new Livro("Harry Potter", 15.2f, 201, 10, "RJ Holland", "Editora"));
		estoque.adicionarProduto(new Livro("Percy jackson", 35.2f, 202, 20, "Maria", "Filanema"));
		estoque.adicionarProduto(new Livro("Album do Brasileirao", 40, 203, 50, "Eduardo Rodrigues", "Panini"));
		estoque.adicionarProduto(new Livro("O poder do hábito", 44.2f, 204, 100, "RJ Holland", "Filanema"));
		estoque.adicionarProduto(new Livro("Harry Potter e a Pedra Filosofal", 15.2f, 205, 50, "RJ Holland", "Editora"));

		// Eletronicos

		// Roupas

		Carrinho carrinho = new Carrinho();

		// Menu
		do{
			System.out.println("Bem vindo a Amazon!\n" 
				+ "Digite o tipo de conta:\n" 
				+ "1) Funcionario\n" 
				+ "2) Cliente\n"
				+ "0) Sair");

			conta = scanner.nextInt();

			switch (conta) {
			case 1:
				do{
					op = abreLojaFunc(scanner);

					switch (op) {
					case 1:
						System.out.println("Digite o nome:");
						String nome1 = scannerF.nextLine();
						System.out.println("Digite o preco:");
						float preco1 = Float.parseFloat(scannerF.nextLine());
						System.out.println("Digite o ID:");
						int id1 = Integer.parseInt(scannerF.nextLine());
						System.out.println("Digite a quantidade:");
						int quantidade1 = Integer.parseInt(scannerF.nextLine());
						System.out.println("Digite a marca:");
						String marca1 = scannerF.nextLine();
						System.out.println("Digite a cor:");
						String cor1 = scannerF.nextLine();
						System.out.println("Digite a tensão:");
						String tensao1 = scannerF.nextLine();
						estoque.adicionarProduto(new Eletrodomesticos(nome1, preco1, id1, quantidade1, marca1, cor1, tensao1));
						break;

					case 2:
						System.out.println("Digite o nome:");
						String nome2 = scannerF.nextLine();
						System.out.println("Digite o preco:");
						float preco2 = Float.parseFloat(scannerF.nextLine());
						System.out.println("Digite o ID:");
						int id2 = Integer.parseInt(scannerF.nextLine());
						System.out.println("Digite a quantidade:");
						int quantidade2 = Integer.parseInt(scannerF.nextLine());
						System.out.println("Digite a marca:");
						String marca2 = scannerF.nextLine();
						System.out.println("Digite o tipo:");
						String tipo = scannerF.nextLine();
						estoque.adicionarProduto(new Eletronicos(nome2, preco2, quantidade2, id2, marca2, tipo));
						break;

					case 3:
						System.out.println("Digite o nome:");
						String nome3 = scannerF.nextLine();
						System.out.println("Digite o preco:");
						float preco3 = Float.parseFloat(scannerF.nextLine());
						System.out.println("Digite o ID:");
						int id3 = Integer.parseInt(scannerF.nextLine());
						System.out.println("Digite a quantidade:");
						int quantidade3 = Integer.parseInt(scannerF.nextLine());
						System.out.println("Digite a editora:");
						String editora = scannerF.nextLine();
						System.out.println("Digite o autor:");
						String autor = scannerF.nextLine();
						estoque.adicionarProduto(new Livro(nome3, preco3, id3, quantidade3, autor, editora));
						break;

					case 4:
						System.out.println("Digite o nome:");
						String nome4 = scannerF.nextLine();
						System.out.println("Digite o preco:");
						float preco4 = Float.parseFloat(scannerF.nextLine());
						System.out.println("Digite o ID:");
						int id4 = Integer.parseInt(scannerF.nextLine());
						System.out.println("Digite a quantidade:");
						int quantidade4 = Integer.parseInt(scannerF.nextLine());
						System.out.println("Digite a marca:");
						String marca4 = scannerF.nextLine();
						System.out.println("Digite o tamahho:");
						String tamanho = scannerF.nextLine();
						System.out.println("Digite a cor:");
						String cor4 = scannerF.nextLine();
						estoque.adicionarProduto(new Roupas(nome4, preco4, id4, quantidade4, marca4, cor4, tamanho));
						break;

					case 5:
						System.out.println("Digite o id do item que deseja retirar:");
						int id5 = Integer.parseInt(scannerF.nextLine());
						estoque.removerProduto(id5);
						break;

					case 0:
						break;
				
					default:
						System.out.println("Opcao invalida, tente novamente.");
					}
				} while (op != 0);
				break;

			case 0:
				exit = true;
				break;

			case 2:
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
								System.out.println(estoque.toStringEletronicos());
								System.out.println("Digite o id do item para adicionar ao carrinho:");
								id = scanner.nextInt();
								System.out.println("Digite a quantidade:");
								quant = scanner.nextInt();
								estoque.efetuarCompra(carrinho, id, quant);
								break;

							case 2:
								System.out.println("Eletrodomesticos:");
								System.out.println(estoque.toStringEletrodomesticos());
								System.out.println("Digite o id do item para adicionar ao carrinho:");
								id = scanner.nextInt();
								System.out.println("Digite a quantidade:");
								quant = scanner.nextInt();
								estoque.efetuarCompra(carrinho, id, quant);
								break;

							case 3:
								System.out.println("Livros:");
								System.out.println(estoque.toStringLivros());
								System.out.println("Digite o id do item para adicionar ao carrinho:");
								id = scanner.nextInt();
								System.out.println("Digite a quantidade:");
								quant = scanner.nextInt();
								estoque.efetuarCompra(carrinho, id, quant);
								break;

							case 4:
								System.out.println("Roupas:");
								System.out.println(estoque.toStringRoupas());
								System.out.println("Digite o id do item para adicionar ao carrinho:");
								id = scanner.nextInt();
								System.out.println("Digite a quantidade:");
								quant = scanner.nextInt();
								estoque.efetuarCompra(carrinho, id, quant);
								break;

								case 5:
									break;
							
								default:
									System.out.println("Opcao invalida, tente novamente");
							}
						} while (op2 != 5);
						break;

					case 2:
						System.out.println(carrinho.toString());
						do {
							op2 = verCarrinho(scanner);

							switch (op2) {
							case 1:
								System.out.println("Digite o id do item para remover do carrinho:");
								id = scanner.nextInt();
								System.out.println("Digite a quantidade que deseja remover:");
								quant = scanner.nextInt();
								carrinho.cancelarCompra(estoque, id, quant);
								break;
							case 2:
								break;
							}
						} while (op2 != 2);
						break;

					case 3:
						float total = carrinho.calculaPreco();
						System.out.println("Compra Finalizada!\n" 
							+ "Preço compra = " + total + "\n"
							+ "1) Sair;\n"
							+ "2) Comprar novamente;\n");

							carrinho.limpaCarrinho();

						int cfinalizada = scanner.nextInt();
						if (cfinalizada == 1) {
						return;
						}
						break;

					case 0:
						break;
				
					default:
						System.out.println("Opcao invalida, tente novamente.");
					}
				} while (op != 0);
				break;
			default:
						System.out.println("Opcao invalida, tente novamente.");
			}
		} while(exit == false);
		scanner.close();
	}
}
