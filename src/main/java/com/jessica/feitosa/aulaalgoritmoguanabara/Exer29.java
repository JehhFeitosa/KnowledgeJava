package com.jessica.feitosa.aulaalgoritmoguanabara;

import java.util.Scanner;

//Desenvolva um programa que leia o nome de um funcionário, seu salário,
//quantos anos ele trabalha na empresa e mostre seu novo salário, reajustado de
//acordo com a tabela a seguir:
// - Até 3 anos de empresa: aumento de 3%
// - entre 3 e 10 anos: aumento de 12.5%
// - 10 anos ou mais: aumento de 20%
public class Exer29 {

	public static void main(String[] args) {
		String nome;
		double salario, novoSalario;
		int anosTrab;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite o seu nome");
		nome = s.next();
		System.out.println("Digite o seu salário");
		salario = s.nextDouble();
		System.out.println("Quantos anos você trabalha nessa empresa?");
		anosTrab = s.nextInt();
		
		if(anosTrab <= 3) {
			novoSalario = (salario * 0.03) + salario;
			System.out.println("O funcionário "+ nome + " recebia: " + salario + " e agora passará a receber: " + novoSalario);
		}else if(anosTrab > 3 && anosTrab < 10) {
			novoSalario = (salario * 0.125) + salario;
			System.out.println("O funcionário "+ nome + " recebia: " + salario + " e agora passará a receber: " + novoSalario);
		}else {
			novoSalario = (salario * 0.20) + salario;
			System.out.println("O funcionário "+ nome + " recebia: " + salario + " e agora passará a receber: " + novoSalario);
		}
	}

}
