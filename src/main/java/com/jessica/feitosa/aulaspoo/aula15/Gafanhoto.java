package com.jessica.feitosa.aulaspoo.aula15;

public class Gafanhoto extends Pessoa {

	private String login;
	private int totAssistido;
	
	@Override
	public void ganharExp() {
		
	}
	
	public void viuMaisUm() {
		
	}

	public Gafanhoto(String nome, int idade, String sexo, String login, int totAssistido) {
		super(nome, idade, sexo);
		this.login = login;
		this.totAssistido = 0;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public int getTotAssistido() {
		return totAssistido;
	}

	public void setTotAssistido(int totAssistido) {
		this.totAssistido = totAssistido;
	}
	
	
	

}
