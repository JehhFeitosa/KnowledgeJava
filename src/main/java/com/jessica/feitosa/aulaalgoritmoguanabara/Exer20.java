package com.jessica.feitosa.aulaalgoritmoguanabara;

import java.util.Scanner;

//Desenvolva um programa que leia um número inteiro e mostre se ele é PAR ou
//ÍMPAR.
public class Exer20 {

	public static void main(String[] args) {
		int num;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite um número");
		num = s.nextInt();
		
		if(num %2==0) {
			System.out.println("Número PAR");
		}else {
			System.out.println("Número IMPAR");
		}
		
	}

}
