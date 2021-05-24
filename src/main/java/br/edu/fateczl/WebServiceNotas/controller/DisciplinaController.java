package br.edu.fateczl.WebServiceNotas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.fateczl.WebServiceNotas.model.entity.Disciplina;
import br.edu.fateczl.WebServiceNotas.repository.DisciplinaRepository;

@RestController
@RequestMapping("/")
public class DisciplinaController {
	
	@Autowired
	private DisciplinaRepository dRep;
	
	@CrossOrigin
	@GetMapping("/disciplina")
	public List<Disciplina> getAllDisciplina(){
		List<Disciplina> listDisciplinas = dRep.findAll();
		return listDisciplinas;
	}

}
