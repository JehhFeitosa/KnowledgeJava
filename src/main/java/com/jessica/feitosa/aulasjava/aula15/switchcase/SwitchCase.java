package com.jessica.feitosa.aulasjava.aula15.switchcase;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um dia da semana");
		
		int diaSemana = scan.nextInt();
		
		if (diaSemana == 1) {
			System.out.println("Domingo");
		} else if (diaSemana == 2) {
			System.out.println("Segunda");
		} else if (diaSemana == 3) {
			System.out.println("Ter�a");
		} else if (diaSemana == 4) {
			System.out.println("Quarta");
		} else if (diaSemana == 5) {
			System.out.println("Quinta");
		} else if (diaSemana == 6) {
			System.out.println("Sexta");
		} else if (diaSemana == 7) {
			System.out.println("S�bado");
		} else {
			System.out.println("N�o � um dia da semana v�lido");
		}
		
 switch(diaSemana) {
 case 1: System.out.println("domingo"); break;
 case 2: System.out.println("segunda"); break;
 case 3: System.out.println("ter�a"); break;
 case 4: System.out.println("quarta"); break;
 case 5: System.out.println("quinta"); break;
 case 6: System.out.println("sexta"); break;
 case 7: System.out.println("s�bado"); break;
 default: System.out.println("N�o � um dia da semana v�lido");
 
 }
	}

}
