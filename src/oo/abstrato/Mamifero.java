package oo.abstrato;

public abstract class Mamifero extends Animal {
	
	abstract String mamar();
	
	String numeroDeCoracoes() {
		return "Tem um cora��o!";
	}
	
	String habitatNatural(String espaco) {
		return String.format("Meu habitat natural �: %s",espaco);
	}
	
	
	
}
