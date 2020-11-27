package com.jessica.feitosa.aulasjava.aula27.parametros;

public class Carro {
	
	//Atributos
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	//Método
	void exibirAutonomia() {
		
		System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + " KM");
	}
	
	double obterAutonomia() {
		
		System.out.println("Método obterAutonomia foi chamado. ");
		
		return capCombustivel * consumoCombustivel;
		
	}
	
	double calcularCombustivel(double km) {
		
		double qtdCombustivel = km/consumoCombustivel; 
			
		return qtdCombustivel;
		
		
	}

}
