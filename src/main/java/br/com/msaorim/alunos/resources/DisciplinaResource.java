package br.com.msaorim.alunos.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.msaorim.alunos.entities.Disciplina;
import br.com.msaorim.alunos.services.DisciplinaService;

@RestController
@RequestMapping(value = "/disciplinas")
public class DisciplinaResource {
	
	@Autowired
	private DisciplinaService disciplinaService;
	
	@GetMapping
	public ResponseEntity<List<Disciplina>> findAll(){
		List<Disciplina> lista = disciplinaService.findAll();
		return ResponseEntity.ok().body(lista);
	}

}
