package br.com.missi.banco.conta;

import Banco_ex_7_7.ValorInvalidoException;

public class Conta {

	protected String nome;
	protected double saldo;
	protected int numero;
	
	
	
	
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

	public boolean equals(Object obj) {
	Conta outraConta = (Conta) obj;
	return this.numero == outraConta.numero;
	}
	
	public void deposita(double valor){
		if (valor < 0) {
			throw new ValorInvalidoException(valor);
			} else {
			this.saldo += valor;
			}
	}
	public void saca(double valor){
		this.saldo -= valor;
	}
	//public abstract void atualiza(double taxa);
	//////
	public double getSaldo(){
		return this.saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public String toString() {
		return "Esse objeto é uma conta com saldo R$" + this.saldo;
		}

	
	
	
}
