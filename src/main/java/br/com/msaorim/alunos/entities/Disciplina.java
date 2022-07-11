package br.com.msaorim.alunos.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TB_DISCIPLINA")
public class Disciplina {
	
	
	// Atributos ==============================================================
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(length = 30, nullable = false)
	private String nome;
	@Column(nullable = false)
	private Integer semestre;

		// Relacionamentos -------
	@ManyToOne
	@JoinColumn(name = "professor_id")
	private Professor professor;
	
	@ManyToMany
	@JoinColumn(name = "aluno_id")
	private List<Aluno> alunos = new ArrayList<>();
	
	// Construtor Padrao ======================================================
	public Disciplina() {
	}

	// Construtor com argumentos ==============================================
	public Disciplina(Long id, String nome, Integer semestre) {
		super();
		this.id = id;
		this.nome = nome;
		this.semestre = semestre;
	}
	
	// Getters & Setters ======================================================

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getSemestre() {
		return semestre;
	}

	public void setSemestre(Integer semestre) {
		this.semestre = semestre;
	}

	public Long getId() {
		return id;
	}
	
	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

}
