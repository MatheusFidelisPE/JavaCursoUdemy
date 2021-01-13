package lambda;

import java.util.function.Function;

public class Funcao {

	public static void main(String[] args) {
		Function<Integer, String> parOuImpar = valor -> (valor%2 == 0) ? "Par":"Impar";
		Function<String, String> certeza = valor -> "!!" + valor;
		Function<String, String> duvida = valor ->"??" + valor;
		Function<String, String> virgula = valor ->",," + valor;
		Function<String, String> ponto = valor ->".." + valor;
		Function<String, String> apresentacao = valor -> "O valor �: " + valor;
		
		//Function, interface funcional dispon�vel. Para us�-la � preciso passar dois parametros no generics. O primeiro refer�ncia o
		//tipo de dado que ser� entreda e o segundo o tipo de retorno. Ela s� recebe um parametro e retorna um valor.
		
		System.out.println(parOuImpar.apply(32));
	
		String resultadoFinal;
		resultadoFinal = parOuImpar.andThen(virgula).andThen(certeza).andThen(apresentacao).andThen(ponto).apply(31);
		//Sequ�ncia: appy -> virgula -> certeza -> apresenta��o -> ponto...
		System.out.println(resultadoFinal);
	}
}
