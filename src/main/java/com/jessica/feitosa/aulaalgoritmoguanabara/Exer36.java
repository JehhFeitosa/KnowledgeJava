package com.jessica.feitosa.aulaalgoritmoguanabara;

import java.util.Scanner;

// Um programa de vida saudável quer dar pontos atividades físicas que podem
//ser trocados por dinheiro. O sistema funciona assim:
//	 - Cada hora de atividade física no mês vale pontos
// - até 10h de atividade no mês: ganha 2 pontos por hora
// - de 10h até 20h de atividade no mês: ganha 5 pontos por hora
//	 - acima de 20h de atividade no mês: ganha 10 pontos por hora
//	 - A cada ponto ganho, o cliente fatura R$0,05 (5 centavos)
//	Faça um programa que leia quantas horas de atividade uma pessoa teve por mês,
//	calcule e mostre quantos pontos ela teve e quanto dinheiro ela conseguiu ganhar.
public class Exer36 {

	public static void main(String[] args) {
		double horasAtividades, dinheiroGanho, pontos;
		Scanner s= new Scanner(System.in);
		
		System.out.println("Quantas horas de atividade física você fez?");
		horasAtividades = s.nextInt();
		
		if(horasAtividades<10) {
			pontos=horasAtividades * 2;
			dinheiroGanho = pontos * 0.05;
			System.out.println("Você fez " + pontos + " pontos e ganhou: R$" + dinheiroGanho+ " reais.");
			
		}else if(horasAtividades <20) {
			pontos=horasAtividades * 5;
			dinheiroGanho = pontos * 0.05;
			System.out.println("Você fez " + pontos + " pontos e ganhou: R$" + dinheiroGanho+ " reais.");
		}else {
			pontos=horasAtividades * 10;
			dinheiroGanho = pontos * 0.05;
			System.out.println("Você fez " + pontos + " pontos e ganhou: R$" + dinheiroGanho+ " reais.");
		}
	}

}
