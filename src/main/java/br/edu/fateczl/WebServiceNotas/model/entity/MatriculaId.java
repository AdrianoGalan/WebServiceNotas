package br.edu.fateczl.WebServiceNotas.model.entity;

import java.io.Serializable;



public class MatriculaId implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Aluno aluno;
	private Disciplina disciplina;
	private int anoSemestre;

	public MatriculaId() {
		super();
	}

	public MatriculaId(Aluno aluno, Disciplina disciplina, int anoSemestre) {
		super();
		this.aluno = aluno;
		this.disciplina = disciplina;
		this.anoSemestre = anoSemestre;
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

	public int getAnoSemestre() {
		return anoSemestre;
	}

	public void setAnoSemestre(int anoSemestre) {
		this.anoSemestre = anoSemestre;
	}

}
