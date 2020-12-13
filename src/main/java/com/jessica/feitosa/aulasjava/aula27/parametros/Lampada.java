package com.jessica.feitosa.aulasjava.aula27.parametros;

public class Lampada {

	String modelo;
	String tensao;
	int potencia;
	String cor;
	String tipoLuz;
	int garantiaMeses;
	String[] tipos;
	boolean tipoAbajur;

	boolean ligada;

	void ligar() {
		ligada = true;
	}

	void desligar() {
		ligada = false;
	}

	void mudarEstado() {
		if (ligada) {
			desligar();
		} else {
			ligar();
		}

	}

	void mostrarEstado() {
		if (ligada) {
			System.out.println("Lâmpada está ");
		} else {
			System.out.println("Lâmpada está desligada");
		}
	}
}
