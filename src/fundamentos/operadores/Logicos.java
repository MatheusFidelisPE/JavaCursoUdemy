package fundamentos.operadores;

public class Logicos {

	public static void main(String[] args) {
		
		boolean condicao1 = true;
		boolean condicao2 = 3>7;

		System.out.println(condicao1 && condicao2); //operador l�gico e
		System.out.println(condicao1 || condicao2); //operador l�gico ou
		System.out.println(condicao1 ^ condicao2); //operador l�gico ou exclusivo
		System.out.println(!condicao1); //operador de nega��o
		System.out.println(!condicao2); //operador de nega��o
		
		
	}
}
