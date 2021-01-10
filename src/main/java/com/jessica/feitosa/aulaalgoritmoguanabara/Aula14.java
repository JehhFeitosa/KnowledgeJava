package com.jessica.feitosa.aulaalgoritmoguanabara;

import java.util.Scanner;

public class Aula14 {

	public static void main(String[] args) {
		 int[] v = new int[6];
		 int c;
		 Scanner s = new Scanner(System.in);
		 
		 for ( c = 1; c < v.length; c++) {
			System.out.println("Digite o " + c + " o. valor: "); 
			v[c]= s.nextInt();
		}
		 
		 for (c = 1; c < v.length; c++) {
			 System.out.println("[" + v[c] + "]");
			
		}
		
	}

}
