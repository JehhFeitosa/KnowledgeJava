package com.jessica.feitosa.aulaalgoritmoguanabara;

import java.util.Scanner;

//Fa�a um algoritmo que leia o sal�rio de um funcion�rio, calcule e mostre o
//seu novo sal�rio, com 15% de aumento.
public class Exer13 {

	public static void main(String[] args) {
		double salario, aumento, salarioNovo;
		Scanner s= new Scanner(System.in);
		
		System.out.println("Digite o seu salario atual");
		salario = s.nextDouble();
		aumento = salario * 0.15;
		salarioNovo = salario + aumento;
		
		System.out.println("O sal�rio atual com aumento �: " + salarioNovo);
		
	}

}
