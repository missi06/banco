package br.com.missi.banco.conta;

public class ContaPoupanca extends Conta implements Comparable<ContaPoupanca>{

	
	/*public int compareTo(ContaPoupanca o) {
		if (this.getNumero() < o.getNumero()) {
			return -1;
		}
		if (this.getNumero() > o.getNumero()) {
			return 1;
		}
			return 0;
	}*/
	
	public ContaPoupanca(String nome) {
		this.nome = nome;
	}
	
	public ContaPoupanca() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compareTo(ContaPoupanca cp) {
		return this.nome.compareTo(cp.getNome());
	}
	
	//@Override
	/*public	void atualiza(double taxa) {
		// TODO Auto-generated method stub
		
	}*/

	/*@Override
	public void atualiza(double taxa){
		super.atualiza(taxa * 3);
	}*/
}
