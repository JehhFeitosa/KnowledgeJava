package com.jessica.feitosa.estruturadedados.vetor.teste;

import org.springframework.util.SystemPropertyUtils;

import com.jessica.feitosa.estruturadedados.vetor.Vetor;

public class Aula04 {

	public static void main(String[] args) throws Exception {
		Vetor vetor = new Vetor(2);

		vetor.adiciona("elemento 1");

		vetor.adiciona("elemento 2");

		vetor.adiciona("elemento 3");
		
		System.out.println(vetor.tamanho());
		
		System.out.println(vetor.toString());
	}

}
