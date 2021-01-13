package execacao;

import oo.composicao.Aluno;

public class Basico {
	public static void main(String[] args) {
		
		Aluno a1 = null;
		
		/*O try catch funciona para tratamento de ece��es. De forma que ele tenta executar um bloco de c�digo, caso n�o consiga
		 * ele � capaz de entrar no catch e transmitir uma mensagem de erro. Para alguns erros n�o � preciso mostrar ao usuario
		 * o seu problema, de forma que muitos erros s�o tratados de forma a guardar em um arquivo separado e orientado para o
		 * desenvolvedor. Esses arquivos s�o chamados de arquivo de log, coleta e armazenamento de dados para posterior verifica��o
		 *   */
		try {
			System.out.println(a1.getNome());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			System.out.println( 7 / 0);
		} catch (Exception e) {
			System.out.println("N�o pode dividir por zero");
		}
		System.out.println("Fim do programa! :)");
		
	}
}
