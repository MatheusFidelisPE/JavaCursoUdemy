package controle;

import java.util.Scanner;

public class CalculadorMedia {
	public static void main(String[] args) {
		double nota1, nota2;
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe a nota 1: ");
		nota1 = entrada.nextDouble();
		System.out.print("Informe a nota 2: ");
		nota2 = entrada.nextDouble();
		double media = (nota1+nota2) / 2;
		if(media >= 7)
		{
			System.out.println("Aprovado!");
		}
		else if(media<7 && media>=4) {
			System.out.println("Recupera��o!");
		}else {
			System.out.println("Reprovado!");
		}
	}
}
