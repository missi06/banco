package br.com.missi.banco;

import java.util.*;

import Banco_ex_7_7.OrdenaPorNome;
import br.com.missi.banco.conta.*;

public class TestaOrdenacao {

	public static void main(String[]args){
		//List<ContaPoupanca> contas = new ArrayList<>();
		List<ContaPoupanca> contas = new LinkedList<>();
		Random gerador = new Random();
		
		List<ContaPoupanca> teste = new LinkedList<>();
		
		/*ContaPoupanca c1 = new ContaPoupanca();
		c1.setNumero(1973);
		c1.setNome("Missi");
		c1.setSaldo(5000.0);
		contas.add(c1);
		
		ContaPoupanca c2 = new ContaPoupanca();
		c2.setNumero(1462);
		c2.setNome("Ana");
		c2.setSaldo(504.0);
		contas.add(c2);
		
		ContaPoupanca c3 = new ContaPoupanca();
		c3.setNumero(1854);
		c3.setNome("Bruno");
		c3.setSaldo(1500.0);
		contas.add(c3);*/
		/* 		~P/ embaralhar
		Collections.shuffle(contas);*/
		
		/* 		~P/ inverter
		Collections.reverse(contas);*/
		
		teste.add(new ContaPoupanca("Missi"));
		teste.add(new ContaPoupanca("Ana"));
		teste.add(new ContaPoupanca("Bruno"));
		
		Collections.sort(teste);
		
		for(ContaPoupanca o : teste){
			System.out.println(o.getNome());
		}
                
		/*for (int i = 0; i < contas.size(); i++) {
			System.out.println("numero: " + contas.get(i).getNumero());
			System.out.println("numero: " + gerador.nextInt(7000));
			}
		System.out.println(contas);*/


	}

	
}
