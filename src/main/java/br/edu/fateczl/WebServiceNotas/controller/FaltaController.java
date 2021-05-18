package br.edu.fateczl.WebServiceNotas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.fateczl.WebServiceNotas.model.entity.Falta;
import br.edu.fateczl.WebServiceNotas.repository.FaltaRepository;

@RestController
@RequestMapping("/")
public class FaltaController {
	
	@Autowired
	private FaltaRepository fRep;
	
	@GetMapping("/falta")
	public List<Falta> getAllFalta(){
		List<Falta> listaFaltas = fRep.findAll();
		return listaFaltas;
	}
	
}
