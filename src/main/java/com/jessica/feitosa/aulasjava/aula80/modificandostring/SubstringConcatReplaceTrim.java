package com.jessica.feitosa.aulasjava.aula80.modificandostring;

public class SubstringConcatReplaceTrim {

	public static void main(String[] args) {
		
		String teste = "Isso � um teste.";
		
		//Imprime a vari�vel desejada.
		System.out.println(teste);
		//Imprime a vari�vel apartir da posi��o desejada (10) ou seja apartir d� d�cima letra.
		System.out.println(teste.substring(10));
		//Imprime a vari�vel apartir da posi��o desejada (10) e vai at� a posi��o que for informada (15).
		System.out.println(teste.substring(10, 15));
		
		//Como concatenar Strings
		String ola = "ol�";
		String mundo = "mundo";
		String olaMundo = ola.concat( mundo); //ola + mundo
		System.out.println(olaMundo);

		String espacos = "i s p a � o";
		//Como alterar uma informa��o de um campo para outra informa��o
		String semEspacos = espacos.replace('i', 'e');
		System.out.println(semEspacos);
		
		//Como tirar os espa�os
		semEspacos = semEspacos.replaceAll(" ","");
		//Como tirar todos os espa�os de uma vez
		System.out.println(semEspacos);
		
		String nome = " Meu nome e: ";
		System.out.println(nome);
		//Meio de tirar todos os espa�os dentro da Vari�vel
		System.out.println(nome.trim());
		
	}
}
