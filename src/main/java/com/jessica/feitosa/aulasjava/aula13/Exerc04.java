package com.jessica.feitosa.aulasjava.aula13;

import java.util.Scanner;

public class Exerc04 {
	
	public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);

	System.out.println("Digite a nota do primeiro bimestre");
	int notaBimestre1 = scan.nextInt();
	System.out.println("Digite a nota do segundo bimestre");
	int notaBimestre2 = scan.nextInt();
	System.out.println("Digite a nota do terceiro bimestre");
	int notaBimestre3 = scan.nextInt();
	System.out.println("Digite a nota do quarto bimestre");
	int notaBimestre4 = scan.nextInt();
	int media = (notaBimestre1 + notaBimestre2+notaBimestre3+notaBimestre4)/4;
	
	System.out.println("A média bimestral é : " + media);



}
}