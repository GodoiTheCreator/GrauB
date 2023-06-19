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
	}
	
	public static void main(String[] args) {
		/* teste*/
		Scanner scanner = new Scanner(System.in);
		Carrinho c1 = new Carrinho();
		Livro l1 = new Livro("Harry Potter", 15.2f, 1221212, 10, "RJ Holland", "Editora");
		Eletrodomesticos em1 = new Eletrodomesticos("Geladeira 2 portas", 1500.25f, 12312313, 10, "Samsung", "Cinza", "220V");
		c1.addCarrinho(l1);
		c1.addCarrinho(em1);
		
		for (Produto item : c1.carrinho) {
			if (item instanceof livro){
				System.out.println(item.toString());
			}
		}
		/*
		int x = mostrarMenu();
		switch(x) {
		case 1:
			int y = mostrarMenuOpcoes();
			switch(y) {
			case 1:
				System.out.println("");
			}
		
		}
		*/		
	}

}
