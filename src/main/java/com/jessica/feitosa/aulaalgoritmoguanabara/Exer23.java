package com.jessica.feitosa.aulaalgoritmoguanabara;

import java.util.Scanner;

//Numa promo��o exclusiva para o Dia da Mulher, uma loja quer dar descontos
//para todos, mas especialmente para mulheres. Fa�a um programa que leia nome,
//sexo e o valor das compras do cliente e calcule o pre�o com desconto. Sabendo
//que:
//- Homens ganham 5% de desconto
// - Mulheres ganham 13% de desconto
public class Exer23 {

	public static void main(String[] args) {
		String nome,sexo;
		double valorCompra, valorCompDesc;
		Scanner s= new Scanner(System.in);
		
		System.out.println("Qual � o seu nome?");
		nome = s.next();
		System.out.println("Qual � o seu sexo?");
		sexo = s.next();
		System.out.println("Qual foi o valor das compras? ");
		valorCompra = s.nextDouble();
		
		if (sexo.equals("f")){
			valorCompDesc = valorCompra * 0.87;
			System.out.println("O valor da compra com desconto � " + valorCompDesc + " reais.");
		}else {
			valorCompDesc = valorCompra * 0.95;
			System.out.println("O valor da compra com desconto � " + valorCompDesc + " reais.");
		}
		
	}

}
