package Banco_ex_7_7;

import br.com.missi.banco.conta.Conta;

public class OrdenaPorNome implements Comparable<OrdenaPorNome> {

	String nome;
	
	public String getNome() {
		return nome;
	}
	
	public OrdenaPorNome(String nome){
		this.nome = nome;
	}

	

	@Override
	public int compareTo(OrdenaPorNome o) {
		return this.nome.compareTo(o.getNome());
	}
	
}
