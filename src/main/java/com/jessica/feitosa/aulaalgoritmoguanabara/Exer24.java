package com.jessica.feitosa.aulaalgoritmoguanabara;

import java.util.Scanner;

//Fa�a um algoritmo que pergunte a dist�ncia que um passageiro deseja
//percorrer em Km. Calcule o pre�o da passagem, cobrando R$0.50 por Km para
//viagens at� 200Km e R$0.45 para viagens mais longas.
public class Exer24 {

	public static void main(String[] args) {
		double kmViagem, precoViagem;
		Scanner s= new Scanner(System.in);
		
		System.out.println("Qual ser� a distancia que ir� percorrer em  KM?");
		kmViagem= s.nextDouble();
		
		if(kmViagem < 200) {
			precoViagem = kmViagem * 0.50;
			System.out.println("O pre�o da viagem ficar�: " + precoViagem + " reais." );
		}else {
			precoViagem = kmViagem * 0.45;
			System.out.println("O pre�o da viagem ficar�: " + precoViagem + " reais." );
		}
		
	}

}
