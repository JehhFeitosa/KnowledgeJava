package com.jessica.feitosa.aulasjava.aula24.atributos;

import java.util.Date;

public class Exer04 {

	public static void main(String[] args) {

		LivroBiblioteca livro = new LivroBiblioteca();

		livro.nome = "Mastering ExtJS";
		livro.autor = "Loiane Groner";
		livro.anoLancamento = 2015;
		livro.preco = 63.39;
		
		livro.emprestado = true;
		livro.dataEntrega = new Date();
		livro.emprestadoA = "Loiane";
		
		

		System.out.println("Quem pegou o livro emprestado? " + livro.emprestadoA);
	}

}
