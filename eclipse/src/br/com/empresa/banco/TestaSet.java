package br.com.empresa.banco;

import java.util.HashSet;
import java.util.Set;

import br.com.empresa.banco.conta.Conta;
import br.com.empresa.banco.conta.ContaCorrente;

public class TestaSet {

	public static void main(String[] args) {
		Conta c1 = new ContaCorrente(0, "Guilherme");
		Conta c2 = new ContaCorrente(0, "Rafael");

		Set<Conta> contas = new HashSet<>();
		contas.add(c1);
		contas.add(c2);

		System.out.println(contas.size());

	}

}
