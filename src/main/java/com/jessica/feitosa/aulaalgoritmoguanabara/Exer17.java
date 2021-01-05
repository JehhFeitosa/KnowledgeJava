package com.jessica.feitosa.aulaalgoritmoguanabara;

import java.util.Scanner;

//Escreva um programa que pergunte a velocidade de um carro. Caso ultrapasse
//80Km/h, exiba uma mensagem dizendo que o usuário foi multado. Nesse caso, exiba
//o valor da multa, cobrando R$5 por cada Km acima da velocidade permitida.
public class Exer17 {
	
	public static void main(String[] args) {
	int velocidade, multa;
	Scanner s= new Scanner(System.in);
	
	//pergunte a velocidade de um carro
	System.out.println("Qual é a velocidade do carro? ");
	velocidade = s.nextInt();
	
	//se for mais de 80km, msg de multa e valor da multa 
	//( multa de $5 por km acima da velocidade permitida)
	
	if (velocidade > 80) {
		multa= ((velocidade - 80) * 5);
		System.out.println("O valor da multa será de " + multa + " reais.");
		
	}

}
}