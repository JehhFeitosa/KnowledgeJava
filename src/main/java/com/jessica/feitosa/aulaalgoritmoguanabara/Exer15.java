/**
 * 
 */
package com.jessica.feitosa.aulaalgoritmoguanabara;

import java.util.Scanner;

/**
 * @author Jessica Feitosa
 * 
 * Crie um programa que leia o n�mero de dias trabalhados em um m�s e mostre o
 *sal�rio de um funcion�rio, sabendo que ele trabalha 8 horas por dia e ganha R$25
 *por hora trabalhada.
 *
 */
public class Exer15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int diasTrab, horasTrab;
		double salario;
		Scanner s= new Scanner (System.in);
		
		System.out.println("Quantos dias voc� trabalhou? ");
		diasTrab = s.nextInt();
		horasTrab = diasTrab * 8;
		salario = horasTrab * 25;
		
		System.out.println("O seu salario ser�: " + salario);
		
	}

}
