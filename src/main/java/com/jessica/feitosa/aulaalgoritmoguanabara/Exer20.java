package com.jessica.feitosa.aulaalgoritmoguanabara;

import java.util.Scanner;

//Desenvolva um programa que leia um n�mero inteiro e mostre se ele � PAR ou
//�MPAR.
public class Exer20 {

	public static void main(String[] args) {
		int num;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite um n�mero");
		num = s.nextInt();
		
		if(num %2==0) {
			System.out.println("N�mero PAR");
		}else {
			System.out.println("N�mero IMPAR");
		}
		
	}

}
