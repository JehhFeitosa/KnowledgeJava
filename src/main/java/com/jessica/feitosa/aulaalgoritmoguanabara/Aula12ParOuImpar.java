package com.jessica.feitosa.aulaalgoritmoguanabara;

import java.util.Scanner;

public class Aula12ParOuImpar {

	public static void main(String[] args) {
		int n;
		Scanner s= new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		n= s.nextInt();
		parOuImpar(n);
		
	}
	
	public static void parOuImpar(int v) {
		if(v%2==0) { 
			System.out.println("O numero " + v + " � PAR");
		} else {
			System.out.println("O numero " + v + " � IMPAR");
		}
	}

}
