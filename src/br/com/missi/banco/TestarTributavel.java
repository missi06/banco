package br.com.missi.banco;

import Banco_ex_7_7.Tributavel;
import br.com.missi.banco.conta.ContaCorrente;

public class TestarTributavel {

	public static void main(String[]args){
		ContaCorrente cc = new ContaCorrente();
		cc.deposita(100);
		System.out.println(cc.calculaTributos());
		
		//testando polimorfismo
		Tributavel t = cc;
		System.out.println(t.calculaTributos());
	}
}
