package com.jessica.feitosa.aulaalgoritmoguanabara;

import java.util.Scanner;

public class Aula14OrdendoVetores {

	public static void main(String[] args) {
		int[] vet = new int[5];
		int i, j, aux;
		Scanner s = new Scanner(System.in);

		for (i = 1; i < 5; i++) {
			System.out.println("Digite um valor: ");
			vet[i] = s.nextInt();
		}

		for (i = 1; i < 5; i++) {
			for (j = i + 1; j < vet.length; j++) {
				if (vet[i] > vet[j]) {
					aux = vet[i];
					vet[i] = vet[j];
					vet[j] = aux;
				}
			}
		}
		
		for (i = 1; i < vet.length; i++) {
			System.out.println("{" + vet[i] + "}");
		}

	}

}
