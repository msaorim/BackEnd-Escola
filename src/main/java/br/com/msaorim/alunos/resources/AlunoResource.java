package br.com.msaorim.alunos.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.msaorim.alunos.entities.Aluno;
import br.com.msaorim.alunos.services.AlunoService;

@RestController
@RequestMapping(value = "/alunos")
public class AlunoResource {
	
	@Autowired
	private AlunoService alunoService;
	
	@GetMapping
	public ResponseEntity<List<Aluno>> findAll(){
		List<Aluno> lista = alunoService.findAll();
		return ResponseEntity.ok().body(lista);
	}
}
