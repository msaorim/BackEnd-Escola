package br.com.msaorim.alunos.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "TB_PROFESSOR")
public class Professor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(length = 30, nullable = false)
	private String nome;
	@Column(length = 30, nullable = false)
	private String formacao;
	
		// Relacionamentos ----
	@OneToMany(mappedBy = "professor")
	@JsonIgnore
	private List<Disciplina> disciplinas = new ArrayList<>();
	
	public Professor() {
	}

	public Professor(Long id, String nome, String formacao) {
		super();
		this.id = id;
		this.nome = nome;
		this.formacao = formacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFormacao() {
		return formacao;
	}

	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}

	public Long getId() {
		return id;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	
}
