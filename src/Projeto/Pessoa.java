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
					System.out.println("A terra é plana! Você caiu da borda!");
					System.out.println(getName()+ " FALECEU !!!");
					System.out.println("Programa Finalizado!");
					System.out.println("\n\n Realizado por:\n Felipe Caetano \n Mateus Oliveira \n Maurício Rodrigues \n Rafael Rodrigues");
					
					setOpcao(0);
				}
				Thread.sleep(200);
				
			} else {
				System.out.printf("%d\n", posicao);
				posicao--;
				if (posicao < -100) {
					metros = 0;
					posicao = -100;
					System.out.println("Pelo jeito não há mais caminho pela frente, melhor dar meia volta");

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
		System.out.printf("Estou na posição: %.0f\n", posicao);

		eventos(getPosicao(), getName());
		if (posicao == 99) {
			System.out.println("Pelo jeito não há mais caminho pela frente, melhor dar meia volta");
			
		}
		if (posicao == 70) {
			
			int n = r.nextInt(3);
			escolhas(n);

			switch (n) {
			case 1:
				
				System.out.println(
						"1) Ignorar\n2) Mudar direção\n3) Comprar um lanche\n------------------------------");
				int choose = sc.nextInt();
				
				
				if (choose == 1) {
					System.out.println("Já estou muito gordo, obrigado!");
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
				System.out.println("1) Ignorar\n2) Mudar direção\n3) Pedir benção\n------------------------------");
				choose = sc.nextInt();
				if (choose == 1) {
					System.out.println("Não tenho interesse, obrigado");
					break;
				} else if (choose == 2) {
					MudarDirecao();
					System.out.println("Agora voce esta indo para e esquerda");
					break;
				} else if (choose == 3) {
					System.out.println("Por isso, assim diz o Senhor: \"Trarei sobre eles uma desgraça da qual não poderão escapar."
				+" Ainda que venham a clamar a mim, eu não os ouvirei.\"\n -- Jeremias 11:11");
				
					break;
				}
				
			case 2: {
				System.out.println(
						"1) Ignorar\n2) Mudar direção\n3) Me conte sobre\n------------------------------");
				choose = sc.nextInt();
				if (choose == 1) {
					
					System.out.println("Não tenho interesse, obrigado.");
					
					break;

				} else if (choose == 2) {
					MudarDirecao();
					System.out.println("Agora voce esta indo para e esquerda");
					
					break;
				} else if (choose == 3) {
					System.out.println(
							"com oôÔmega 3 melhôora aÁ memóOoOria, concentraAçãuo,fréEeÊte gráAatis pra todo Brasil.\r\n"+
							getName()+ ", os meÉdicos estão recomendaÂando, não tem um dia sequer "+ getName()+ " que a "+
							" geÊnnte não veja não eêscuta não\n leia sobre o ômega 3 os profissionais da saúde"+
							" recomeêndando" + getName()+ "\n mas e um suplemeÊnto alimentaÁar e um alimento do céÉêrebro, do coôração, "+
							"ajuda a dimiínuir o riscos de doeêñnças caÁardiováAsculareês,\n nosso sâÁngue flui melhor\r\n"
							+ "você se seÉnte com mais enêÉrgia e disposição e a nossa pele fica mais bonitaâá é um "+
							"inflâamatóÒorio por isso aproveÊeite a promoção "+ getName());
						setPosicao(-20);
						System.out.println("\n Você aceitou comprar, agora voce esta na loja da TopTherm na posição "+ getPosicao());
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
			System.out.println("Aracy TopTêerm: \"O seênhor Jáa conheêÊce o oôÔÔOMêga 3?\" ");
			break;
		case 3:
			System.out.println("*Bem vindo ao Reino dos Céus*");
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
					"Pessoa de bom coração: \"Voce já ouviu falar de marketing digital ou o marketing multinível?\"");
			break;
		case 2:
			System.out.println("*São Paulo 30KM" + "/n" + "*Guarulhos 35KM*" + "/n" + "*Osasco NÃO ENTRE!*");
			break;
		case 3:
			System.out.println("Uma placa: \"Bacurau - Se for, vai na paz\"");
			break;
		default:
			System.out.println("Rua sem Saída");
			break;
		}

	}

}