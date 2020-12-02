package com.jessica.feitosa.aulaspoo.aula05;

public class ContaBanco {

	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private Boolean status;

	public void estadoAtual() {
		System.out.println("-------------------------------------------------------");
		System.out.println("Conta: " +this.getNumConta());
		System.out.println("Tipo: " + this.tipo);
		System.out.println("Dono: " + this.getDono());
		System.out.println("Saldo: " + this.getStatus());
	}
	
	public int getNumConta() {
		return this.numConta;
	}

	public void setNumConta(int n) {
		this.numConta = n;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDono() {
		return this.dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public float getSaldo() {
		return this.saldo;
	}

	public float setSaldo(float saldo) {
		return this.saldo = saldo;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public void ContaBanco() {
		this.setSaldo(0);
		this.setStatus(false);

	}

	public void abrirConta(String t) {
		this.setTipo(t);
		this.setStatus(true);
		if (t == "CC") {
			this.setSaldo(50);
		} else if (t == "CP") {
			this.setSaldo(150);
		}

		System.out.println("Conta aberta com sucesso!");

	}

	public void fecharConta() {
		if (this.getSaldo() > 0) {
			System.out.println("Conta não pode ser fechada porque ainda");

		} else if (this.getSaldo() < 0) {
			System.out.println("Conta não pode ser fechada pois tem débito");
		} else {
			this.setStatus(false);
			System.out.println("");
		}

	}

	public void depositar(float v) {
		if (this.getStatus()) {
			this.setSaldo(this.getSaldo() + v);
			System.out.println("Deposito realizado na conta de " + this.dono);
		} else {
			System.out.println("Impossivel depositar em uma conta fechada!");
		}
	}

	public void sacar(float v) {
		if (this.getStatus()) {
			if (this.getSaldo() >= v) {
				this.setSaldo(this.getSaldo() - v);
				System.out.println("Saque realizada na conta de " + this.getDono());
			} else {
				System.out.println("Saldo insuficiente para saque");
			}
		} else {
			System.out.println("Impossivel sacar de uma conta fechada!");
		}

	}

	public void pagarMensal() {
		int v = 0;
		if (this.getTipo() == "CC") {
			v = 12;
		} else if (this.getTipo() == "CP") {
			v = 20;
		}
		if (this.getStatus()) {
			this.setSaldo(this.getSaldo() - v);
			System.out.println("Mensalidade paga com sucesso por " + this.getDono());
		} else {
			System.out.println("Impossivel pegar uma conta fechada!");
		}

	}

}
