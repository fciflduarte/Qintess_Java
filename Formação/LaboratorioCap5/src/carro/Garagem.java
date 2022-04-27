package carro;

public class Garagem {
	Carro carroPasseio = new Carro("VW Jetta",2.3,"vermelho");
	Carro carroUtilitario = new Carro("Renault Boxer",3.8,"branco");
	
	


	public static void main(String[] args) {
		
		Garagem g = new Garagem();
		
		
		System.out.println("Carro de Passeio: ");
		System.out.println("Modelo: " + g.carroPasseio.getModelo());
		System.out.println("Cor: "+ g.carroPasseio.getCor());
		System.out.println("Potência: " + g.carroPasseio.getPotencia());
		System.out.println("------------------------");
		System.out.println("Carro Utilitário: ");
		System.out.println("Modelo: " + g.carroUtilitario.getModelo());
		System.out.println("Cor: "+ g.carroUtilitario.getCor());
		System.out.println("Potência: " + g.carroUtilitario.getPotencia());
		
		
	}
}

