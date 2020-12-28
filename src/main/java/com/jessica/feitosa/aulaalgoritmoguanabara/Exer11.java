package com.jessica.feitosa.aulaalgoritmoguanabara;

import java.util.Scanner;

//Desenvolva uma lógica que leia os valores de A, B e C de uma equação do
//segundo grau e mostre o valor de Delta.
//Δ = b2 – 4ac
public class Exer11 {

	public static void main(String[] args) {
		double a, b, c, delta;
		Scanner s= new Scanner(System.in);
		
		System.out.println("Digite o valor de a");
		a = s.nextDouble();
		System.out.println("Digite o valor de b");
		b= s.nextDouble();
		System.out.println("Digite o calor de c");
		c= s.nextDouble();
		
		delta = ((b*b)-(4*a*c));
		
		System.out.println("O valor de Delta é: " + delta);
		
		
	}

}
