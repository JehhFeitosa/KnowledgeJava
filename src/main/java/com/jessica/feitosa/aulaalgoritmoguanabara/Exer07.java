package com.jessica.feitosa.aulaalgoritmoguanabara;

import java.util.Scanner;

//Crie um algoritmo que leia um n�mero real e mostre na tela o seu dobro e a
//sua ter�a parte.
public class Exer07 {

	public static void main(String[] args) {
		double num, dobro, tercaParte;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite um n�mero");
		num = s.nextDouble();
		dobro = num * 2;
		tercaParte = num / 3;
		
		System.out.println("O dobro de " + num + " � " + dobro);
		System.out.println("A ter�a parte de " + num + " � " + tercaParte);
		
		
	}

}
