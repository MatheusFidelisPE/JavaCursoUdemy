package fundamentos;

import java.util.Scanner;

public class Wrapper {
	public static void main(String[] args) {
		
		Byte b = 1; //Tipo primitivo � byte
		Short s = 1000; // Tipo primitivo � o short
		Integer i = Integer.parseInt("1500"); // Tipo primitivo � o Int
		Long l = 100000L; // Tipo primitivo � o long
		
		Scanner entrada = new Scanner(System.in);
		
		int valor  = Integer.parseInt(entrada.next());
		
		System.out.println(b.byteValue());
		System.out.println(valor * 2);
		
		
		Boolean bo = Boolean.parseBoolean("false");
		
		System.out.println(bo);
		
		Character c = '#';
		
		System.out.println(c.toString()); 
		
	}
}
