package exemplo1;

public class OpTernario {

	public static void main(String[] args) {
		int g = 54, k = 98;
		
		// trabalhar com o operador ternario
		System.out.println(g + k > k - g ? "Sim, � maior!" : "N�o, n�o � maior!");

		int idadeJoao = 18; 
		String mensagem = !(idadeJoao < 18)? "entre a�": "de meia volta";
		System.out.println(mensagem);
	
	}

}
