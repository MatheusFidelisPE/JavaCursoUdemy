package fundamentos.operadores;

public class DesafioAritmetico {

	public static void main(String[] args) {
		int a = (int) Math.pow((6*(3+2)), 2) / (3*2);
		System.out.println(Math.pow((6*(3+2)), 2));
		int b = (int) Math.pow(((( 1-5)*(2-7))/2), 2);
		
		int c = (int) Math.pow(a-b, 3) / (int) Math.pow(10, 3);
		
		System.out.printf("valor de a: %d\nValor de b: %d\nValor de c: %d", a, b, c);
	}
}
