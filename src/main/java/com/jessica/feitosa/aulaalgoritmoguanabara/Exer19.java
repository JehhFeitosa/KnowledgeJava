package com.jessica.feitosa.aulaalgoritmoguanabara;

import java.util.Scanner;

// Crie um algoritmo que leia o nome e as duas notas de um aluno, calcule a sua
//m�dia e mostre na tela. No final, analise a m�dia e mostre se o aluno teve ou
//n�o um bom aproveitamento (se ficou acima da m�dia 7.0).
public class Exer19 {

	public static void main(String[] args) {
		String nomeAluno;
		double nota1, nota2, media;
		Scanner s =new Scanner(System.in);
		
		System.out.println("Qual � o nome do aluno? ");
		nomeAluno = s.next();
		System.out.println("Digite a primeira nota");
		nota1 = s.nextInt();
		System.out.println("Digite a segunda nota");
		nota2 = s.nextInt();
		media = (nota1 + nota2)/2;
				
		if(media >= 7) {
			System.out.println("O Aluno(a) " + nomeAluno + ",  tirou de m�dia: " + media + ". Teve um bom aproveitamento!");
		}else {
			System.out.println("N�o alcan�ou a m�dia requerida!");
		}
		
	}

}
