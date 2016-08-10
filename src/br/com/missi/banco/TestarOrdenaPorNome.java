package br.com.missi.banco;

import java.util.*;

import Banco_ex_7_7.OrdenaPorNome;


public class TestarOrdenaPorNome {

	public static void main(String[]args){
		
		List<OrdenaPorNome> contas = new LinkedList<>();


		contas.add(new OrdenaPorNome("Missi"));
		contas.add(new OrdenaPorNome("Ana"));
		contas.add(new OrdenaPorNome("Bruno"));
		
	
		Collections.sort(contas);
		
		for(OrdenaPorNome o : contas){
			System.out.println(o.getNome());
		}
	}
	}