package com.jessica.feitosa.aulaalgoritmoguanabara;

import java.util.Scanner;

//Escreva um programa para aprovar ou n�o o empr�stimo banc�rio para a compra
//de uma casa. O programa vai perguntar o valor da casa, o sal�rio do comprador e
//em quantos anos ele vai pagar. Calcule o valor da presta��o mensal, sabendo que
//ela n�o pode exceder 30% do sal�rio ou ent�o o empr�stimo ser� negado.
public class Exer33 {

	public static void main(String[] args) {
		
		double vCasa, salario,sDispon, anosPgto, prestacao;
		Scanner s= new Scanner(System.in);
		
		System.out.println("Qual � o valor da casa?");
		vCasa = s.nextDouble();
		System.out.println("Quanto � o seu sal�rio?");
		salario = s.nextDouble();
		System.out.println("Em quantos anos voc� pretende pagar a casa?");
		anosPgto = s.nextDouble();
		
		prestacao = vCasa/(anosPgto*12);
		sDispon = (salario /10) * 3;
		
		if(sDispon >= prestacao ) {
			System.out.println("O Empr�stimo foi aprovado!");
		}else {
			System.out.println("O Empr�stimo foi negado!");
		}
		
		
		
		
		
	}
}
