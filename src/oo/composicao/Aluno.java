package oo.composicao;

import java.util.ArrayList;

public class Aluno {
	
	final String nome;
	final ArrayList<Curso> cursos = new ArrayList<Curso>();
	
	Aluno(String nome){
		this.nome = nome;
	}
	
	void adicionarCurso(Curso curso) {
		this.cursos.add(curso);
		curso.alunos.add(this);
	}
	@Override
	public String toString() {
		return nome;
	}

	String cursoMatriculado(Curso escolhido) {
		
		for(Curso curso: this.cursos) {
			if(curso.nome.equals(escolhido.nome)) {
				return "Matriculado";
			}
		}
		return "N�o matriculado";
	}
}
