package Projeto;
import java.util.Scanner;
import java.util.Random;

public class SistemaApp {
	public static void main(String[] args) throws InterruptedException {
		Random r = new Random();
		Semaforo farol = new Semaforo();
		BotaoPedestre botao = new BotaoPedestre(false);
		Pessoa rafael = new Pessoa();
		Scanner s = new Scanner(System.in);
		int opcao2 = 0;
		System.out.println("Nome do Escolhido: ");
		rafael.setName(s.nextLine());
		rafael.setPosicao(3);

		do {
			
			
			String nome1 = "Mauricio";
			String nome = "Vagner";
			System.out.println("----- Escolha uma opção ------"  );
			System.out.println("_________ "+rafael.getName()+" __________\n");
			
			if(nome.equals(rafael.getName())){
				System.out.println("O PROGRAMA FOI TOPZADO COM SUCESSO");
				
			}
			if(nome1.equals(rafael.getName())){
				System.out.println("Fazendo Download Do arquivo Maurício.mp4");
				
			}
			System.out.println("1) Andar\n2) Mudar direção\n3) Olhar em volta\n0) Finalizar \n------------------------------");
			rafael.setOpcao(s.nextInt());
			
			if(rafael.getOpcao() > 3 || rafael.getOpcao() < 0) {
				System.out.println("Numero inválido!");
			
			}
			

			switch (rafael.getOpcao()) {
			
			case 1:
				int quantosMetros = 0;
				System.out.println("Quantos metros quero andar?");
				quantosMetros = s.nextInt();
				rafael.Andar(quantosMetros);
			break;

			case 2:
				rafael.MudarDirecao();
				if (rafael.isDirecao() == true) {
					System.out.println("Troquei de direção, agora estou indo para a esquerda.");
				} else {
					System.out.println("Troquei de direção, agora estou indo para a direita.");
				}
				break;
			case 3:
				rafael.Olhar(rafael.getPosicao());
				
					if (rafael.getPosicao() < 5 && rafael.getPosicao() != 0 && rafael.getPosicao() > -5) {

						System.out.println("Digite 1 - Para apertar o botão e atravessar\nDigite 2 - Para ignorar");
						opcao2 = s.nextInt();
						
						
					
				}else if(rafael.getPosicao() == 10) {
					System.out.println("Olha só! Encontrei uma faixa de pedestre!");
					System.out.println("Digite 1 - Para apertar o botão e atravessar\nDigite 2 - Para ignorar");
					opcao2 = s.nextInt();
				}
					while (opcao2==1) {

					
						farol.SinalVermelho(10);
						farol.farolVermelho();
						farol.SinalAmarelo(10);
						farol.farolAmarelo();

						if (rafael.getPosicao() > 0) {
							rafael.setPosicao(r.nextInt(100));
						} else if (rafael.getPosicao() < 0) {
							rafael.setPosicao(-40);

						}
						// System.out.println(botao.ReceberInputPessoa(rafael.ApertarBotao(rafael.getPosicao())));
						
						farol.SinalVerde(10);
						farol.farolVerde();
						System.out.println("Voce atravessou a rua, sua posição agora é " + rafael.getPosicao());

					
						opcao2 = 0;
					}
				break;
			case 0:
				System.out.println("Programa Finalizado!");
				System.out.println("\n\n Realizado por:\n Felipe Caetano \n Mateus Oliveira \n Maurício Rodrigues \n Rafael Rodrigues");
				rafael.setOpcao(0);
				break;
			default:
				System.out.println("Erro inesperado!!\n");
			}
			

			
			
			
		} while (rafael.getOpcao() != 0);
		
		
	}
}
