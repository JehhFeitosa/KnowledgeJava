package com.jessica.feitosa.aulasjava.aula50.stacktraceethrowns;

public class ExceptionGenerica {
	
	public static void main(String[] args) {
		
		int[] numeros = {4, 8, 16, 32, 64, 128};
		int[] demon = {2, 0, 4, 8, 0};
		
		for (int i=0; i<numeros.length; i++) {
			try {
				System.out.println(numeros[i] + "/" + demon[i] + " = " + (numeros[i]/demon[i]));
			}
			catch(ArithmeticException e) {
				//Para aparecer a mensagem de erro 
				System.out.println(e.getMessage());
				//Para aparecer a linha com erro
				e.printStackTrace();
			}
		}
		
	}

}
