package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {

	public static void main(String[] args) {
		List<String> lista = Arrays.asList("Ana", "Bia", "Gui", "Juju", "Lia", "Mat");
		
		//Impress�o usando o Foreach. 
		System.out.println("Usando o Foreach: \n");
		for(String nome: lista) {
			System.out.println(nome);
		}
		//Utilizando a interface funcional dispon�vel pelo java, Iterator.
		Iterator<String> iterator = lista.iterator();
		System.out.println("Usando o Iterator: \n");
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		//Utilizando o stream para impress�o.
		System.out.println("Usando o Stream: \n");
		Stream<String> stream = lista.stream();
		stream.forEach(System.out::println);
	}
}
