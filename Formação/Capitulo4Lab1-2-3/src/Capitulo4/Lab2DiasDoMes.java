package Capitulo4;

import java.util.Scanner;


public class Lab2DiasDoMes {

	public static void main(String[] args) {
	 //solicitando digita��o e atribuindo a variavel
		System.out.println("Digite o m�s escolhido: ");
		Scanner sc = new Scanner (System.in);
		String mes = sc.next();
		
		//switch e cases com m�s escolhido e mensagem que ser� impressa
		switch (mes) {
		
			case "Janeiro":
			case "Mar�o":
			case "Maio":
			case "Julho":
			case "Agosto":
			case "Outubro":
			case "Dezembro":
				System.out.println("O m�s escolhido tem 31 dias");
				break;
			case "Abril":
			case "Junho":
			case "Setembro":
			case "Novembro":
				System.out.println("O m�s escolhido tem 30 dias");
				break;
			default:
				System.out.println("O m�s escolhido tem 28 dias");
		}
		

	}

}
