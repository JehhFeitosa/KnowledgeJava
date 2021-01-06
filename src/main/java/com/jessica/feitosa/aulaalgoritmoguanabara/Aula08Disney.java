package com.jessica.feitosa.aulaalgoritmoguanabara;

import java.util.Scanner;

public class Aula08Disney {

	public static void main(String[] args) {
		double din;
		Scanner s= new Scanner(System.in);
		
		System.out.println("Quanto de dinheiro você tem?");
		
		din = s.nextDouble();
		
		if (din > 10000) {
			System.out.println("Partiu Disney");
		}else {
		System.out.println("Vou ficar em casa.");
			
		}
	}

}
