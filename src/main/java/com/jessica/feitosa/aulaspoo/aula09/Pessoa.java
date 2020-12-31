package com.jessica.feitosa.aulaspoo.aula09;

public class Pessoa {
	
	private String nome;
	private int idade;
	private String sexo;
	
	public void fazerAniver() {
		this.idade++;
		
	}
	
	

	public Pessoa(String nome, int idade, String sexo) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}



	String getNome() {
		return nome;
	}

	private void setNome(String nome) {
		this.nome = nome;
	}

	int getIdade() {
		return idade;
	}

	private void setIdade(int idade) {
		this.idade = idade;
	}

	String isSexo() {
		return sexo;
	}

	private void setSexo(String sexo) {
		this.sexo = sexo;
	}

	
}
