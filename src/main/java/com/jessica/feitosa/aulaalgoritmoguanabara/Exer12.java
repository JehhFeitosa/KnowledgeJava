package com.jessica.feitosa.aulaalgoritmoguanabara;

import java.util.Scanner;

//Crie um programa que leia o preço de um produto, calcule e mostre o seu
//PREÇO PROMOCIONAL, com 5% de desconto.
public class Exer12 {

	public static void main(String[] args) {
		double precoProduto, desconto, precoPromo;
		Scanner s= new Scanner(System.in);
		
		System.out.println("Digite o preço do produto");
		precoProduto = s.nextDouble();
		desconto = precoProduto * 0.05;
		precoPromo = precoProduto - desconto;
		
		System.out.println("O preço com desconto é: " + precoPromo);
		
	}

}
