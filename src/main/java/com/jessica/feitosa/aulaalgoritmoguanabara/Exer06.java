package com.jessica.feitosa.aulaalgoritmoguanabara;

import java.util.Scanner;

//Fa�a um programa que leia um n�mero inteiro e mostre o seu antecessor e seu
//sucessor.
public class Exer06 {

	public static void main(String[] args) {

		int num, antecessor, sucessor;
		Scanner s= new Scanner(System.in);
		
		System.out.println("Digite um n�mero inteiro");
		num= s.nextInt();
		antecessor= num -1;
		sucessor= num + 1;
		
		System.out.println("O antecessor de " + num + " �: " + antecessor);
		System.out.println("O sucessor de " + num + " �: " + sucessor);
		
	}

}
