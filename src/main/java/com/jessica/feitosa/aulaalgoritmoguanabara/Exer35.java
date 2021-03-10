package com.jessica.feitosa.aulaalgoritmoguanabara;

import java.util.Scanner;

//Uma empresa de aluguel de carros precisa cobrar pelos seus serviços. O
//aluguel de um carro custa R$90 por dia para carro popular e R$150 por dia para
//carro de luxo. Além disso, o cliente paga por Km percorrido. Faça um programa
//que leia o tipo de carro alugado (popular ou luxo), quantos dias de aluguel e
//quantos Km foram percorridos. No final mostre o preço a ser pago de acordo com a
//tabela a seguir:
// - Carros populares (aluguel de R$90 por dia)
// - Até 100Km percorridos: R$0,20 por Km
// - Acima de 100Km percorridos: R$0,10 por Km
// - Carros de luxo (aluguel de R$150 por dia)
// - Até 200Km percorridos: R$0,30 por Km
// - Acima de 200Km percorridos: R$0,25 por Km
public class Exer35 {

	public static void main(String[] args) {
		String carroAlugado;
		double valorAluguel, kmPercorridos, diasAluguel;
		Scanner s= new Scanner(System.in);
		
		System.out.println("Qual tipo de carro foi alugado? popular ou luxo?");
		carroAlugado = s.next();
		System.out.println("Por quantos dias o carro foi alugado?");
		diasAluguel= s.nextInt();
		System.out.println("Quantos km's foram percorridos?");
		kmPercorridos= s.nextInt();
		
		if(carroAlugado.equals("popular")) {
			if(kmPercorridos<100) {
				valorAluguel= 90 +(kmPercorridos * 0.20) ;
				System.out.println("O valor a ser pago será:  R$" + valorAluguel );
			}else {
				valorAluguel= 90 +(kmPercorridos * 0.10) ;
				System.out.println("O valor a ser pago será:  R$" + valorAluguel );
			}
		}else {
			if(kmPercorridos<200) {
				valorAluguel= 150 +(kmPercorridos * 0.30) ;
				System.out.println("O valor a ser pago será:  R$" + valorAluguel );
			}else {
				valorAluguel= 1500 +(kmPercorridos * 0.25) ;
				System.out.println("O valor a ser pago será:  R$" + valorAluguel );
			}
		}

	}

}
