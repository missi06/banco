package br.com.missi.banco.conta;

import Banco_ex_7_7.Tributavel;

public class ContaCorrente extends Conta implements Tributavel{

	/*@Override
	public void atualiza(double taxa){
		super.atualiza(taxa * 2);
	}
	@Override
	public void deposita(double valor){
		this.saldo += valor - 0.10;
	}*/

	@Override
	/*public void atualiza(double taxa) {
		// TODO Auto-generated method stub
		
	}*/
	
	public double calculaTributos() {
		return this.getSaldo() * 0.01;
		}

}
