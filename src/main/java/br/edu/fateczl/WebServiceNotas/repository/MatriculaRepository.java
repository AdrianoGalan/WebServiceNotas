package br.edu.fateczl.WebServiceNotas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.fateczl.WebServiceNotas.model.entity.Aluno;
import br.edu.fateczl.WebServiceNotas.model.entity.Matricula;
import br.edu.fateczl.WebServiceNotas.model.entity.MatriculaId;

public interface MatriculaRepository extends JpaRepository<Matricula, MatriculaId> {
	
	List<Aluno> listAlunoByCodigoDisciplina(int codigoDisciplina);

}
