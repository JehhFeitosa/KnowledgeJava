package com.jessica.feitosa.aulaalgoritmoguanabara;

import java.util.Scanner;

//Desenvolva um algoritmo que leia dois números inteiros e mostre o somatório
//entre eles.
public class Exer04 {

	public static void main(String[] args) {

		int num1, num2, soma;
		Scanner s= new Scanner(System.in);
		
		System.out.println("Digite um número inteiro");
		num1 = s.nextInt();
		System.out.println("Digite outro número inteiro");
		num2= s.nextInt();
		soma = num1 + num2;
		System.out.println("A soma entre "+ num1 + " e " + num2 + " é igual a " + soma +" .");
	}

}
