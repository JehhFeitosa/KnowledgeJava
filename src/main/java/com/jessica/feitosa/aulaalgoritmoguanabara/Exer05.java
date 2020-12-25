package com.jessica.feitosa.aulaalgoritmoguanabara;

import java.util.Scanner;

// Faça um programa que leia as duas notas de um aluno em uma matéria e mostre
//na tela a sua média na disciplina.
public class Exer05 {

	public static void main(String[] args) {

		Double nota1, nota2, media;
		Scanner s= new Scanner(System.in);
		
		System.out.println("Digite a nota número 1");
		nota1 = s.nextDouble();
		System.out.println("Digite a nota número 2");
		nota2 = s.nextDouble();
		
		media = (nota1 + nota2) /2;
		
		System.out.println("A média entre " + nota1 + " e " + nota2 + " é igual a " + media + " .");
		
		
	}

}
