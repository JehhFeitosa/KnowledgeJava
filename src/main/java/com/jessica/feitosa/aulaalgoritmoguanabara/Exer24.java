package com.jessica.feitosa.aulaalgoritmoguanabara;

import java.util.Scanner;

//Faça um algoritmo que pergunte a distância que um passageiro deseja
//percorrer em Km. Calcule o preço da passagem, cobrando R$0.50 por Km para
//viagens até 200Km e R$0.45 para viagens mais longas.
public class Exer24 {

	public static void main(String[] args) {
		double kmViagem, precoViagem;
		Scanner s= new Scanner(System.in);
		
		System.out.println("Qual será a distancia que irá percorrer em  KM?");
		kmViagem= s.nextDouble();
		
		if(kmViagem < 200) {
			precoViagem = kmViagem * 0.50;
			System.out.println("O preço da viagem ficará: " + precoViagem + " reais." );
		}else {
			precoViagem = kmViagem * 0.45;
			System.out.println("O preço da viagem ficará: " + precoViagem + " reais." );
		}
		
	}

}
