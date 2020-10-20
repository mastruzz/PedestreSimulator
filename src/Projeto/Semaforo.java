package Projeto;
public class Semaforo {
	private int cor;
	private int contador;

	public void SinalVermelho(int tempo) throws InterruptedException {
		while (tempo >= 0) {
			System.out.println(tempo);
			Thread.sleep(300);
			tempo--;
		}

		
	}

	public void farolVermelho() {
		System.out.println("----------------------");
		String[][] farol = { { "Vermelho", "[(X)]" }, { "Amarelo\t", "[( )]" }, { "Verde\t", "[( )]" } };
		for (int l = 0; l < 3; l++) {
			for (int c = 0; c < 2; c++) {
				System.out.print(farol[l][c]);

			}
			System.out.println("\n");
		}
		System.out.println("O sinal está vermelho!");
		System.out.println("----------------------");
		System.out.println("\n");
	}

	public void SinalAmarelo(int tempo) throws InterruptedException {
		while (tempo >= 0) {
			System.out.println(tempo);
			Thread.sleep(300);
			tempo--;

		}
		

		
	}

	public void farolAmarelo() {
		System.out.println("----------------------");
		String[][] farol = { { "Vermelho", "[( )]" }, { "Amarelo\t", "[(X)]" }, { "Verde\t", "[( )]" } };
		for (int l = 0; l < 3; l++) {
			for (int c = 0; c < 2; c++) {
				System.out.print(farol[l][c]);

			}
			System.out.println("\n");
			
		}
		System.out.println("O sinal está amarelo!");
		System.out.println("----------------------");
		System.out.println("\n");
	}

	public void SinalVerde(int tempo) throws InterruptedException {
		while (tempo >= 0) {
			System.out.println(tempo);
			Thread.sleep(300);
			tempo--;
		}

		
	}

	public void farolVerde() {
		System.out.println("----------------------");

		String[][] farol = { { "Vermelho", "[( )]" }, { "Amarelo\t", "[( )]" }, { "Verde\t", "[(X)]" } };
		for (int l = 0; l < 3; l++) {
			for (int c = 0; c < 2; c++) {
				System.out.print(farol[l][c]);

			}
			System.out.println("\n");
			
		}
		System.out.println("O sinal está verde!");
		System.out.println("----------------------");
		System.out.println("\n");
	}

	public int getCor() {
		return cor;
	}

	public void setCor(int cor) {
		this.cor = cor;
	}

	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}
}