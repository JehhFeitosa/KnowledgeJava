package com.jessica.feitosa.aulasjava.aula79.indexof.lastindexof.contains;

public class IndexofLastindexofContains {
	
	public static void main(String[] args) {
	
	String banana = "banana";
	String ana = "ana";
	
	//Para buscar a posi��o de uma letra 
	System.out.println(banana.indexOf('x'));
	System.out.println(banana.indexOf('b'));
	System.out.println(banana.indexOf('a'));
	
	//Para buscar a posi��o de um conjunto de letras sequenciais ou palavra
	System.out.println(banana.indexOf(ana));
	
	//Para buscar a posi��o da �ltima letra
	System.out.println(banana.lastIndexOf('a'));
	
	//Para buscar a �ltima posi��o de um conjunto de letras
	System.out.println(banana.lastIndexOf(ana));
	
	//Para saber se cont�m uma sequencia de letras 
	System.out.println(banana.contains(ana));
	
	//Para saber se cont�m uma palavra
	System.out.println(banana.contains("ceu"));
	
	
	}

}
