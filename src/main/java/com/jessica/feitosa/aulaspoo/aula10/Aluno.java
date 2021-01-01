package com.jessica.feitosa.aulaspoo.aula10;

public class Aluno extends Pessoa{
	
	private int matr;
	private String curso;
	
	public void cancelarMatr() {
		System.out.println("Matricula será cancelada");
		
	}

	private int getMatr() {
		return matr;
	}

	private void setMatr(int matr) {
		this.matr = matr;
	}

	private String getCurso() {
		return curso;
	}

	void setCurso(String curso) {
		this.curso = curso;
	}

}
