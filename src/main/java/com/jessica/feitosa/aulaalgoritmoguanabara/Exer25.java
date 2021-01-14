package com.jessica.feitosa.aulaalgoritmoguanabara;

import java.util.Scanner;

//Crie um programa que leia o tamanho de três segmentos de reta.
//Analise seus comprimentos e diga se é possível formar um triângulo com essas
//retas. Matematicamente, para três segmentos formarem um triângulo, o comprimento
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
			System.out.println("É um triangulo!");
		}else {
			System.out.println("Não é um triangulo!");
		}
		
		
	}

}
