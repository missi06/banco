package br.com.missi.banco;

import br.com.missi.banco.conta.Conta;
import br.com.missi.banco.conta.ContaCorrente;
import br.com.missi.banco.conta.ContaPoupanca;
import br.com.missi.banco.sistema.AtualizadorDeContas;

public class StartConta {

	public static void main(String[]args){
		Conta c = new ContaCorrente();
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();
		
		c.deposita(1000);
		cc.deposita(1000);
		cp.deposita(1000);
		
		/*c.atualiza(0.01);
		cc.atualiza(0.01);
		cp.atualiza(0.01);*/
		
		AtualizadorDeContas adc = new AtualizadorDeContas(0.01);
		adc.roda(c);
		adc.roda(cc);
		adc.roda(cp);
		
		System.out.println("Saldo Total: R$ " + adc.getSaldoTotal());
		/*System.out.println("Saldo: R$ " + cc.getSaldo());
		System.out.println("Saldo: R$ " + cp.getSaldo());*/
	}
}
