package com.jessica.feitosa.aulasjava.aula80.modificandostring;

public class SubstringConcatReplaceTrim {

	public static void main(String[] args) {
		
		String teste = "Isso é um teste.";
		
		//Imprime a variével desejada.
		System.out.println(teste);
		//Imprime a variável apartir da posição desejada (10) ou seja apartir dá décima letra.
		System.out.println(teste.substring(10));
		//Imprime a variável apartir da posição desejada (10) e vai até a posição que for informada (15).
		System.out.println(teste.substring(10, 15));
		
		//Como concatenar Strings
		String ola = "olá";
		String mundo = "mundo";
		String olaMundo = ola.concat( mundo); //ola + mundo
		System.out.println(olaMundo);

		String espacos = "i s p a ç o";
		//Como alterar uma informação de um campo para outra informação
		String semEspacos = espacos.replace('i', 'e');
		System.out.println(semEspacos);
		
		//Como tirar os espaços
		semEspacos = semEspacos.replaceAll(" ","");
		//Como tirar todos os espaços de uma vez
		System.out.println(semEspacos);
		
		String nome = " Meu nome e: ";
		System.out.println(nome);
		//Meio de tirar todos os espaços dentro da Variável
		System.out.println(nome.trim());
		
	}
}
