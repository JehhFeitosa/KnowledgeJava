package com.jessica.feitosa.aulaalgoritmoguanabara;

import java.util.Scanner;

//Fa�a um programa que leia o nome de uma pessoa e mostre uma mensagem de boasvindas para ela:
public class Exer02 {
	
	public static void main(String[] args) {
	
	String nome;
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Qual � o seu nome?");
	nome= scan.next();
	
	System.out.println("Ol� " + nome +", � um prazer te conhecer!");
	

	}

}
