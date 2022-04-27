package calculadora;

public class usandoCalculadora {
	 static double somando;
	 static double subtraindo;
	 static double multiplicando;
	 static double dividindo;
	
	public static void main(String[] args) {
		
		Calculadora calc = new Calculadora();

		somando = calc.somar(12, 60);
		subtraindo = calc.subtrair( 23.4 , 28.1 );
		multiplicando = calc.multiplicar(30, 6);
		dividindo = calc.dividir(35.7 , 5);
		
		System.out.println("Somando: " + somando);
		System.out.println("Subtraindo: " + subtraindo);
		System.out.println("Multiplicando: " + multiplicando);
		System.out.println("Dividindo: " + dividindo);
		
	}

}
