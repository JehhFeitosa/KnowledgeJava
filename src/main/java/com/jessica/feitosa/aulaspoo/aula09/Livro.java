package com.jessica.feitosa.aulaspoo.aula09;

public class Livro implements Publicacao {
	
	private String titulo;
	private String autor;
	private int totPaginas;
	private int pagAtual;
	private boolean aberto;
	private Pessoa leitor;
	
	
	public String detalhes() {
		return "Livro [titulo=" + titulo + "\n, autor=" + autor + "\n, totPaginas=" + totPaginas + "\n, pagAtual=" + pagAtual
				+ "\n, aberto=" + aberto + "\n, leitor=" + leitor.getNome() + "\n, idade=" + leitor.getIdade() + "\n, leitor=" + leitor.isSexo() +"]";
	}



	public Livro(String titulo, String autor, int totPaginas, int pagAtual, Pessoa leitor) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.totPaginas = totPaginas;
		this.aberto = false;
		this.pagAtual = 0;
		this.leitor = leitor;
	}


	private String getTitulo() {
		return titulo;
	}

	private void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	private String getAutor() {
		return autor;
	}

	private void setAutor(String autor) {
		this.autor = autor;
	}

	private int getTotPaginas() {
		return totPaginas;
	}

	private void setTotPaginas(int totPaginas) {
		this.totPaginas = totPaginas;
	}

	private int getPagAtual() {
		return pagAtual;
	}

	private void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}

	private boolean isAberto() {
		return aberto;
	}

	private void setAberto(boolean aberto) {
		this.aberto = aberto;
	}

	private Pessoa getLeitor() {
		return leitor;
	}

	private void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}



	@Override
	public void abrir() {
		this.aberto = true;
		
	}



	@Override
	public void fechar() {
		this.aberto = false;
	}



	@Override
	public void folhear(int p) {
		if(p>this.totPaginas) {
			this.pagAtual = 0;
		}else {
			this.pagAtual = p;
		}
		
		
	}



	@Override
	public void avancarPag() {
		this.pagAtual++;
	}



	@Override
	public void voltarPag() {
		this.pagAtual--;
		
	}
	
	
	
	
}
