package Capitulo4;

import java.util.Scanner;

public class Lab1NumeroPrimo {

	public static void main(String[] args) {
		//declarando variavel que vai receber valor para teste e solicitando digita��o do valor
		System.out.println("Digite o valor a ser testado: ");
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		
		//declarando e incializando variavel que recebe contagem de divisoes exatas
		int divisoes = 0;
			
				//la�o de repeti��o onde realizamos as divis�es do valor recebido na variavel numero at� 1
				for ( int i = 1; i <= numero ; i++ ) {
					int b = (numero % i);
						if (b == 0) {
				divisoes++;
			}
			}    //verifica��o se divis�o � exata e conta at� duas divis�es pois numero primo � dividido somente por 1 e por ele mesmo
						if (divisoes <= 2 && numero != 0 && numero != 1) {
					 System.out.println(numero + " � n�mero primo");}
					 
					 else
						 System.out.println(numero + " n�o � n�mero primo");

	}

}
