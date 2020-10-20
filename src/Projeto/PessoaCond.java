package Projeto;
import java.util.Scanner;

public class PessoaCond{
	Scanner sc = new Scanner (System.in);
	
	
	
	public void eventos(int posicao, String nome) {
		
		if (posicao == 40) {
			System.out.println("\nJá chegou nos 40?!"); 
		} else if (posicao == 32) {
			
		 System.out.println( "\ncalma "+nome+" Voce tropeçou na calçada(Seja mais atento!)");
		} else if (posicao >= 90) {
			
			System.out.println("\n"+nome+" Estamos subindo as colinas de gelo da suposta terra plana!"); 
		} else if(posicao == 50) {
			
			System.out.println("\n"+nome+" Você ja está na metade do planeta"); 			
		}else if(posicao == 19) {
			System.out.println("\n"+nome+" Você está á 30 metros de Osasco, tome cuidado ");
		}else if(posicao == 49) {
			System.out.println("\n"+nome+" Você chegou em Osasco e foi roubado!");
		}else if(posicao == 0) {
			System.out.println("\nEstamos na origem do universo");
		}else if (posicao < 5 && posicao > -5 && posicao != 0) {
			System.out.println("Encontrei uma faixa de pedestre!");

		} else if (posicao == -53) {
			System.out.println("Uau! Encontrei 50 conto aqui no chão!");
		}
		
		

	}
}
