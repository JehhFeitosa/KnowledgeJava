package com.jessica.feitosa.aulaalgoritmoguanabara;

import java.util.Scanner;

//Refa�a o algoritmo 25, acrescentando o recurso de mostrar que tipo
//de tri�ngulo ser� formado:
//	 - EQUIL�TERO: todos os lados iguais
//	 - IS�SCELES: dois lados iguais
//	 - ESCALENO: todos os lados diferentes
public class Exer30 {

	public static void main(String[] args) {
		double ladoA, ladoB, ladoC;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite o tamanho da primeira reta");
		ladoA = s.nextDouble();
		System.out.println("Digite o tamanho da segunda reta");
		ladoB = s.nextDouble();
		System.out.println("Digite o tamanho da terceira reta");
		ladoC = s.nextDouble();
		
		if(ladoA < (ladoB + ladoC) && ladoB < (ladoA + ladoC) && ladoC < (ladoA + ladoB)) {
			System.out.println("� um tri�ngulo!");
			if(ladoA == ladoB && ladoB == ladoC && ladoC == ladoA) {
				System.out.println("Esse tri�ngulo � um EQUIL�TERO.");
			} else if(ladoA == ladoB || ladoB == ladoC || ladoC == ladoA ) {
				System.out.println("Esse tri�ngulo � um IS�SCELES.");
			}else {
				System.out.println("Esse tri�ngulo � um ESCALENO.");
			}
		}else {
			System.out.println("N�o � um triangulo!");
		}
		
		
		
	}

}
