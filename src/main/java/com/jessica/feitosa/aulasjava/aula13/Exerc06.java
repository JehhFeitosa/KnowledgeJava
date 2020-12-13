package com.jessica.feitosa.aulasjava.aula13;

import java.util.Scanner;

public class Exerc06 {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Informe o raio do circulo");
		double raio= scan.nextDouble();
		double pi= 3.14;
		double areaDoCirculo= pi*raio*raio;
		System.out.println("A área do circulo é : " + areaDoCirculo);

	}

}
