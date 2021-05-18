package br.edu.fateczl.WebServiceNotas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.fateczl.WebServiceNotas.model.entity.Nota;
import br.edu.fateczl.WebServiceNotas.repository.NotaRepository;

@RestController
@RequestMapping("/")
public class NotaController {
	
	@Autowired
	private NotaRepository nRep;
	
	@GetMapping("/notas")
	public List<Nota> getAllNotas(){
		List<Nota> listaNotas = nRep.findAll();
		return listaNotas;
	}

}
