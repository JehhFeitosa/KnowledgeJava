package com.jessica.feitosa.aulaalgoritmoguanabara;

import java.util.Scanner;

public class Aula08CalculoIMC {

	public static void main(String[] args) {
		double m, a, imc;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Massa (kg): " );
		m = s.nextDouble();
		System.out.println("Altura (m): ");
		a = s.nextDouble();
		imc = (m / (a * 2));
		
		System.out.println("IMC: " + imc);
		
		if(imc<17) {
			System.out.println("Muito abaixo do peso");
		}else {
			if((imc >= 17) && (imc < 18.5)) {
				System.out.println("Abaixo do peso");
			}else {
				if((imc >= 18.5) && (imc <25)) {
					System.out.println("Peso ideal");
				}else {
					if ((imc >= 25) && (imc < 30)) {
						System.out.println("obesidade");
					}else {
						if((imc >= 35) && (imc < 40)) {
							System.out.println("Obesidade severa");
						}else {
							System.out.println("Obesidade morbida");
						}
					}
				}
			}
		}
		
		
	}

}
