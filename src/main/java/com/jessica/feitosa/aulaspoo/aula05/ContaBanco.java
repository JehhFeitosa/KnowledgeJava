package com.jessica.feitosa.aulaspoo.aula05;

public class ContaBanco {

	public Integer numConta;
	protected String tipo;
	private String dono;
	private double saldo;
	private Boolean status;
	
	public Integer getNumConta() {
		return numConta;
	}

	public void setNumConta(Integer numConta) {
		this.numConta = numConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public double getReal() {
		return saldo;
	}

	public void setReal(Integer real) {
		saldo = real;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public void ContaBanco() {
		this.saldo = 0;
		this.status = falso;

		
		
	}

	public void abrirConta(String t) {
		setTipo(t);
		setStatus(true);
		if(t = "CC") {
			this.saldo = 50;
			
		}else if(t= "CP") {
			this.saldo =150;
		}
		

	}

	public void fecharConta() {
		if (saldo > 0) {
			System.out.println("Conta com dinheiro");
			
		}else if(saldo < 0) {
			System.out.println("Conta em débito");
		}else {
			System.out.println("");
			this.setStatus(false);
		}
		

	}

	public void depositar() {
		if(this.status =true) {
			saldo = saldo + v
		}
		

	}

	public void sacar() {

	}

	public void pagarMensal() {

	}

}
