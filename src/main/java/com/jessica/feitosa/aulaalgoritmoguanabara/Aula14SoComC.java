package com.jessica.feitosa.aulaalgoritmoguanabara;

import java.util.Scanner;

public class Aula14SoComC {

	public static void main(String[] args) {
		String nome;
		String[] soC = new String[10];
		int c, tot;
		Scanner s = new Scanner(System.in);
		
		tot= 0;
		
		for (c = 1; c < soC.length; c++) {
			System.out.println("Digite seu nome ");
			nome = s.next();
			if(nome.toUpperCase().contains("C")) {
				tot = tot+1;
				soC[tot] = nome;
			}
		}
		
		System.out.println("LISTAGEM FINAL");
		for (c = 1; c <tot ; c++) {
			System.out.println(soC[c]);
		}
		
	}

}
