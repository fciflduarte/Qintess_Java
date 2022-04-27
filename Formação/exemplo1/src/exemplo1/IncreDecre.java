package exemplo1;

public class IncreDecre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int h = 7;
		
		// implementa os operadores de incremento e decremento
		System.out.println("Incremento sufixo: " + ((h++)*5));
		System.out.println(h);
		System.out.println("Incremento prefixo: " + (++h));
		
		// decrementando
		System.out.println("Decremento sufixo: " + (h--));
		System.out.println(h);
		System.out.println("Decremento prefixo: " + (--h));

	}

}
