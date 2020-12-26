package com.jessica.feitosa.aulaalgoritmoguanabara;

import java.util.Scanner;

//Crie um algoritmo que leia um número real e mostre na tela o seu dobro e a
//sua terça parte.
public class Exer07 {

	public static void main(String[] args) {
		double num, dobro, tercaParte;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite um número");
		num = s.nextDouble();
		dobro = num * 2;
		tercaParte = num / 3;
		
		System.out.println("O dobro de " + num + " é " + dobro);
		System.out.println("A terça parte de " + num + " é " + tercaParte);
		
		
	}

}
