package oo.encapsulamento;

public class PessoaTeste {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Jo�o", "Farias", 20);
		
		//System.out.println(p1.getNome());
		
		//p1.nome = "Maria";  Como o atributo nome n�o � mais uma atributo package, o atributo n�o pode ser alterado desta forma.
		//Da forma que era o atributo nome pode ser alterado sem nenhum controle de procedencia, ou seja, pode ter caracteres indesejados
		//construindo ru�dos no seu atributo. Para eliminar esse tipo de problema � poss�vel alterar o n�vel de encapsulamento do atributo 
		//e permitir altera��o somente a partir de um m�todo. Esse tem nivel de encapsulamento menor e pode ser acessado com mais liberdade.
		
		p1.setNome("Maria");
		System.out.println(p1);
		System.out.println(p1.getNomeCompleto());
		
		
	}
}
