package com.jessica.feitosa.aulasjava.aula14.ifelse;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
//		System.out.println("Entre com sua idade");
//		
//		int idade = scan.nextInt();
//		
//		if (idade >= 18) {
//			
//			System.out.println("� maior de idade.");
//			
//		} else {
//			
//			System.out.println("N�o � maior de idade.");
//		}
//		
		System.out.println("Entre com o pre�o do item");
		double valor = scan.nextDouble();
		
		if (valor <= 10) {
			
			System.out.println("Est� barato, pode comprar");
			
		} else if (valor > 10 && valor < 15) {
			System.out.println("Voc� pode pedir um desconto");
		} else if (valor >= 15 && valor < 17) {
			System.out.println("Pode pesquisar mais");
	} //else {// valor > 17
//		System.out.println("Muito caro");
//		
//	}
		
		

	}

}
