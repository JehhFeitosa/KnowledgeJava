package com.jessica.feitosa.aulaalgoritmoguanabara;

import java.util.Scanner;

//Crie um programa que leia o tamanho de tr�s segmentos de reta.
//Analise seus comprimentos e diga se � poss�vel formar um tri�ngulo com essas
//retas. Matematicamente, para tr�s segmentos formarem um tri�ngulo, o comprimento
//de cada lado deve ser menor que a soma dos outros dois.
public class Exer25 {

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
			System.out.println("� um triangulo!");
		}else {
			System.out.println("N�o � um triangulo!");
		}
		
		
	}

}
