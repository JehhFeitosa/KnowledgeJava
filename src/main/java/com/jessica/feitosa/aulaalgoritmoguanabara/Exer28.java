package com.jessica.feitosa.aulaalgoritmoguanabara;

import java.util.Scanner;

//Fa�a um programa que leia a largura e o comprimento de um terreno
//retangular, calculando e mostrando a sua �rea em m�. O programa tamb�m
//devemostrar a classifica��o desse terreno, de acordo com a lista abaixo:
// - Abaixo de 100m� = TERRENO POPULAR
// - Entre 100m� e 500m� = TERRENO MASTER
// - Acima de 500m� = TERRENO VIP
public class Exer28 {

	public static void main(String[] args) {
		double larg, comp, areaTerreno;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Qual � a largura do terreno?");
		larg = s.nextDouble();
		System.out.println("Qual � o comprimento do terreno?");
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
