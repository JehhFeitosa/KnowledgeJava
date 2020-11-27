package com.jessica.feitosa.aulasjava.aula50.stacktraceethrowns;

import java.util.Scanner;

public class UsandoThrows {
	
	public static void main(String[] args) {
		
		System.out.println("Entre com um n�mero decimal");
		try {
			double num =LeNumero();
			System.out.println("voc� digitou " + num);
		} catch (Exception e) {
			System.out.println("Entrada inv�lida");
			e.printStackTrace();
		}
	}
	public static double LeNumero() throws Exception {
		Scanner scan = new Scanner(System.in);
		double num = scan.nextDouble();
		return num;
	}

}
