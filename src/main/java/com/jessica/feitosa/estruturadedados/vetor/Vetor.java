package com.jessica.feitosa.estruturadedados.vetor;

import java.util.Arrays;

public class Vetor {

	private String[] elementos;
	private int tamanho;

	public Vetor(int capacidade) {

		this.elementos = new String[capacidade];
	}

	@Override
	public String toString() {

		String s = "[";

		for (int i = 0; i < this.tamanho - 1; i++) {
			s += this.elementos[i];
			s += ",";
		}

		if (this.tamanho > 0) {
			s += this.elementos[this.tamanho - 1];
		}
		
		s+="]";
		
		return Arrays.toString(elementos);
	}

	public boolean adiciona(String elemento) throws Exception {
		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}
		return false;
	}

	public int tamanho() {
		return this.tamanho;
	}

//	public void adiciona(String elemento) {
//		
//		for(int i=0; i<this.elementos.length; i++) {
//			if(this.elementos[i] == null) {
//				this.elementos[i] = elemento;
//				break;
//			}
//		}
//		
//	}

//	public void adiciona(String elemento) throws Exception {
//		if(this.tamanho < this.elementos.length) {
//		this.elementos[this.tamanho] = elemento;
//		this.tamanho++;
//		}else {
//			throw new Exception("Vetor já está cheio, não é possível adicionar mais elementos");
//		}
//		
//	}
}
