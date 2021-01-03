package com.jessica.feitosa.aulaspoo.aula12;

public class Cachorro extends Mamifero {

	public void enterrandoOsso() {
		System.out.println("Enterrando Osso");
	}
	
	public void abanarRabo() {
		System.out.println("Abanando o Rabo");
	}
	
	@Override
	public void emitirSom() {
		System.out.println(" Au! Au! Au!");
	}
}
