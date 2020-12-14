package com.jessica.feitosa.aulaspoo.aula06;

public class ControleRemoto implements Controlador {
	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	public ControleRemoto() {
		this.setVolume(50);	
		this.setLigado(true);
		this.setTocando(false);
	}
	
	
	private int getVolume() {
		return volume;
	}
	private void setVolume(int v) {
		this.volume = v;
	}
	private boolean getLigado() {
		return ligado;
	}
	private void setLigado(boolean l) {
		this.ligado = l;
	}
	private boolean getTocando() {
		return tocando;
	}
	private void setTocando(boolean t) {
		this.tocando = t;
	}


	@Override
	public void ligar() {
		this.setLigado(true);
		
	}


	@Override
	public void desligar() {
		this.setLigado(false);
		
	}


	@Override
	public void abrirMenu() {
		System.out.println("------MENU------");
		System.out.println("Est� ligado? " + this.getLigado());
		System.out.println("Est� tocando? " + this.getTocando());
		System.out.println("Volume: "+ this.getVolume());
		for(int i = 0; i<=this.getVolume(); i+=10) {
			System.out.print("|");
		}
	}


	@Override
	public void fecharMenu() {
		System.out.println("Fechando Menu...");
	}


	@Override
	public void maisVolume() {
		if (this.getLigado()) {
			this.setVolume(this.getVolume() + 5);
		}else {
			System.out.println("Imposs�vel aumentar volume");
		}
	}


	@Override
	public void menosVolume() {
		if(this.getLigado()) {
			this.setVolume(this.getVolume() - 5);;
		}else {
			System.out.println("Imposs�vel diminuir volume ");
		}
	}


	@Override
	public void ligarMudo() {
		if (this.getLigado() && this.getVolume() > 0) {
			this.setVolume(0);
		}
	}


	@Override
	public void desligarMudo() {
		if (this.getLigado() && this.getVolume() == 0) {
			this.setVolume(50);
		}
		
	}


	@Override
	public void play() {
		if (this.getLigado() && !(this.getTocando())) {
			this.setTocando(true);
		} else {
			System.out.println("N�o consegui reproduzir");
		}
		
	}


	@Override
	public void pause() {
		if(this.getLigado()&& this.getTocando()) {
			this.setTocando(false);
		}else {
			System.out.println("N�o consegui pausar");
		}
	}
	
	
	

}
