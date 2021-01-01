package com.jessica.feitosa.aulaspoo.aula10;

public class Pessoa {
	private String nome;
	private int idade;
	private String sexo;
	
	public void fazerAniv() {
		this.idade++;
	}

	private String getNome() {
		return nome;
	}

	void setNome(String nome) {
		this.nome = nome;
	}

	private int getIdade() {
		return idade;
	}

	void setIdade(int idade) {
		this.idade = idade;
	}

	private String getSexo() {
		return sexo;
	}

	void setSexo(String sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + "]";
	}

	
}
