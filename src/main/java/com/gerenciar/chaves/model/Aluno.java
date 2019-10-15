package com.gerenciar.chaves.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Aluno {
	
	@Id
	@GeneratedValue
	private Long id;
	

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	private String nome;
	private int numero;
	private String turma;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getTurma() {
		return turma;
	}
	public void setTurma(String turma) {
		this.turma = turma;
	}
	public Aluno(String nome, int numero, String turma) {
		
		this.nome = nome;
		this.numero = numero;
		this.turma = turma;
	}
	public Aluno() {
		
	}
	@Override
	public String toString() {
		return "Aluno [id=" + id + ", nome=" + nome + ", numero=" + numero + ", turma=" + turma + "]";
	}
	
	
	
	
	
}
