package br.com.msaorim.alunos.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.msaorim.alunos.entities.Professor;
import br.com.msaorim.alunos.services.ProfessorService;

@RestController
@RequestMapping(value = "/professores")
public class ProfessorResource {

	@Autowired
	private ProfessorService professorService;

	@GetMapping
	public ResponseEntity<List<Professor>> findAll() {
		List<Professor> lista = professorService.findAll();
		return ResponseEntity.ok().body(lista);
	}

}
