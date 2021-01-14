package com.jessica.feitosa.aulaalgoritmoguanabara;

import java.util.Scanner;

//Crie um programa que leia duas notas de um aluno e calcule a sua m�dia,
//mostrando uma mensagem no final, de acordo com a m�dia atingida:
//	 - M�dia at� 4.9: REPROVADO
//	 - M�dia entre 5.0 e 6.9: RECUPERA��O
//	 - M�dia 7.0 ou superior: APROVADO
public class Exer27 {

	public static void main(String[] args) {
		double nota1, nota2, media;
		Scanner s= new Scanner(System.in);
		
		System.out.println("Digite a sua primeira nota");
		nota1 = s.nextDouble();
		System.out.println("Digite a sua segunda nota");
		nota2 = s.nextDouble();
		media = (nota1 + nota2) / 2;
		
		if(media < 5) {
			System.out.println("REPROVADO");
		} else if(media > 5 && media <7) {
			System.out.println("RECUPERA��O");
		}else {
			System.out.println("APROVADO");
		}
	}

}
