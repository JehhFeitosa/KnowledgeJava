package com.jessica.feitosa.aulaalgoritmoguanabara;

import java.util.Scanner;

//Fa�a um algoritmo que leia a largura e altura de uma parede, calcule e
//mostre a �rea a ser pintada e a quantidade de tinta necess�ria para o servi�o,
//sabendo que cada litro de tinta pinta uma �rea de 2metros quadrados.
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
		
		System.out.println("A area da parede � " + area + " m2 .");
		System.out.println("Voc� ir� precisar de " + qtddTinta + " litros de tinta para pintar.");
		
		
	}

}
