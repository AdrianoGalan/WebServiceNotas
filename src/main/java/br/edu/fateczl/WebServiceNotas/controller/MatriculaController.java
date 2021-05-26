package br.edu.fateczl.WebServiceNotas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.fateczl.WebServiceNotas.model.entity.Aluno;
import br.edu.fateczl.WebServiceNotas.model.entity.Disciplina;
import br.edu.fateczl.WebServiceNotas.model.entity.Matricula;
import br.edu.fateczl.WebServiceNotas.repository.MatriculaRepository;

@RestController
@RequestMapping("/")
public class MatriculaController {

	@Autowired
	private MatriculaRepository mRep;

	@CrossOrigin
	@GetMapping("/matricula")
	public List<Matricula> getAllFalta() {
		List<Matricula> listaMatricula = mRep.findAll();
		return listaMatricula;
	}

	@CrossOrigin
	@GetMapping("/disciplina/aluno/{codigoDisciplina}")
	public List<Aluno> getAlunosByRa(@PathVariable(value = "codigoDisciplina") int codigoDisciplina) {

		List<Aluno> listAluno = mRep.listAlunoByCodigoDisciplina(codigoDisciplina);
		return listAluno;

	}
	
	@CrossOrigin
	@GetMapping("/disciplina/list/{raAluno}")
	public List<Disciplina> getDisciplinaByRa(@PathVariable(value = "raAluno") int raAluno) {

		List<Disciplina> lisDisciplina = mRep.listDisciplinaByRaAluno(raAluno);
		return lisDisciplina;

	}

}
