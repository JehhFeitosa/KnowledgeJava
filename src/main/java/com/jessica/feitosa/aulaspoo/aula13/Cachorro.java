package com.jessica.feitosa.aulaspoo.aula13;

public class Cachorro extends Lobo {

	// String frase;
	// int hora;
	// boolean dono;

	@Override
	public void emitirSom() {
		System.out.println("Au! Au! Au!");
	}

	public void reagir(String frase) {
		if (frase == "toma comida" || frase == "Olá") {
			System.out.println("Abanar e Latir");
		} else {
			System.out.println("Rosnar");
		}
	}

	public void reagir(int hora, int min) {
		if (hora < 12) {
			System.out.println("Abanar");
		} else if (hora >= 18) {
			System.out.println("Ignorar");
		} else {
			System.out.println("Abanar e latir");
		}
	}

	public void reagir(boolean dono) {
		if (dono == true) {
			System.out.println("Abanar");
		} else {
			System.out.println("Rosnar e latir");
		}
	}

	public void reagir(int idade, double peso) {
		if (idade < 5) {
			if (peso < 10) {
				System.out.println("Abanar");
			} else {
				System.out.println("Latir");
			}
		} else {
			if(peso<10) {
				System.out.println("Rosnar");
			}else {
				System.out.println("Ignorar");
			}
			
		}
	}

}
