package com.jessica.feitosa.aulaalgoritmoguanabara;

import java.util.Scanner;

//Crie um jogo de JoKenPo (Pedra-Papel-Tesoura)
//a tesoura corta o papel, mas quebra com a pedra; o papel embrulha a pedra, 
//mas é cortado pela tesoura e a pedra quebra a tesoura e é embrulhada pelo papel.
public class Exer31 {

	public static void main(String[] args) {

		String pedra = "pedra";
		String papel = "papel";
		String tesoura = "tesoura";
		String p1, p2;
		int g1 = 0, g2 = 0, round = 1;
		Scanner s = new Scanner(System.in);
		// escolha entre pedra, papel e tesoura
		System.out.println("Vamos Jogar Jokenpo?");
		System.out.println("Esse jogo tem 15 rodadas");
		for (int i = 0; i < 15; i++) {

			System.out.println("----------------------------------------------------");
			System.out.println("Round" + round++);
			System.out.println("Participante 1 escolha entre pedra, papel ou tesoura");
			p1 = s.next();
			System.out.println("Participante 2 escolha entre pedra, papel ou tesoura");
			p2 = s.next();

			if (p1.equals(pedra)) {
				if (p2.equals(pedra)) {
					System.out.println("Pedra com Pedra dá empate, jogue de novo.");
				} else if (p2.equals(papel)) {
					System.out.println("Papel embrulha pedra.");
					System.out.println("O participante 2, ganhou essa rodada!");
					g2++;
				} else if (p2.equals(tesoura)) {
					System.out.println("Pedra quebra de tesoura.");
					System.out.println("O participante 1, ganhou essa rodada!");
					g1++;
				} else {
					System.out.println("O participante 2 não digitou uma opção válida.");
				}
			} else if (p1.equals(papel)) {
				if (p2.equals(pedra)) {
					System.out.println("Papel embrulha Pedra.");
					System.out.println("O participante 1, ganhou essa rodada!");
					g1++;
				} else if (p2.equals(papel)) {
					System.out.println("Papel com Papel dá empate, jogue de novo..");
				} else if (p2.equals(tesoura)) {
					System.out.println("Tesoura corta Papel.");
					System.out.println("O participante 2 ganhou essa rodada!");
					g2++;
				} else {
					System.out.println("O participante 2 não digitou uma opção válida.");
				}
			} else if (p1.equals(tesoura)) {
				if (p2.equals(pedra)) {
					System.out.println("Pedra quebra Tesoura.");
					System.out.println("O participante 2, ganhou essa rodada!");
					g2++;
				} else if (p2.equals(papel)) {
					System.out.println("Tesoura corta Papel.");
					System.out.println("O participante 1, ganhou essa rodada!");
					g1++;
				} else if (p2.equals(tesoura)) {
					System.out.println("Tesoura com Tesoura dá empate, jogue de novo..");
				} else {
					System.out.println("O participante 2 não digitou uma opção válida.");
				}

			} else {
				System.out.println("Participante 1 não digitou uma opção válida para jogar");
			}

		}

		System.out.println("===============================================================");
		if (g1 > g2) {
			System.out.println("Jogador 1 foi o vencedor com: " + g1 + " rodadas vencidas.");
		} else if (g1 < g2) {
			System.out.println("JOgador 2 foi o vencedor com: " + g2 + " rodadas vencidas.");
		} else {
			System.out.println("Os participantes impataram");
		}

	}

}
