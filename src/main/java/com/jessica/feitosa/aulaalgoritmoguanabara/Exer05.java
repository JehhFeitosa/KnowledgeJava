package com.jessica.feitosa.aulaalgoritmoguanabara;

import java.util.Scanner;

// Fa�a um programa que leia as duas notas de um aluno em uma mat�ria e mostre
//na tela a sua m�dia na disciplina.
public class Exer05 {

	public static void main(String[] args) {

		Double nota1, nota2, media;
		Scanner s= new Scanner(System.in);
		
		System.out.println("Digite a nota n�mero 1");
		nota1 = s.nextDouble();
		System.out.println("Digite a nota n�mero 2");
		nota2 = s.nextDouble();
		
		media = (nota1 + nota2) /2;
		
		System.out.println("A m�dia entre " + nota1 + " e " + nota2 + " � igual a " + media + " .");
		
		
	}

}
