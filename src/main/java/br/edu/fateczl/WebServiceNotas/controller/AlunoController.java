package br.edu.fateczl.WebServiceNotas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.fateczl.WebServiceNotas.model.entity.Aluno;
import br.edu.fateczl.WebServiceNotas.repository.AlunoRepository;

@RestController
@RequestMapping("/")
public class AlunoController {
	
	@Autowired
	private AlunoRepository aRep;
	
	@GetMapping("/aluno")
	public List<Aluno> getAllAlunos(){
		
		List<Aluno> listaAluno = aRep.findAll();
		return listaAluno;
		
	}

}
