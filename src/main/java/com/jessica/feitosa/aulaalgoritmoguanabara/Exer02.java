package com.jessica.feitosa.aulaalgoritmoguanabara;

import java.util.Scanner;

//Faça um programa que leia o nome de uma pessoa e mostre uma mensagem de boasvindas para ela:
public class Exer02 {
	
	public static void main(String[] args) {
	
	String nome;
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Qual é o seu nome?");
	nome= scan.next();
	
	System.out.println("Olá " + nome +", é um prazer te conhecer!");
	

	}

}
