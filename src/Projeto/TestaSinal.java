package Projeto;
import java.util.Scanner;

public class TestaSinal {
	public static void main(String[] args) throws InterruptedException {
		sinalv sinal = new sinalv();
		Scanner s = new Scanner(System.in);
		int opcao;

		boolean sair = true;

		while (sair) {
			sinal.SinalVermelho(10);
			System.out.println();

			System.out.println("Diga uma op��o: 1, 2 ou 3.");
			opcao = s.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("op��o um");
				break;
			case 2:
				System.out.println("op��o dois");
				break;
			case 3:
				System.out.println("op��o tres");
				break;
			default:
				System.out.println("Error");
			}

			sinal.SinalAmarelo(10);
			System.out.println();

			System.out.println("Diga uma op��o: 1, 2 ou 3.");
			opcao = s.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("op��o um");
				break;
			case 2:
				System.out.println("op��o dois");
				break;
			case 3:
				System.out.println("op��o tres");
				break;
			default:
				System.out.println("Error");
			}

			sinal.SinalVerde(10);
		}
	}
}
