package Banco_ex_7_7;

import br.com.missi.banco.conta.Conta;
import br.com.missi.banco.conta.ContaCorrente;

public class Banco2 {
	
	protected ContaCorrente contas;
	String nome;
	int numero;
	
	int numContas,capacidade = 0;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
	public void adiciona(Conta c){
		
		/*if(numContas < capacidade){
			contas.add = c;
		}else{
			System.out.println("Número de contas no limite");
		}*/
	}
	
	

}
