package oo.abstrato;

public class Cachorro extends Mamifero {
	
	//M�todo de mam�fero
	String mamar() {
		return "Mama pelo peito";
	}
	
	//M�todo de Animal
	String respirar() {
		return "Respira pelo nariz";
	}
	
	String nome(String nome) {
		return nome;
	}
}
