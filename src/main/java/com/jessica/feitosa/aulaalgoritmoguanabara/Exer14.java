package com.jessica.feitosa.aulaalgoritmoguanabara;

import java.util.Scanner;

import javax.naming.ldap.PagedResultsControl;

// A locadora de carros precisa da sua ajuda para cobrar seus serviços. Escreva
//um programa que pergunte a quantidade de Km percorridos por um carro alugado e a
//quantidade de dias pelos quais ele foi alugado. Calcule o preço total a pagar,
//sabendo que o carro custa R$90 por dia e R$0,20 por Km rodado.
public class Exer14 {

	public static void main(String[] args) {
		double kmPer, diasAluguel, precoDia, precoKm, precoTotal;
		Scanner s= new Scanner(System.in);
		
		System.out.println("Por quantos dias alugou o carro?");
		diasAluguel = s.nextDouble();
		System.out.println("Quatos KM o carro rodou?");
		kmPer = s.nextDouble();
	
		precoDia= diasAluguel * 90;
		precoKm = kmPer * 0.20;
		precoTotal = precoDia + precoKm;
		
		System.out.println("O total a ser pago pelo aluguel é: " + precoTotal + " reais.");
		
	}

}
