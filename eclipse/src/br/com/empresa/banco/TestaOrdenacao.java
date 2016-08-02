package br.com.empresa.banco;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import br.com.empresa.banco.conta.ContaPoupanca;

public class TestaOrdenacao {

	public static void main(String[] args) {
		List<ContaPoupanca> contas = new LinkedList<>();
		
		for(int i = 0; i < 10; i++){
			contas.add(new ContaPoupanca(new Random().nextInt(10000), "Guilherme"));
		}

		Collections.sort(contas);
		System.out.println("Collections.sort");
		imprime(contas);

		System.out.println("Collections.reverse");
		Collections.reverse(contas);
		imprime(contas);
		
		System.out.println("Collections.shuffle");
		Collections.shuffle(contas);
		imprime(contas);
		
		System.out.println("Collections.rotate(1)");
		Collections.rotate(contas, 1);
		imprime(contas);
		
	}

	private static void imprime(List<ContaPoupanca> contas) {
		for(ContaPoupanca contaPoupanca : contas){
			System.out.println(contaPoupanca.toString());
		}
		System.out.println("******************************");
	}

}
