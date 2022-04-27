package cap5lab1;

public class Funcionario {

	private String nome;
	private String sobrenome;
	private String cargo;
	private double salario;
	
	void setNome (String nome) {
		this.nome = nome;
	}
	
	void setSobrenome (String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	void setCargo (String cargo) {
		this.cargo = cargo;
	}
	
	void setSalario (double salario) {
		this.salario = salario;
	}
		
	String exibir() {
		return  (nome + '\n'+ sobrenome +'\n'+ cargo +'\n'+ salario);
	}
	
}
