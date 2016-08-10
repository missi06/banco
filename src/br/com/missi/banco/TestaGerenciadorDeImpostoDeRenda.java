package br.com.missi.banco;

import Banco_ex_7_7.GerenciadorDeImpostoDeRenda;
import Banco_ex_7_7.SeguroDeVida;
import Banco_ex_7_7.Tributavel;
import br.com.missi.banco.conta.ContaCorrente;

public class TestaGerenciadorDeImpostoDeRenda {

	public static void main(String[] args) {
		GerenciadorDeImpostoDeRenda gerenciador = new GerenciadorDeImpostoDeRenda();
		
		SeguroDeVida sv = new SeguroDeVida();
		gerenciador.adiciona(sv);
		
		ContaCorrente cc = new ContaCorrente();
		cc.deposita(1000);
		gerenciador.adiciona((Tributavel) cc);
		
		System.out.printf("Saldo Total: %.2f" + gerenciador.getTotal());
	}
}
