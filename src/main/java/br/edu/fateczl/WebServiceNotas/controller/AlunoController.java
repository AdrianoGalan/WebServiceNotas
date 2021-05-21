package br.edu.fateczl.WebServiceNotas.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.fateczl.WebServiceNotas.model.entity.Aluno;
import br.edu.fateczl.WebServiceNotas.repository.AlunoRepository;

@RestController
@RequestMapping("/")
public class AlunoController {

	@Autowired
	private AlunoRepository aRep;

	public AlunoController() {
		super();
	}

	@CrossOrigin
	@GetMapping("/aluno")
	public List<Aluno> getAllAlunos() {

		List<Aluno> listaAluno = aRep.findAll();
		return listaAluno;

	}
	
	@CrossOrigin
	@PostMapping("/aluno")
	public ResponseEntity<String> insertAluno(@Valid @RequestBody Aluno a) {
		aRep.save(a);
		return ResponseEntity.ok("Aluno adicionado");

	}
	
	@CrossOrigin
	@PutMapping("/aluno")
	public ResponseEntity<String> updatetAluno(@Valid @RequestBody Aluno a) {
		aRep.save(a);
		return ResponseEntity.ok().body("Jogador atualizado com sucesso");
	}

	@CrossOrigin
	@DeleteMapping("/aluno")
	public ResponseEntity<String> deleteAluno(@Valid @RequestBody Aluno a) {
		aRep.delete(a);
		return ResponseEntity.ok().body("Jogador deletado com sucesso");
	}

}
