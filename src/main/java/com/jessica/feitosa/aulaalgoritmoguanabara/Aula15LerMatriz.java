package com.jessica.feitosa.aulaalgoritmoguanabara;

import java.util.ArrayList;
import java.util.Scanner;

public class Aula15LerMatriz {

	public static void main(String[] args) {

		int[][] mat = new int[3][2];
		int l,c;
		Scanner s= new Scanner(System.in);
		
		for (l = 1; l < mat.length; l++) {
			for (c = 1; c < mat.length; c++) {
				System.out.println("Digite o valor da posição [" + l + "," + c + "]:");
				mat[l][c]= s.nextInt();
			}			
		}
		
	}

}
