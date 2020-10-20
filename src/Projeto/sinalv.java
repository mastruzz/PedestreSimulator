package Projeto;

public class sinalv implements sinal {
	static int interval;

	@Override
	public void SinalVermelho(int tempo) throws InterruptedException {
		while (tempo >= 0) {
			System.out.println(tempo);
			Thread.sleep(30);
			tempo--;
		}
		System.out.println("----------------------");
		String[][] farol = { { "Vermelho", "[(X)]" }, { "Amarelo\t", "[( )]" }, { "Verde\t", "[( )]" } };
		for (int l = 0; l < 3; l++) {
			for (int c = 0; c < 2; c++) {
				System.out.print(farol[l][c]);

			}
			System.out.println("\n");
		}
		System.out.println("O sinal está vermelho!");
	}

	@Override
	public void SinalAmarelo(int tempo) throws InterruptedException {
		while (tempo >= 0) {
			System.out.println(tempo);
			Thread.sleep(30);
			tempo--;

		}
		System.out.println("----------------------");
		String[][] farol = { { "Vermelho", "[( )]" }, { "Amarelo\t", "[(X)]" }, { "Verde\t", "[( )]" } };
		for (int l = 0; l < 3; l++) {
			for (int c = 0; c < 2; c++) {
				System.out.print(farol[l][c]);

			}
			System.out.println("\n");
		}

		System.out.println("O sinal está amarelo!");
	}

	@Override
	public void SinalVerde(int tempo) throws InterruptedException {
		while (tempo >= 0) {
			System.out.println(tempo);
			Thread.sleep(50);
			tempo--;
		}
		System.out.println("----------------------");

		String[][] farol = { { "Vermelho\t", "[( )]" }, { "Amarelo\t", "[( )]" }, { "Verde\t", "[(X)]" } };
		for (int l = 0; l < 3; l++) {
			for (int c = 0; c < 2; c++) {
				System.out.print(farol[l][c]);

			}
			System.out.println("\n");
		}
		System.out.println("O sinal está verde!");
	}
}
