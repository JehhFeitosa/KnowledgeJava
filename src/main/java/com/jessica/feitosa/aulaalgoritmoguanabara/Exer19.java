package com.jessica.feitosa.aulaalgoritmoguanabara;

import java.util.Scanner;

// Crie um algoritmo que leia o nome e as duas notas de um aluno, calcule a sua
//média e mostre na tela. No final, analise a média e mostre se o aluno teve ou
//não um bom aproveitamento (se ficou acima da média 7.0).
public class Exer19 {

	public static void main(String[] args) {
		String nomeAluno;
		double nota1, nota2, media;
		Scanner s =new Scanner(System.in);
		
		System.out.println("Qual é o nome do aluno? ");
		nomeAluno = s.next();
		System.out.println("Digite a primeira nota");
		nota1 = s.nextInt();
		System.out.println("Digite a segunda nota");
		nota2 = s.nextInt();
		media = (nota1 + nota2)/2;
				
		if(media >= 7) {
			System.out.println("O Aluno(a) " + nomeAluno + ",  tirou de média: " + media + ". Teve um bom aproveitamento!");
		}else {
			System.out.println("Não alcançou a média requerida!");
		}
		
	}

}
