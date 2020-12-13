package com.jessica.feitosa.aulasjava.aula26.metodoscomretorno;

public class Carro {
	
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	void exibirAutonomia() {
		
		System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + " KM");
	}
	
	double obterAutonomia() {
		
		System.out.println("Método obterAutonomia foi chamado. ");
		
		return capCombustivel * consumoCombustivel;
		
		
	}

}
