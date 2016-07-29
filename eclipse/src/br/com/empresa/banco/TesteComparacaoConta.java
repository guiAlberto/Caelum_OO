package br.com.empresa.banco;

import br.com.empresa.banco.conta.Conta;
import br.com.empresa.banco.conta.ContaCorrente;
import br.com.empresa.banco.conta.ContaPoupanca;

public class TesteComparacaoConta {

	public static void main(String[] args) {
		Conta c1 = new ContaCorrente(1234, "Guilherme");
		Conta c2 = new ContaPoupanca(1234, "Guilherme");

		System.out.println(".equals: contas " + (c1.equals(c2) ? "iguais" : "diferentes"));
		System.out.println("== : contas " + (c1 == c2 ? "iguais" : "diferentes"));
	}

}
