package com.jessica.feitosa.aulasjava.aula13;

import java.util.Scanner;

public class Exerc05 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Entre com a quantidade de metros");
		double metros= scan.nextDouble();
		double centimetros= metros*100;
		System.out.println(metros + " metros é igual a  " + centimetros + " centimetros" );
		

	}

}
