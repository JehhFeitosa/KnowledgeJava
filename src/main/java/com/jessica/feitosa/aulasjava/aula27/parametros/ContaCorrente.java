package com.jessica.feitosa.aulasjava.aula27.parametros;

public class ContaCorrente {

	String numero;
	String agencia;
	boolean especial;
	double limiteEspecial;
	double valorEspecialUsado;
	double saldo;
	
	boolean realizarSaque(double quantiaASacar){
		
		//tem saldo na conta
		if (saldo >= quantiaASacar) {
			saldo -= quantiaASacar;
			return true;
		} else {//n�o tem saldo na conta
			if (especial) {
				//verificar se o limite especial tem saldo
				double limite = limiteEspecial + saldo;
				if (limite >= quantiaASacar) {
					saldo -= quantiaASacar;
					return true;
				}else {
					return false;
				}
			} else {
				return false; //n�o � especial e n�o tem saldo suficiente
			}
		}
	}
	
	void depositar(double valorDepositado) {
		saldo += valorDepositado;
	}
	void consultarSaldo() {
		System.out.println("Saldo atual da conta = " + saldo);
	}
	
	boolean verificarUsoChequeEspecial() {
		return saldo <0;
	}
}
	
	
	
	
	
	
	
	
	
	
