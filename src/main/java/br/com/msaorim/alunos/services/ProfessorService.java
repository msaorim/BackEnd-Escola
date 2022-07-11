package br.com.msaorim.alunos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.msaorim.alunos.entities.Professor;
import br.com.msaorim.alunos.repositories.ProfessorRepository;

@Service
public class ProfessorService {

	@Autowired
	private ProfessorRepository professorRepository;
	
	public List<Professor> findAll(){
		return professorRepository.findAll();
	}
}
