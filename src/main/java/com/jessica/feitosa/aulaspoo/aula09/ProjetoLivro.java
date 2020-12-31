package com.jessica.feitosa.aulaspoo.aula09;

public class ProjetoLivro {

	public static void main(String[] args) {

		Pessoa[] p = new Pessoa[2];
		Livro [] l = new Livro[3];
		
		p[0] = new Pessoa("Pedro", 22, "M");
		p[1] = new Pessoa("Maria", 25, "F");
		
		l[0] = new Livro("Aprendendo Java", "José da Silva", 300, 0, p[0]);
		l[1] = new Livro("POO para iniciantes", "Pedro Paulo", 500, 1, p[1]);		
		l[2] = new Livro ("Java Avançado", "Maria Candido", 800, 0, p[0]);
	
		l[0].abrir();
		l[0].folhear(400);
		System.out.println(l[0].detalhes());
	
	}

}
