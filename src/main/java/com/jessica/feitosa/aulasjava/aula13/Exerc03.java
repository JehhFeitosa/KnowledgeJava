package com.jessica.feitosa.aulasjava.aula13;

import java.util.Scanner;

public class Exerc03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um n�mero");
		int numero1 = scan.nextInt();
		System.out.println("Digite mais um n�mero");
		int numero2 = scan.nextInt();
		int soma = numero1 + numero2;
		System.out.println("A soma dos n�meros digitados � : " + soma);

	}

}
