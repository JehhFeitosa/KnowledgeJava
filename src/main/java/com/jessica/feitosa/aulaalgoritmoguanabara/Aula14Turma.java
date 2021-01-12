package com.jessica.feitosa.aulaalgoritmoguanabara;

import java.util.Scanner;

public class Aula14Turma {

	public static void main(String[] args) {
		String[] nome = new String[4];
		double[] n1 = new double[4];
		double[] n2 = new double[4];
		double[] m = new double[4];
		double sm = 0, mt = 0;
		int i, tot = 0;
		Scanner s = new Scanner(System.in);
		
		for (i = 1; i < 4; i++) {
			System.out.println("Aluno " + i);
			System.out.println("Nome: ");
			nome[i] = s.next();
			System.out.println("Primeira Nota:");
			n1[i] = s.nextDouble();
			System.out.println("Segunda Nota:");
			n2[i] = s.nextDouble();
			m[i] = (n1[i] + n2[i])/2;
			sm = sm + m[i];
		}
		
		mt = sm/4;
		System.out.println("------------------------");
		System.out.println("Listagem de Alunos");
		
		for (i = 1; i < 4; i++) {
			System.out.println(nome[i] + m[i]);
			if (m[i] > mt) {
				tot = tot+1;
			}
		}
		
		System.out.println("Ao todo temos " + tot + "alunos acima da media da turma que é " + mt);
	
	}

}
