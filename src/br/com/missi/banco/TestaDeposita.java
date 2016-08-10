package br.com.missi.banco;

import br.com.missi.banco.conta.Conta;
import br.com.missi.banco.conta.ContaPoupanca;

public class TestaDeposita {

	public static void main(String[]args){
		Conta cp = new ContaPoupanca();
		try {
			cp.deposita(-100);
			System.out.println("Deposito feito com sucesso!");
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}

	}
}
