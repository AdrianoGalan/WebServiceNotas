package br.edu.fateczl.WebServiceNotas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.fateczl.WebServiceNotas.model.entity.Aluno;
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
	@GetMapping("/matricula/{codigoDisciplina}")
	public List<Matricula> getAlunosByRa(@PathVariable(value = "codigoDisciplina") int codigoDisciplina) {

		List<Matricula> listAluno = mRep.listAlunoByCodigoDisciplina(codigoDisciplina);
		return listAluno;

	}
	
}
