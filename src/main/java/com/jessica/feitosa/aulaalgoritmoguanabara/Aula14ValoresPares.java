package com.jessica.feitosa.aulaalgoritmoguanabara;

import java.util.Scanner;

public class Aula14ValoresPares {

	public static void main(String[] args) {

		int[] val = new int[7];
		int c, totPar;
		Scanner s = new Scanner(System.in);

		totPar = 0;
		for (c = 1; c < val.length; c++) {
			System.out.println("Digite o " + c + " o. valor: ");
			val[c] = s.nextInt();
		}

		for (c = 1; c < val.length; c++) {
			if (val[c] % 2 == 0) {
				totPar = totPar + 1;
				System.out.println("O valor PAR na posição " + c);
			}
		}
		System.out.println("O total de pares foi " + totPar);

	}

}
