package br.com.msaorim.alunos.teste;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import br.com.msaorim.alunos.entities.Aluno;
import br.com.msaorim.alunos.entities.Disciplina;
import br.com.msaorim.alunos.entities.Professor;
import br.com.msaorim.alunos.repositories.AlunoRepository;
import br.com.msaorim.alunos.repositories.DisciplinaRepository;
import br.com.msaorim.alunos.repositories.ProfessorRepository;

@Configuration
public class Teste implements CommandLineRunner {

	@Autowired
	private AlunoRepository alunoRepository;
	@Autowired
	private ProfessorRepository professorRepository;
	@Autowired
	private DisciplinaRepository disciplinaRepository;
	
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	
		var al1 = new Aluno(null, "Junior", 20);
		var al2 = new Aluno(null, "João", 19);
		var al3 = new Aluno(null, "José", 21);
		var al4 = new Aluno(null, "Maria", 19);
		var al5 = new Aluno(null, "Julia", 18);
		
		alunoRepository.saveAll(Arrays.asList(al1, al2, al3, al4, al5));
		
		var p1 = new Professor(null, "Marcelo", "Engenharia de Software");
		var p2 = new Professor(null, "Felipe", "Analista de Sistemas");
		
		professorRepository.saveAll(Arrays.asList(p1, p2));
		
		var d1 = new Disciplina(null, "Algoritimo", 1);
		var d2 = new Disciplina(null, "Linguagem de Programação", 1);
		var d3 = new Disciplina(null, "Banco de Dados", 2);
		var d4 = new Disciplina(null, "Machine Learn", 2);
		var d5 = new Disciplina(null, "Projeto de Software",2);
		
		disciplinaRepository.saveAll(Arrays.asList(d1, d2, d3, d4, d5));
		
		al1.setDisciplinas(Arrays.asList(d1, d3, d5));
		al2.setDisciplinas(Arrays.asList(d1, d2));
		al3.setDisciplinas(Arrays.asList(d1, d2, d3));
		al4.setDisciplinas(Arrays.asList(d3, d4, d5));
		al5.setDisciplinas(Arrays.asList(d1, d2, d3, d4));
		
		p1.setDisciplinas(Arrays.asList(d1, d2, d3));
		p2.setDisciplinas(Arrays.asList(d4, d5));
		
		d1.setAlunos(Arrays.asList(al1, al2, al3, al5));
		d2.setAlunos(Arrays.asList(al2, al3, al5));
		d3.setAlunos(Arrays.asList(al1, al3, al4, al5));
		d4.setAlunos(Arrays.asList(al4, al5));
		d5.setAlunos(Arrays.asList(al1, al4));
		
		d1.setProfessor(p1);
		d2.setProfessor(p1);
		d3.setProfessor(p1);
		d4.setProfessor(p2);
		d5.setProfessor(p2);
		
		alunoRepository.saveAll(Arrays.asList(al1, al2, al3, al4, al5));
		disciplinaRepository.saveAll(Arrays.asList(d1, d2, d3, d4, d5));
		professorRepository.saveAll(Arrays.asList(p1, p2));
	}

}
