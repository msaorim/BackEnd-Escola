package br.com.msaorim.alunos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.msaorim.alunos.entities.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {

}
