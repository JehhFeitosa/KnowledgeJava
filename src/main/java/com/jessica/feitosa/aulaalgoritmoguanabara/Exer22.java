package com.jessica.feitosa.aulaalgoritmoguanabara;

import java.util.Scanner;

//Escreva um programa que leia o ano de nascimento de um rapaz e mostre a sua
//situa��o em rela��o ao alistamento militar.
//- Se estiver antes dos 18 anos, mostre em quantos anos faltam para o
//alistamento.
//- Se j� tiver depois dos 18 anos, mostre quantos anos j� se passaram do
//alistamento.
public class Exer22 {

	public static void main(String[] args) {
		int anoNasc, anoAtual, idade, anosFaltantes, anosPassados;
		Scanner s= new Scanner(System.in);
		
		System.out.println("Qual � o seu ano de nascimento? ");
		anoNasc = s.nextInt();
		anoAtual = 2020;
		idade = anoAtual - anoNasc;
		if(idade < 18) {
			anosFaltantes= (-(idade-18));
			System.out.println("Falta "+ anosFaltantes + " anos para voc� se alistar no exerc�to.");
		}else {
			anosPassados = (idade - 18);
			System.out.println("J� se passaram "+ anosPassados + " anos para o alistamento.");
		}
		
	}

}
