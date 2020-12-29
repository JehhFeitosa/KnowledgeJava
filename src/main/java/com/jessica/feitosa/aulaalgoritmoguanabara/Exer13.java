package com.jessica.feitosa.aulaalgoritmoguanabara;

import java.util.Scanner;

//Faça um algoritmo que leia o salário de um funcionário, calcule e mostre o
//seu novo salário, com 15% de aumento.
public class Exer13 {

	public static void main(String[] args) {
		double salario, aumento, salarioNovo;
		Scanner s= new Scanner(System.in);
		
		System.out.println("Digite o seu salario atual");
		salario = s.nextDouble();
		aumento = salario * 0.15;
		salarioNovo = salario + aumento;
		
		System.out.println("O salário atual com aumento é: " + salarioNovo);
		
	}

}
