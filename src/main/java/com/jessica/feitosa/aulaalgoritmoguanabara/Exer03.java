package com.jessica.feitosa.aulaalgoritmoguanabara;

import java.util.Scanner;

// Crie um programa que leia o nome e o sal�rio de um funcion�rio, mostrando no
//final uma mensagem.
public class Exer03 {

	public static void main(String[] args) {
		String nomeCompleto;
		double salario;
		
		Scanner s= new Scanner(System.in);
		
		System.out.println("Qual � o nome Completo do funcion�rio? ");
		nomeCompleto = s.next();
		System.out.println("Qual � o sal�rio do funcion�rio? ");
		salario = s.nextDouble();
		
		System.out.println("O funcion�rio "+ nomeCompleto + " teve um sal�rio de " + salario + " em Junho." );
	}

}
