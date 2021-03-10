package com.jessica.feitosa.aulaalgoritmoguanabara;

import java.util.Scanner;

//Refaça o algoritmo 25, acrescentando o recurso de mostrar que tipo
//de triângulo será formado:
//	 - EQUILÁTERO: todos os lados iguais
//	 - ISÓSCELES: dois lados iguais
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
			System.out.println("É um triângulo!");
			if(ladoA == ladoB && ladoB == ladoC && ladoC == ladoA) {
				System.out.println("Esse triângulo é um EQUILÁTERO.");
			} else if(ladoA == ladoB || ladoB == ladoC || ladoC == ladoA ) {
				System.out.println("Esse triângulo é um ISÓSCELES.");
			}else {
				System.out.println("Esse triângulo é um ESCALENO.");
			}
		}else {
			System.out.println("Não é um triangulo!");
		}
		
		
		
	}

}
