package com.jessica.feitosa.aulasjava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Digite seu nome completo:");
		String nomeCompleto=scan.nextLine();
		System.out.println("Seu nome completo é: " + nomeCompleto);

		System.out.println("Digite seu primeiro nome: ");
		String primeiroNome=scan.nextLine();
		System.out.println("Seu primeiro nome é: " + primeiroNome);
		
		System.out.println("Digite a sua idade");
		int idade = scan.nextInt();
		System.out.println("Sua idade é : " + idade);
	}

}
