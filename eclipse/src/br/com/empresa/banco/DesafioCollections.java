package br.com.empresa.banco;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class DesafioCollections {

	/**
	 * Parte 1: Gere todos os números entre 1 e 1000 e ordene em ordem
	 * decrescente utilizando um TreeSet. Como ficou seu código? Parte 2: Gere
	 * todos os números entre 1 e 1000 e ordene em ordem decrescente utilizando
	 * um ArrayList. Comoficou seu código?
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		parte1();
		parte2();
	}

	private static void parte2() {
		List<Integer> list = new ArrayList();
		for(int i = 1; i <= 1000; i++){
			list.add(i);
		}
		
		Collections.sort(list);
		Collections.reverse(list);
		System.out.println(list);

	}

	private static void parte1() {
		Set<Integer> set = new TreeSet<>();
		for (int i = 1; i <= 1000; i++) {
			set.add(i);
		}
		List<Integer> list = new LinkedList<>();
		list.addAll(set);
		Collections.sort(list);
		Collections.reverse(list);
		System.out.println(list);
	}

}
