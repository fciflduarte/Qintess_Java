package carro;

public class Carro {

	public String modelo;
	public double potencia;
	public String cor;
	
	public Carro (String modelo, double potencia, String cor) {
		this.modelo = modelo;
		this.potencia = potencia;
		this.cor = cor;
	}
		
		
		

	
	public void setModelo (String modelo) {
		this.modelo = modelo;
		
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setPotencia (double potencia) {
		this.potencia = potencia;
		
	}
	
	public double getPotencia() {
		return potencia;
		
	}
	
	public void setCor (String cor) {
		this.cor = cor;
	
	}
	
	public String getCor () {
		return cor;
	
	}
	
	
}