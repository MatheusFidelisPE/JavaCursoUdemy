package execacao.personalizadaB;

import oo.composicao.Aluno;

public class Validar {

	private Validar() {}
	
	
	public static void aluno(Aluno aluno) throws StringVaziaException, IntervaloIrregularException{
		
		if(aluno == null) {
			throw new IllegalArgumentException("O aluno est� nulo.");
		}
		if(aluno.getNome() == null || aluno.getNome().trim().isEmpty()) {
			throw new StringVaziaException("nome");
		}
		if(aluno.getNota() < 0 || aluno.getNota() > 11) {
			throw new IntervaloIrregularException("nota");
		}
	}
}
