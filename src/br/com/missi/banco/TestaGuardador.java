package br.com.missi.banco;

import Banco_ex_7_7.GuardadorDeObjetos;
import br.com.missi.banco.conta.ContaCorrente;
import br.com.missi.banco.conta.ContaPoupanca;

public class TestaGuardador {

	public static void main(String[]args){
		
		GuardadorDeObjetos guardador = new GuardadorDeObjetos();
		ContaCorrente cc = new ContaCorrente();
		guardador.adicionaObjeto(cc);
		
		ContaPoupanca cp = (ContaPoupanca) guardador.pega(0);
	}
}
