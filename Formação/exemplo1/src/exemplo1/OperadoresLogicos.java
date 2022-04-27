package exemplo1;

public class OperadoresLogicos {

	public static void main(String[] args) {
		int a = 23, b = 33, c = 43, d = 53;
		
		// trabalhando com os operadores lógicos
		System.out.println(b < a || c == 1);
		System.out.println(a < b && d != a);
		System.out.println(!(c < a));

	}

}
