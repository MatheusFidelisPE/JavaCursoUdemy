package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		//Ler o primeiro n�mero
		//Ler o segundo n�mero
		//Ler a opera��o
		//Imprimir o resultado da opera��o
		Scanner entrada = new Scanner(System.in);
		Scanner entradaoperador = new Scanner(System.in);
		
		System.out.print("Informe o primeiro valor: ");
		double valor1 = entrada.nextDouble();
		System.out.print("Informe o segundo valor: ");
		double valor2 = entrada.nextDouble();
		System.out.print("Informe a opea��o [+ - / *]: ");
		String operation = entradaoperador.next();
		
		double tentativa1 = (operation.equals("+")) ? valor1 + valor2 :  0;
		tentativa1 = (operation.equals("-")) ? valor1 - valor2 :  tentativa1;
		tentativa1 = (operation.equals("*")) ? valor1 * valor2 :  tentativa1;
		tentativa1 = (operation.equals("/")) ? valor1 / valor2 :  tentativa1;
		
		System.out.printf("%f %s %f = %.1f",valor1,operation, valor2, tentativa1);
		
		
		}
}
