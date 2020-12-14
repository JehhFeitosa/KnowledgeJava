package com.jessica.feitosa.aulaspoo.aula07;

public class Lutador {
	private String nome;
	private String nacionalidade;
	private int idade;
	private double altura;
	private double peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;

	public Lutador(String no, String na, int id, double al, double pe, int vi, int de, int em) {
		super();
		this.nome = no;
		this.nacionalidade = na;
		this.idade = id;
		this.altura = al;
		this.setPeso(pe);
		this.vitorias = vi;
		this.derrotas = de;
		this.empates = em;
	}

	public void apresentar() {
		System.out.println("---------------------------------------");
		System.out.println("Chegou a hora! Apresentamos o Lutador: " + this.getNome());
		System.out.println("Diretamente de : " + this.getNacionalidade());
		System.out.println("com " + this.getIdade() + "anos e " + this.altura);
		System.out.println("Pesando " + this.getPeso() + "Kg");
		System.out.println("Ganhou: " + this.getVitorias());
		System.out.println("Perdeu: " + this.getDerrotas());
		System.out.println("Empatou: " + this.getEmpates());
	}

	public void status() {
		System.out.println(this.getNome() + " é um peso" + this.getCategoria());
		System.out.println("Ganhou " + this.getVitorias() + " vezes");
		System.out.println("Perdeu " + this.getDerrotas() + " vezes");
		System.out.println("Empatou " + this.getEmpates() + " vezes");
	}

	public void ganharLuta() {
		this.setVitorias(this.getVitorias() + 1);

	}

	public void perderLuta() {
		this.setDerrotas(this.getDerrotas() + 1);
	}

	public void empatarLuta() {
		this.setEmpates(this.getEmpates() + 1);

	}

	private String getNome() {
		return nome;
	}

	private void setNome(String no) {
		this.nome = no;
	}

	private String getNacionalidade() {
		return nacionalidade;
	}

	private void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	private int getIdade() {
		return idade;
	}

	private void setIdade(int idade) {
		this.idade = idade;
	}

	private double getAltura() {
		return altura;
	}

	private void setAltura(double altura) {
		this.altura = altura;
	}

	private double getPeso() {
		return peso;
	}

	private void setPeso(double pe) {
		this.peso = pe;
		this.setCategoria();
	}

	private String getCategoria() {
		return categoria;
	}

	private void setCategoria() {
		if (this.getPeso() < 52.2) {
			this.categoria = "Inválido";
		} else if (this.getPeso() <= 70.3) {
			this.categoria = "Leve";
		} else if (this.getPeso() <= 83.9) {
			this.categoria = "Médio";
		} else if (this.getPeso() <= 120.2) {
			this.categoria = "Pesado";
		} else {
			this.categoria = "Inválido";
		}
	}

	private int getVitorias() {
		return vitorias;
	}

	private void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	private int getDerrotas() {
		return derrotas;
	}

	private void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	private int getEmpates() {
		return empates;
	}

	private void setEmpates(int empates) {
		this.empates = empates;
	}

}
