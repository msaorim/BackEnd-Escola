package br.com.msaorim.alunos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.msaorim.alunos.entities.Disciplina;
import br.com.msaorim.alunos.repositories.DisciplinaRepository;

@Service
public class DisciplinaService {

	@Autowired
	private DisciplinaRepository disciplinaRepository;
	
	public List<Disciplina> findAll(){
		return disciplinaRepository.findAll();
	}
}
