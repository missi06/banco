package br.com.missi.banco;

import javax.swing.JOptionPane;

import br.com.missi.banco.conta.*;

public class TestaComparacaoConta {

	public static void main(String[]args){
					  
		Conta c1 = new ContaCorrente();
		Conta c2 = new ContaCorrente();
		
		c1.setNome("Missi");
		c2.setNome(JOptionPane.showInputDialog("Digite o nome do Cliente para comparar"));
		
		c1.setNumero(135);
		c2.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero da conta para comparar")));
		
		//Com nome
		  if(c1.getNome().equals(c2.getNome())){
		   System.out.print("Os nomes s�o iguais");
		  }else{
		   System.out.print("Os nomes s�o diferentes");
		  }
		  
		  //Com n�mero
		  /*if(c1.getNumero().equals(c2.getNumero())){
			   System.out.print("\nOs n�meros s�o iguais");
			  }else{
			   System.out.print("\nOs n�meros s�o diferentes");
			  }*/
		
	}
}
