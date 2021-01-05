package com.jessica.feitosa.aulaalgoritmoguanabara;

import java.util.Scanner;

//Faça um programa que leia o ano de nascimento de uma pessoa, calcule a idade
//dela e depois mostre se ela pode ou não votar.
public class Exer18 {
	public static void main(String[] args) {
		int anoNasc, idade, anoAtual;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Qual é o ano do seu nascimento? ");
		anoNasc = s.nextInt();
		anoAtual = 2020;
		idade = anoNasc - anoAtual;
		idade = (- idade);
		System.out.println(idade);
		if(idade > 16) {
			System.out.println("Pode votar");
		}else {
			System.out.println("Não pode votar");
		}
	
	}

}
