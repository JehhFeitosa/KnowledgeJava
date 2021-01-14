package com.jessica.feitosa.aulaalgoritmoguanabara;

import java.util.Scanner;

//O Índice de Massa Corpórea (IMC) é um valor calculado baseado na altura e no
//peso de uma pessoa. De acordo com o valor do IMC, podemos classificar o
//indivíduo dentro de certas faixas.
/// - abaixo de 18.5: Abaixo do peso
//- entre 18.5 e 25: Peso ideal
//- entre 25 e 30: Sobrepeso
//- entre 30 e 40: Obesidade
//- acima de 40: Obseidade mórbida
//Obs: O IMC é calculado pela expressão peso/altura² (peso dividido pelo quadrado
//da altura)
public class Exer34 {

	public static void main(String[] args) {
		double altura, peso, imc;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Qual é a sua altura?");
		altura = s.nextDouble();
		System.out.println("Qual é o seu peso?");
		peso = s.nextDouble();
		imc = peso/(altura*altura);
		
		if(imc < 18.5) {
			System.out.println("Abaixo do peso");
		}else if(imc > 18.5 && imc < 25) {
			System.out.println("Peso ideal");
		}else if(imc > 25 && imc < 30) {
			System.out.println("sobrepeso");
		}else if(imc > 30 && imc < 40) {
			System.out.println("obesidade");
		}else if (imc > 40) {
			System.out.println("Obesidade morbida");
		}
	}
	
	
}
