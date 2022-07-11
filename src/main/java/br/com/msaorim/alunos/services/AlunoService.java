package br.com.msaorim.alunos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.msaorim.alunos.entities.Aluno;
import br.com.msaorim.alunos.repositories.AlunoRepository;

@Service
public class AlunoService {

	@Autowired
	private AlunoRepository alunoRepository;
	
	public List<Aluno> findAll(){
		return alunoRepository.findAll();
	}
}
