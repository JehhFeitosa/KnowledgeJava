package com.jessica.feitosa.aulaalgoritmoguanabara;

import java.util.Scanner;

//Escreva um programa para calcular a redução do tempo de vida de um
//fumante. Pergunte a quantidade de cigarros fumados por dias e quantos anos ele
//já fumou. Considere que um fumante perde 10 min de vida a cada cigarro. Calcule
//quantos dias de vida um fumante perderá e exiba o total em dias.
public class Exer16 {

	public static void main(String[] args) {
		int qtddCigDia, anosFumou;
		double qtddCigAnos, diasPerdidos;
		Scanner s = new Scanner(System.in);
		
		
		//qtdd cigarros por dia
		System.out.println("Quantos cigarros você fuma por dia? ");
		qtddCigDia = s.nextInt();
		
		//qtdd de anos de fumante
		System.out.println("Quantos anos você já fumou? ");
		anosFumou = s.nextInt();
		qtddCigAnos = (qtddCigDia * (anosFumou * 365));
		
		//-10 min de vida por cigarro
		//anos o fumante perdeu
		diasPerdidos = ((((qtddCigAnos * 10) / 60) /24)/365);
		
		System.out.println(" O Fumante perdeu " + diasPerdidos + " dias da sua vida.");
		
	}

}
