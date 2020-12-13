package com.jessica.feitosa.aulasjava.aula27.parametros;

public class Carro {
	
	//Atributos
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	//M�todo
	void exibirAutonomia() {
		
		System.out.println("A autonomia do carro �: " + capCombustivel * consumoCombustivel + " KM");
	}
	
	double obterAutonomia() {
		
		System.out.println("M�todo obterAutonomia foi chamado. ");
		
		return capCombustivel * consumoCombustivel;
		
	}
	
	double calcularCombustivel(double km) {
		
		double qtdCombustivel = km/consumoCombustivel; 
			
		return qtdCombustivel;
		
		
	}

}
