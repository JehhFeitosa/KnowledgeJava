package com.jessica.feitosa.aulaalgoritmoguanabara;

import java.util.Scanner;

public class Aula08Doacao {

	public static void main(String[] args) {
		int doacao;
		double valor;
		Scanner s= new Scanner(System.in);
		
		System.out.println("Muito obrigada por ajudar");
		System.out.println(" [1] para doar RS10,00");
		System.out.println(" [2] para doar RS25,00");
		System.out.println(" [3] para doar RS50,00");
		System.out.println(" [4] para doar outros valores");
		System.out.println(" [5] para cancelar");
		doacao = s.nextInt();
		
		switch (doacao) {
		case 1:
			valor = 10;
			break;
		case 2:
			valor = 25;
			break;
		case 3:
			valor = 50;
			break;
		case 4:
			System.out.println("Escreva o valor da doação? R$");
			valor = s.nextDouble();
			break;
		case 5:
			valor = 0;
			break;
		}

			//System.out.println("Sua doação foi de: R$ " + valor);
	}

}
