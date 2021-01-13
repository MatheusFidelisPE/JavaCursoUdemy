package fundamentos.operadores;

public class DesafioLogicos {

	public static void main(String[] args) {
		//Trabalho na ter�a (V ou F)
		//Trabalho na quinta (V ou F)
		
		boolean trabalhoTerca = false;
		boolean trabalhoQuinta = true;
		
		//Dois trabalhos derem certo televis�o de 50polegadas, 1 trabalho deu certo televis�o de 32polegadas, comprando de 50 ou de 
		//32 polegadas a fam�lia vai tomar sorvete no shopping, se nenhum dos trabalhos der certo voc� n�o comprar� nada e nem tomar�
		//sorvete e ficar� mais saudavel.
		
		boolean sorvete = trabalhoTerca || trabalhoQuinta;
		boolean tv50polegadas = trabalhoTerca && trabalhoQuinta;
		boolean tv32polegadas = trabalhoTerca ^ trabalhoQuinta;
		boolean saudavel = !sorvete;
		
		System.out.println("Televis�o de 50 polegadas: " + tv50polegadas);
		System.out.println("Televis�o de 32 polegadas: " + tv32polegadas);
		System.out.println("Tomar sorvete no shopping: " + sorvete);
		System.out.println("Ser mais saudavel e n�o tomar sorvete: " + saudavel);
		
		
		
		
		System.out.println();
	}
}
