package com.jessica.feitosa.aulaalgoritmoguanabara;

import java.util.Scanner;

//Desenvolva um programa que leia o nome de um funcion�rio, seu sal�rio,
//quantos anos ele trabalha na empresa e mostre seu novo sal�rio, reajustado de
//acordo com a tabela a seguir:
// - At� 3 anos de empresa: aumento de 3%
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
		System.out.println("Digite o seu sal�rio");
		salario = s.nextDouble();
		System.out.println("Quantos anos voc� trabalha nessa empresa?");
		anosTrab = s.nextInt();
		
		if(anosTrab <= 3) {
			novoSalario = (salario * 0.03) + salario;
			System.out.println("O funcion�rio "+ nome + " recebia: " + salario + " e agora passar� a receber: " + novoSalario);
		}else if(anosTrab > 3 && anosTrab < 10) {
			novoSalario = (salario * 0.125) + salario;
			System.out.println("O funcion�rio "+ nome + " recebia: " + salario + " e agora passar� a receber: " + novoSalario);
		}else {
			novoSalario = (salario * 0.20) + salario;
			System.out.println("O funcion�rio "+ nome + " recebia: " + salario + " e agora passar� a receber: " + novoSalario);
		}
	}

}
