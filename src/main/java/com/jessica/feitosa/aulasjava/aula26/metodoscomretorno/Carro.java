package com.jessica.feitosa.aulasjava.aula26.metodoscomretorno;

public class Carro {
	
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	void exibirAutonomia() {
		
		System.out.println("A autonomia do carro �: " + capCombustivel * consumoCombustivel + " KM");
	}
	
	double obterAutonomia() {
		
		System.out.println("M�todo obterAutonomia foi chamado. ");
		
		return capCombustivel * consumoCombustivel;
		
		
	}

}
