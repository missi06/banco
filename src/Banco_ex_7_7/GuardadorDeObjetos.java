package Banco_ex_7_7;

public class GuardadorDeObjetos {

	private Object[] arrayDeObjetos = new Object[100];
	private int posicao = 0;
	
	public void adicionaObjeto(Object object) {
		this.arrayDeObjetos[this.posicao] = object;
		this.posicao++;
	}
	
	public Object pega(int indice) {
		return this.arrayDeObjetos[indice];
	}

}
