package com.jessica.feitosa.aulaalgoritmoguanabara;

import java.util.Scanner;

public class Aula08MediaAluno {

	public static void main(String[] args) {
		double n1, n2, m;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Primeira nota: ");
		n1= s.nextDouble();
		System.out.println("Segunda nota: ");
		n2 = s.nextDouble();
		m =((n1+ n2)/2);
		
		System.out.println("A media do alunno foi " + m);
		
		if (m >= 7) {
			System.out.println("Aluno Aprovado");
		}else {
			if((m>=5) && (m< 7)) {
				System.out.println("Aluno em recuperação");
			}else {
				System.out.println("Aluno reprovado");
			}
		}
	}
}
