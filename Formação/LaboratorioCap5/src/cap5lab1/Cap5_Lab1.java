package cap5lab1;

public class Cap5_Lab1 {

	public static void main(String[] args) {
		Funcionario func = new Funcionario();
		func.setNome("Fábio");
		func.setSobrenome("Duarte");
		func.setCargo("Programador");
		func.setSalario(18350.00);
		
		System.out.println(func.exibir());

	}

}
