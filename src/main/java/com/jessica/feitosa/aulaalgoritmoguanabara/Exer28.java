package com.jessica.feitosa.aulaalgoritmoguanabara;

import java.util.Scanner;

//Faça um programa que leia a largura e o comprimento de um terreno
//retangular, calculando e mostrando a sua área em m². O programa também
//devemostrar a classificação desse terreno, de acordo com a lista abaixo:
// - Abaixo de 100m² = TERRENO POPULAR
// - Entre 100m² e 500m² = TERRENO MASTER
// - Acima de 500m² = TERRENO VIP
public class Exer28 {

	public static void main(String[] args) {
		double larg, comp, areaTerreno;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Qual é a largura do terreno?");
		larg = s.nextDouble();
		System.out.println("Qual é o comprimento do terreno?");
		comp = s.nextDouble();
		
		areaTerreno= larg*comp;
		System.out.println(areaTerreno);
		
		if(areaTerreno <= 100) {
			System.out.println("TERRENO POPULAR");
		}else if(areaTerreno > 100 && areaTerreno < 500) {
			System.out.println("TERRENO MASTER");
		}else {
			System.out.println("TERRENO VIP");
		}
	}

}
