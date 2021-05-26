package br.edu.fateczl.WebServiceNotas.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.NamedNativeQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "MATRICULA")
@IdClass(MatriculaId.class)
@NamedNativeQuery(
		name = "Matricula.listAlunoByCodigoDisciplina",
		query = "SELECT ra_aluno, nome_aluno from fn_matriculado(?1) ",
		resultClass = Matricula.class)
public class Matricula {

	@Id
	@OneToOne(targetEntity = Aluno.class)
	@JoinColumn(name = "RA_ALUNO")
	private Aluno aluno;

	@Id
	@OneToOne(targetEntity = Disciplina.class)
	@JoinColumn(name = "CODIGO_DISCIPLINA")
	private Disciplina disciplina;

	@Id
	@Column(name = "ANO_SEMESTRE")
	private int anoSemestre;

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

	@Override
	public String toString() {
		return "Matricula [aluno=" + aluno + ", disciplina=" + disciplina + ", anoSemestre=" + anoSemestre + "]";
	}

}
