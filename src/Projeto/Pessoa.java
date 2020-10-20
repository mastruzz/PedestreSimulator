package Projeto;

import java.util.Scanner;
import java.util.Random;

public class Pessoa extends PessoaCond implements Possibilidades {
	Scanner sc = new Scanner(System.in);
	Random r = new Random();
	private int posicao;
	
	public int opcao;

	private boolean direcao;

	private String nome;

	public void Andar(int metros) throws InterruptedException {
		while (metros > 0) {
			if (direcao == false) {
				System.out.printf("%d\n", posicao);
					posicao++;
				if(posicao > 100) {
					metros = 0;
					posicao = 100;
					System.out.println("A terra � plana! Voc� caiu da borda!");
					System.out.println(getName()+ " FALECEU !!!");
					System.out.println("Programa Finalizado!");
					System.out.println("\n\n Realizado por:\n Felipe Caetano \n Mateus Oliveira \n Maur�cio Rodrigues \n Rafael Rodrigues");
					
					setOpcao(0);
				}
				Thread.sleep(200);
				
			} else {
				System.out.printf("%d\n", posicao);
				posicao--;
				if (posicao < -100) {
					metros = 0;
					posicao = -100;
					System.out.println("Pelo jeito n�o h� mais caminho pela frente, melhor dar meia volta");

				} else if (posicao == -70) {
					int n = (int) (Math.random() * 3.0);
					escolhasDois(n);
				}
				Thread.sleep(200);
			}
			metros--;
		}
	}

	public boolean isDirecao(boolean direcao) {
		this.direcao = direcao;
		return direcao;

	}

	public boolean MudarDirecao() {
		if (direcao == false) {
			setDirecao(true);
		} else {
			setDirecao(false);
		}
		return direcao;
	}

	public void Olhar(float posicao) {
		System.out.printf("Estou na posi��o: %.0f\n", posicao);

		eventos(getPosicao(), getName());
		if (posicao == 99) {
			System.out.println("Pelo jeito n�o h� mais caminho pela frente, melhor dar meia volta");
			
		}
		if (posicao == 70) {
			
			int n = r.nextInt(3);
			escolhas(n);

			switch (n) {
			case 1:
				
				System.out.println(
						"1) Ignorar\n2) Mudar dire��o\n3) Comprar um lanche\n------------------------------");
				int choose = sc.nextInt();
				
				
				if (choose == 1) {
					System.out.println("J� estou muito gordo, obrigado!");
					break;
				} else if (choose == 2) {
					MudarDirecao();
					System.out.println("Agora voce esta indo para e esquerda");
					break;
				} else if (choose == 3) {
					System.out.println("Acho que vou de Whopper Furioso!!");
					break;
						
				}
			case 3:
				System.out.println("1) Ignorar\n2) Mudar dire��o\n3) Pedir ben��o\n------------------------------");
				choose = sc.nextInt();
				if (choose == 1) {
					System.out.println("N�o tenho interesse, obrigado");
					break;
				} else if (choose == 2) {
					MudarDirecao();
					System.out.println("Agora voce esta indo para e esquerda");
					break;
				} else if (choose == 3) {
					System.out.println("Por isso, assim diz o Senhor: \"Trarei sobre eles uma desgra�a da qual n�o poder�o escapar."
				+" Ainda que venham a clamar a mim, eu n�o os ouvirei.\"\n -- Jeremias 11:11");
				
					break;
				}
				
			case 2: {
				System.out.println(
						"1) Ignorar\n2) Mudar dire��o\n3) Me conte sobre\n------------------------------");
				choose = sc.nextInt();
				if (choose == 1) {
					
					System.out.println("N�o tenho interesse, obrigado.");
					
					break;

				} else if (choose == 2) {
					MudarDirecao();
					System.out.println("Agora voce esta indo para e esquerda");
					
					break;
				} else if (choose == 3) {
					System.out.println(
							"com o��mega 3 melh�ora a� mem�OoOria, concentraA��uo,fr�Ee�te gr�Aatis pra todo Brasil.\r\n"+
							getName()+ ", os me�dicos est�o recomenda�ando, n�o tem um dia sequer "+ getName()+ " que a "+
							" ge�nnte n�o veja n�o e�scuta n�o\n leia sobre o �mega 3 os profissionais da sa�de"+
							" recome�ndando" + getName()+ "\n mas e um supleme�nto alimenta�ar e um alimento do c���rebro, do co�ra��o, "+
							"ajuda a dimi�nuir o riscos de doe��n�as ca�ardiov�Asculare�s,\n nosso s��ngue flui melhor\r\n"
							+ "voc� se se�nte com mais en��rgia e disposi��o e a nossa pele fica mais bonita�� � um "+
							"infl�amat��orio por isso aprove�eite a promo��o "+ getName());
						setPosicao(-20);
						System.out.println("\n Voc� aceitou comprar, agora voce esta na loja da TopTherm na posi��o "+ getPosicao());
					break;
				}
				
			}
			default:
				System.out.println("Nada por aqui ");

			
			}
		
		}
		
	}

	public boolean ApertarBotao(float posicao) {
		if (posicao < 3 && posicao > -3) {
			return true;
		} else
			return false;
	}
	

	public int getOpcao() {
		return opcao;
	}

	public void setOpcao(int opcao) {
		this.opcao = opcao;
	}

	public String getName() {
		return nome;
	}

	public void setName(String nome) {
		this.nome = nome;
	}

	public int getPosicao() {
		return posicao;
	}

	public void setPosicao(int posicao) {
		this.posicao = posicao;
	}

	public boolean isDirecao() {
		return direcao;
	}

	public void setDirecao(boolean direcao) {
		this.direcao = direcao;
	}

	public void addPosicao(int numero) {
		this.posicao += numero;
	}

	@Override
	public void escolhas(int escolha) {

		switch (escolha) {

		case 1:
			System.out.println("Burger King");
			break;

		case 2:
			System.out.println("Aracy TopT�erm: \"O se�nhor J�a conhe��ce o o���OM�ga 3?\" ");
			break;
		case 3:
			System.out.println("*Bem vindo ao Reino dos C�us*");
			break;
		default:
			
			break;
		}
	}

	@Override
	public void escolhasDois(int escolhaDois) {
		switch (escolhaDois) {

		case 1:
			System.out.println(
					"Pessoa de bom cora��o: \"Voce j� ouviu falar de marketing digital ou o marketing multin�vel?\"");
			break;
		case 2:
			System.out.println("*S�o Paulo 30KM" + "/n" + "*Guarulhos 35KM*" + "/n" + "*Osasco N�O ENTRE!*");
			break;
		case 3:
			System.out.println("Uma placa: \"Bacurau - Se for, vai na paz\"");
			break;
		default:
			System.out.println("Rua sem Sa�da");
			break;
		}

	}

}