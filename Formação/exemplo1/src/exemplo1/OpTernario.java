package exemplo1;

public class OpTernario {

	public static void main(String[] args) {
		int g = 54, k = 98;
		
		// trabalhar com o operador ternario
		System.out.println(g + k > k - g ? "Sim, é maior!" : "Não, não é maior!");

		int idadeJoao = 18; 
		String mensagem = !(idadeJoao < 18)? "entre aí": "de meia volta";
		System.out.println(mensagem);
	
	}

}
