package Capitulo4;


public class Lab3CopasDoMundo {

	public static void main(String[] args) {
		
		
		//laço de repetição iniciado em 1930 e finalizado em 2022
		for (int copa = 1930; copa <= 2022; copa=copa+4) {
			//condição de parada onde não teve copas do mundo devido guerras
			if (copa == 1942 || copa == 1946) 
			// salta as condiçoes acima e não as imprime
			continue;
			System.out.println("Copa do Mundo de "+ copa + "!");
			}
		}

	}
