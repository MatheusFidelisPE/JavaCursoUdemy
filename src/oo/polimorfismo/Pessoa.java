package oo.polimorfismo;

public class Pessoa {
	
	private double peso;
	
	public Pessoa(double peso) {
		setPeso(peso);
	}
	
	void setPeso(double peso) {
		if(peso >= 0) {
			this.peso = peso;
		}
	}
	
	void comer(Comida food) {
		this.peso += food.peso;
	}
	private double getPeso() {
		return peso;
	}
	public String toString() {
		String frase;
		frase = String.format("Meu peso � %.2fKg.", getPeso());
		return frase;
	}
}
