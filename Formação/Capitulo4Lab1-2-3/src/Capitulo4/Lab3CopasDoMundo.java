package Capitulo4;


public class Lab3CopasDoMundo {

	public static void main(String[] args) {
		
		
		//la�o de repeti��o iniciado em 1930 e finalizado em 2022
		for (int copa = 1930; copa <= 2022; copa=copa+4) {
			//condi��o de parada onde n�o teve copas do mundo devido guerras
			if (copa == 1942 || copa == 1946) 
			// salta as condi�oes acima e n�o as imprime
			continue;
			System.out.println("Copa do Mundo de "+ copa + "!");
			}
		}

	}
