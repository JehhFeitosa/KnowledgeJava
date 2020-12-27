package com.jessica.feitosa.aulaalgoritmoguanabara;

import java.util.Scanner;

//Faça um algoritmo que leia quanto dinheiro uma pessoa tem na carteira (em R$)
//e mostre quantos dólares ela pode comprar. Considere US$1,00 = R$3,45.
public class Exer09 {

	public static void main(String[] args) {

		double din,qtDolares;
		Scanner s = new Scanner(System.in); 
		
		System.out.println("Quanto dinheiro você tem na carteira?");
		din = s.nextDouble();
		qtDolares = din / 3.45;
		
		System.out.println("Você pode comprar " + qtDolares + " dolares.");
		
	}

}
