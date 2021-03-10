package com.jessica.feitosa.aulaalgoritmoguanabara;

import java.util.Scanner;

//Faça um algoritmo que leia um determinado ano e mostre se ele é ou não
//BISSEXTO
public class Exer21 {

	public static void main(String[] args) {
		int ano;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite um ano");
		ano = s.nextInt();

		// Divisível por 4.
		if (ano % 4 == 0) {
			// Não pode ser divisível por 100.
			if (ano % 100 == 0) {
				// Pode ser que seja divisível por 400.
				if (ano % 400 == 0) {
					System.out.println("Ano é bissexto!");
				}
			}
		} else {
			System.out.println("Ano não é bissexto!");
		}
	}

}
