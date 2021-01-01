package com.jessica.feitosa.aulaspoo.aula10;

public class Professor extends Pessoa {
	
	private String especialidade;
	
	private double salario;
	
	public void receberAum(double aum) {
		this.salario += aum;
	}

	private String getEspecialidade() {
		return especialidade;
	}

	private void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	private double getSalario() {
		return salario;
	}

	void setSalario(double salario) {
		this.salario = salario;
	}

}
