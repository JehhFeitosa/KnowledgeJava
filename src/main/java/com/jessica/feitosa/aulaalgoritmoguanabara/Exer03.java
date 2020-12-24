package com.jessica.feitosa.aulaalgoritmoguanabara;

import java.util.Scanner;

// Crie um programa que leia o nome e o salário de um funcionário, mostrando no
//final uma mensagem.
public class Exer03 {

	public static void main(String[] args) {
		String nomeCompleto;
		double salario;
		
		Scanner s= new Scanner(System.in);
		
		System.out.println("Qual é o nome Completo do funcionário? ");
		nomeCompleto = s.next();
		System.out.println("Qual é o salário do funcionário? ");
		salario = s.nextDouble();
		
		System.out.println("O funcionário "+ nomeCompleto + " teve um salário de " + salario + " em Junho." );
	}

}
