package br.edu.fateczl.WebServiceNotas.model.entity;

import java.io.Serializable;

public class NotaId implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Aluno aluno;
	private Disciplina disciplina;
	private Avaliacao avaliacao;

	public NotaId() {
		super();
	}

	public NotaId(Aluno aluno, Disciplina disciplina, Avaliacao avaliacao) {
		super();
		this.aluno = aluno;
		this.disciplina = disciplina;
		this.avaliacao = avaliacao;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public Avaliacao getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(Avaliacao avaliacao) {
		this.avaliacao = avaliacao;
	}

}
