package view;

import java.util.Scanner;

import controller.DistroController;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		DistroController dc = new DistroController();

		int x = 0;
		do {
			System.out.println("========================================");
			System.out.println("|1- Para mostrar a distribuição        |");
			System.out.println("+======================================+");
			System.out.println("|9 - Para encerrar aplicação           |");
			System.out.println("========================================");
			System.out.print("Digite aqui:");
			x = sc.nextInt();
			switch (x) {
			case 1:
				dc.exibeDistro();
				break;
			case 9:
				System.err.println("Fim do programa!");
				break;
			default:
				System.err.println("Numero invalido!");
			}
			sc.nextLine();
			System.out.println("Tecle 'ENTER' para continuar.");
			sc.nextLine();
		} while (x != 9);
		sc.close();
	}

}
