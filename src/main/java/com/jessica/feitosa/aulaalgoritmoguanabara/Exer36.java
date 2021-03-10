package com.jessica.feitosa.aulaalgoritmoguanabara;

import java.util.Scanner;

// Um programa de vida saud�vel quer dar pontos atividades f�sicas que podem
//ser trocados por dinheiro. O sistema funciona assim:
//	 - Cada hora de atividade f�sica no m�s vale pontos
// - at� 10h de atividade no m�s: ganha 2 pontos por hora
// - de 10h at� 20h de atividade no m�s: ganha 5 pontos por hora
//	 - acima de 20h de atividade no m�s: ganha 10 pontos por hora
//	 - A cada ponto ganho, o cliente fatura R$0,05 (5 centavos)
//	Fa�a um programa que leia quantas horas de atividade uma pessoa teve por m�s,
//	calcule e mostre quantos pontos ela teve e quanto dinheiro ela conseguiu ganhar.
public class Exer36 {

	public static void main(String[] args) {
		double horasAtividades, dinheiroGanho, pontos;
		Scanner s= new Scanner(System.in);
		
		System.out.println("Quantas horas de atividade f�sica voc� fez?");
		horasAtividades = s.nextInt();
		
		if(horasAtividades<10) {
			pontos=horasAtividades * 2;
			dinheiroGanho = pontos * 0.05;
			System.out.println("Voc� fez " + pontos + " pontos e ganhou: R$" + dinheiroGanho+ " reais.");
			
		}else if(horasAtividades <20) {
			pontos=horasAtividades * 5;
			dinheiroGanho = pontos * 0.05;
			System.out.println("Voc� fez " + pontos + " pontos e ganhou: R$" + dinheiroGanho+ " reais.");
		}else {
			pontos=horasAtividades * 10;
			dinheiroGanho = pontos * 0.05;
			System.out.println("Voc� fez " + pontos + " pontos e ganhou: R$" + dinheiroGanho+ " reais.");
		}
	}

}
