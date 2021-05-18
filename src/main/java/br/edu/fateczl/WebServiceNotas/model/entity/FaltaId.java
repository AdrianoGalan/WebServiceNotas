package br.edu.fateczl.WebServiceNotas.model.entity;

import java.io.Serializable;

public class FaltaId implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Aluno aluno;
	private Disciplina disciplina;
	private String dataFalta;

	public FaltaId() {
	}

	public FaltaId(Aluno aluno, Disciplina disciplina, String dataFalta) {
		super();
		this.aluno = aluno;
		this.disciplina = disciplina;
		this.dataFalta = dataFalta;
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

	public String getDataFalta() {
		return dataFalta;
	}

	public void setDataFalta(String dataFalta) {
		this.dataFalta = dataFalta;
	}

}
