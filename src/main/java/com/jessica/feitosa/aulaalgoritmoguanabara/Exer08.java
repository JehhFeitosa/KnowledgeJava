package com.jessica.feitosa.aulaalgoritmoguanabara;

import java.util.Scanner;

//Desenvolva um programa que leia uma distância em metros e mostre os valores
//relativos em outras medidas.
public class Exer08 {

	public static void main(String[] args) {
		double dist, km;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite uma distância em metros");
		dist= s.nextDouble();
		km = dist / 1000;
		System.out.println(" A distancia " + dist + " é igual a " + km + " metros de kilometros.");
		
	}

}
