package com.jessica.feitosa.aulaalgoritmoguanabara;

import java.util.Scanner;

public class Aula07 {

	public static void main(String[] args) {

		int ano, nascimento, idade;
		Scanner s= new Scanner(System.in);
		
		System.out.println("Em que ano estamos?");
		ano= s.nextInt();
		System.out.println("Em que ano voc� nasceu? ");
		nascimento = s.nextInt();
		idade = ano - nascimento;
		
		System.out.println("Em " + ano + " voce tera " + idade +  " anos");
		if (idade >= 21) {
			System.out.println("J� ter� atingido a maioridade");
		}
		
	}

}
