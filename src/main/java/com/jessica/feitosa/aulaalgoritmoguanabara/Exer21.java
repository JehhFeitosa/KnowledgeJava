package com.jessica.feitosa.aulaalgoritmoguanabara;

import java.util.Scanner;

//Fa�a um algoritmo que leia um determinado ano e mostre se ele � ou n�o
//BISSEXTO
public class Exer21 {

	public static void main(String[] args) {
		int ano;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite um ano");
		ano = s.nextInt();

		// Divis�vel por 4.
		if (ano % 4 == 0) {
			// N�o pode ser divis�vel por 100.
			if (ano % 100 == 0) {
				// Pode ser que seja divis�vel por 400.
				if (ano % 400 == 0) {
					System.out.println("Ano � bissexto!");
				}
			}
		} else {
			System.out.println("Ano n�o � bissexto!");
		}
	}

}
