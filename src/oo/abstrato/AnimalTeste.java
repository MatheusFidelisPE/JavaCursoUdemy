package oo.abstrato;

public class AnimalTeste {
	
	//Imposs�vel fazer isso. Pois a classe do tipo animal � abstrata e n�o � capaz de instanciar um objeto
	//Animal a1 = new Animal();
	
	//Imposs�vel fazer isso. Pois a classe do tipo animal � abstrara e n�o � capz de instanciar um objeto.
	//Animal a1 = new Mamifero();
	
	//Poss�vel fazer isso. Pois a classe cachorro � uma subclasse de Animal e portanto pode ser instanciado um objeto cachorro do tipo animal
	//Al�m de que, cachorro � uma classe concreta. Podendo instanciar um objeto usando a pr�pria.
	Animal a1 = new Cachorro();
	
	Mamifero a2 = new Cachorro();
	Cachorro a3 = new Cachorro();
	public static void main(String[] args) {
		AnimalTeste teste = new AnimalTeste();
		System.out.println(teste.a1.numeroDeCoracoes());
		System.out.println(teste.a1.respirar());
		System.out.println(teste.a1.TemPelos());
		System.out.println(teste.a2.habitatNatural("Casas"));
		System.out.println(teste.a2.mamar());
		System.out.println(teste.a3.nome("Leonardo"));
	}
}
