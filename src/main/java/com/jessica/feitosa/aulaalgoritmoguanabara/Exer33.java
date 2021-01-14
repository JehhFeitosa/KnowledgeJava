package com.jessica.feitosa.aulaalgoritmoguanabara;

import java.util.Scanner;

//Escreva um programa para aprovar ou não o empréstimo bancário para a compra
//de uma casa. O programa vai perguntar o valor da casa, o salário do comprador e
//em quantos anos ele vai pagar. Calcule o valor da prestação mensal, sabendo que
//ela não pode exceder 30% do salário ou então o empréstimo será negado.
public class Exer33 {

	public static void main(String[] args) {
		
		double vCasa, salario,sDispon, anosPgto, prestacao;
		Scanner s= new Scanner(System.in);
		
		System.out.println("Qual é o valor da casa?");
		vCasa = s.nextDouble();
		System.out.println("Quanto é o seu salário?");
		salario = s.nextDouble();
		System.out.println("Em quantos anos você pretende pagar a casa?");
		anosPgto = s.nextDouble();
		
		prestacao = vCasa/(anosPgto*12);
		sDispon = (salario /10) * 3;
		
		if(sDispon >= prestacao ) {
			System.out.println("O Empréstimo foi aprovado!");
		}else {
			System.out.println("O Empréstimo foi negado!");
		}
		
		
		
		
		
	}
}
