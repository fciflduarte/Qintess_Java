package Capitulo4;

import java.util.Scanner;

public class Lab1NumeroPrimo {

	public static void main(String[] args) {
		//declarando variavel que vai receber valor para teste e solicitando digitação do valor
		System.out.println("Digite o valor a ser testado: ");
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		
		//declarando e incializando variavel que recebe contagem de divisoes exatas
		int divisoes = 0;
			
				//laço de repetição onde realizamos as divisões do valor recebido na variavel numero até 1
				for ( int i = 1; i <= numero ; i++ ) {
					int b = (numero % i);
						if (b == 0) {
				divisoes++;
			}
			}    //verificação se divisão é exata e conta até duas divisões pois numero primo é dividido somente por 1 e por ele mesmo
						if (divisoes <= 2 && numero != 0 && numero != 1) {
					 System.out.println(numero + " é número primo");}
					 
					 else
						 System.out.println(numero + " não é número primo");

	}

}
