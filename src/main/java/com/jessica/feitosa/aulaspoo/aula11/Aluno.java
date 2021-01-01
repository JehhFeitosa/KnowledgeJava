package com.jessica.feitosa.aulaspoo.aula11;

public class Aluno extends Pessoa{
	
	private int matr;
	private String curso;
	
	public void cancelarMatr() {
		System.out.println("Matricula será cancelada");
		
	}
	
	public void pagarMensalidade() {
		System.out.println("Pagando Mensalidade de aluno " + this.getNome());
		
	}

	public int getMatr() {
		return matr;
	}

	void setMatr(int matr) {
		this.matr = matr;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	
}
