package com.jessica.feitosa.aulaspoo.aula02;

public class Caneta {

	String modelo;
	String cor;
	float ponta;
	int carga;
	boolean tampada;
	
	void status() {
		System.out.println("uma  caneta "+ this.cor);
		System.out.println("est� tampada? "+ this.tampada);
	}

	void rabiscar() {
		
		if(this.tampada == true) {
			System.out.println("Erro! N�o posso rabiscar");
		}else {
			System.out.println("Estou Rabiscando");
		}

	}

	void tampar() {
		this.tampada = true;
	}

	void destampar() {
		this.tampada = false;

}

}
