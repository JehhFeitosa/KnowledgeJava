package com.jessica.feitosa.aulaalgoritmoguanabara;

import java.util.Scanner;

//Escreva um algoritmo que leia dois números inteiros e compare-os, mostrando
//na tela uma das mensagens abaixo:
// - O primeiro valor é o maior
//- O segundo valor é o maior
//- Não existe valor maior, os dois são iguais
public class Exer26 {

	public static void main(String[] args) {
		int num1, num2;
		Scanner s= new Scanner(System.in);
		
		System.out.println("Digite um número inteiro");
		num1= s.nextInt();
		System.out.println("Digite outro número inteiro");
		num2 = s.nextInt();
		
		if(num1 > num2) {
			System.out.println("O primeiro numéro é maior");
		}else if (num1< num2){
			System.out.println("O Segundo número é maior");
		}else {
			System.out.println("Não existe número maior, os dois são iguais.");
		}

	}

}
