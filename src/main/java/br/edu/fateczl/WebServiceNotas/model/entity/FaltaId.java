package br.edu.fateczl.WebServiceNotas.model.entity;

import java.io.Serializable;

public class FaltaId implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Aluno aluno;
	private Aula aula;

	public FaltaId() {
	}

	public FaltaId(Aluno aluno, Aula aula) {
		super();
		this.aluno = aluno;
		this.aula = aula;

	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Aula getAula() {
		return aula;
	}

	public void setAula(Aula aula) {
		this.aula = aula;
	}

}
