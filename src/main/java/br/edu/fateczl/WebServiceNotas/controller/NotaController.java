package br.edu.fateczl.WebServiceNotas.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.fateczl.WebServiceNotas.model.entity.Aluno;
import br.edu.fateczl.WebServiceNotas.model.entity.Nota;
import br.edu.fateczl.WebServiceNotas.repository.NotaRepository;

@RestController
@RequestMapping("/")
public class NotaController {
	
	@Autowired
	private NotaRepository nRep;
	
	@CrossOrigin
	@GetMapping("/nota")
	public List<Nota> getAllNotas(){
		List<Nota> listaNotas = nRep.findAll();
		return listaNotas;
	}
	
	@CrossOrigin
	@PostMapping("/nota/add")
	public ResponseEntity<String> insertNota(@Valid @RequestBody Nota n) {
		nRep.save(n);
		return ResponseEntity.ok("Nota adicionada");

	}

}
