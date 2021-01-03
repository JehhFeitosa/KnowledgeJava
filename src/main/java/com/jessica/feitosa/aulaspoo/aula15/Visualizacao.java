package com.jessica.feitosa.aulaspoo.aula15;

public class Visualizacao {
	private Gafanhoto espectador;
	private Video filme;
	
	public void avaliar() {
		this.filme.setAvaliacao(5);
		
	}
	
	public void avaliar(int nota) {
		this.filme.setAvaliacao(nota);
	}

	public void avaliar(double porc) {
		int tot = 0;
		if(porc <= 20) {
			tot = 3;
		}else if (porc <= 50) {
			tot = 5;
		}else if(porc <= 90) {
			tot = 8;
		}else {
			tot = 10;
		}
		
		this.filme.setAvaliacao(tot);
	}
	
	

	@Override
	public String toString() {
		return "Visualizacao [espectador=" + espectador + ", filme=" + filme + "]";
	}

	public Visualizacao(Gafanhoto espectador, Video filme) {
		super();
		this.espectador = espectador;
		this.filme = filme;
		this.espectador.setTotAssistido(this.espectador.getTotAssistido());
		this.filme.setView(this.filme.getView() + 1);
		
	}

	public Gafanhoto getEspectador() {
		return espectador;
	}

	public void setEspectador(Gafanhoto espectador) {
		this.espectador = espectador;
	}

	public Video getFilme() {
		return filme;
	}

	public void setFilme(Video filme) {
		this.filme = filme;
	}
	


}
