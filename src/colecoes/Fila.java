package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		Queue<String> lista = new LinkedList<String>();
		
		
		//Adicionando elementos na fila.
		//os m�todos add e offer adicionam elementos. Tendo seu comportamento diferente apenas quando a fila estiver cheia.
		//o m�todo add retorna uma exception, caso a fila esteja cheia e o offer retorna um valor false.
		
		lista.add("Jo�o");
		lista.offer("Maria");
		lista.add("Ana");
		lista.offer("Jos�");
		lista.add("Jonas");
		lista.offer("Joaquim");
		lista.add("Joana");
		
		//Impress�o da lista completa
		System.out.println(lista);
		System.out.println("A fila tem Maria?" + lista.contains("matheus"));
		
		//M�todos para capturar o primeiro elemento da fila. Os dois pr�ximos m�todos utilizados apenas imprimem o primeiro objeto da fila
		//Os m�todos peek e element diferem apenas quando se refere a uma fila vazia, em condi��es normais o retorno � uma string.
		//O m�todo peek � capaz de retornar um valor NULL j� o m�todo element retorna uma exception.
				
		System.out.println(lista.peek());
		System.out.println(lista.element());
		System.out.println(lista.peek());
		System.out.println(lista.element());
		
		
		System.out.println();
		//Os dois pr�ximos m�todos s�o capazes de capturar o primeiro elemento da fila, sendo diferente dos dois anteriores pois estes eliminam
		//os elementos chamados. S�o eles, poll e remove. Esses diferem entre si quando a lista estiver vazia.
		//poll retorna um valor Null j� o remove retorna uma exception
		
		System.out.println(lista.poll());
		System.out.println(lista.remove());
		System.out.println(lista.poll());
		System.out.println(lista.remove());
		System.out.println(lista.poll());
		System.out.println(lista.remove());
		System.out.println(lista.poll());
		System.out.println(lista.poll());
		
	
		
		
		
	}
}
