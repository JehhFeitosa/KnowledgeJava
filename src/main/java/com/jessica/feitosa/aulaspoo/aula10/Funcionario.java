package com.jessica.feitosa.aulaspoo.aula10;

public class Funcionario extends Pessoa{
	
	private String setor;
	
	private Boolean trabalhando;
	
	public void mudarTrabalho() {
		this.trabalhando =! this.trabalhando;
	}

	private String getSetor() {
		return setor;
	}

	void setSetor(String setor) {
		this.setor = setor;
	}

	private Boolean getTrabalhando() {
		return trabalhando;
	}

	private void setTrabalhando(Boolean trabalhando) {
		this.trabalhando = trabalhando;
	}

	
}
