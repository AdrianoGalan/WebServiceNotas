package br.edu.fateczl.WebServiceNotas.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "FALTAS")
@IdClass(FaltaId.class)
public class Falta {

	@Id
	@OneToOne(targetEntity = Aluno.class)
	@JoinColumn(name = "ra_aluno")
	private Aluno aluno;

	@Id
	@OneToOne(targetEntity = Disciplina.class)
	@JoinColumn(name = "codigo_disciplina")
	private Disciplina disciplina;

	@Id
	@Column(name = "data_falta")
	private String dataFalta;

	@Column
	private int falta;

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

	public int getFalta() {
		return falta;
	}

	public void setFalta(int falta) {
		this.falta = falta;
	}

	@Override
	public String toString() {
		return "Falta [aluno=" + aluno + ", disciplina=" + disciplina + ", data=" + dataFalta + ", falta=" + falta + "]";
	}

}
