package com.jessica.feitosa.aulaalgoritmoguanabara;

import java.util.Scanner;

//Escreva um algoritmo que leia dois n�meros inteiros e compare-os, mostrando
//na tela uma das mensagens abaixo:
// - O primeiro valor � o maior
//- O segundo valor � o maior
//- N�o existe valor maior, os dois s�o iguais
public class Exer26 {

	public static void main(String[] args) {
		int num1, num2;
		Scanner s= new Scanner(System.in);
		
		System.out.println("Digite um n�mero inteiro");
		num1= s.nextInt();
		System.out.println("Digite outro n�mero inteiro");
		num2 = s.nextInt();
		
		if(num1 > num2) {
			System.out.println("O primeiro num�ro � maior");
		}else if (num1< num2){
			System.out.println("O Segundo n�mero � maior");
		}else {
			System.out.println("N�o existe n�mero maior, os dois s�o iguais.");
		}

	}

}
