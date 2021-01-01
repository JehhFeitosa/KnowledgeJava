package com.jessica.feitosa.aulaspoo.aula11;

public class Bolsista extends Aluno{
	
	private double bolsa;
	
	public void renovarBolsa() {
		System.out.println("Renovando bolsa de " + this.getNome());
		
	}
	
	@Override
	public void pagarMensalidade() {
		System.out.println(this.getNome() + " � bolsista! Pagamento ok.");
		
	}

	public double getBolsa() {
		return bolsa;
	}

	public void setBolsa(double d) {
		this.bolsa = d;
	}

	
	
	
}
