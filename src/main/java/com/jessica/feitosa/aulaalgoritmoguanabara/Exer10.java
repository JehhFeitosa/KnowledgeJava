package com.jessica.feitosa.aulaalgoritmoguanabara;

import java.util.Scanner;

//Faça um algoritmo que leia a largura e altura de uma parede, calcule e
//mostre a área a ser pintada e a quantidade de tinta necessária para o serviço,
//sabendo que cada litro de tinta pinta uma área de 2metros quadrados.
public class Exer10 {

	public static void main(String[] args) {
		double largura, altura, area, qtddTinta;
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("Digite a largura da parede");
		largura = s.nextDouble();
		System.out.println("Digite a altura da parede");
		altura = s.nextDouble();
		
		area = largura * altura;
		qtddTinta = area / 2;
		
		System.out.println("A area da parede é " + area + " m2 .");
		System.out.println("Você irá precisar de " + qtddTinta + " litros de tinta para pintar.");
		
		
	}

}
