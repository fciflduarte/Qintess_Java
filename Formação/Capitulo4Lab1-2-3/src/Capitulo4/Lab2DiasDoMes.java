package Capitulo4;

import java.util.Scanner;


public class Lab2DiasDoMes {

	public static void main(String[] args) {
	 //solicitando digitação e atribuindo a variavel
		System.out.println("Digite o mês escolhido: ");
		Scanner sc = new Scanner (System.in);
		String mes = sc.next();
		
		//switch e cases com mês escolhido e mensagem que será impressa
		switch (mes) {
		
			case "Janeiro":
			case "Março":
			case "Maio":
			case "Julho":
			case "Agosto":
			case "Outubro":
			case "Dezembro":
				System.out.println("O mês escolhido tem 31 dias");
				break;
			case "Abril":
			case "Junho":
			case "Setembro":
			case "Novembro":
				System.out.println("O mês escolhido tem 30 dias");
				break;
			default:
				System.out.println("O mês escolhido tem 28 dias");
		}
		

	}

}
