package br.com.missi.banco.sistema;

import br.com.missi.banco.conta.Conta;

public class AtualizadorDeContas {

	private double saldoTotal = 0;
	private double selic;
	
	public AtualizadorDeContas(double selic){
		this.selic = selic;
	}
	public void roda(Conta c){
		System.out.println("Antes da Atualização: " + c.getSaldo());
		//c.atualiza(selic);
		System.out.println("Depois da Atualização: " + c.getSaldo() + "\n");
		this.saldoTotal += c.getSaldo();
	}
	
	//////
	public double getSaldoTotal() {
		return saldoTotal;
	}
	
	
	
}
