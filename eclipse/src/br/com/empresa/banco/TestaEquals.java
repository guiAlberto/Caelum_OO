package br.com.empresa.banco;

import br.com.empresa.banco.conta.Conta;
import br.com.empresa.banco.conta.ContaCorrente;

public class TestaEquals {

	public static void main(String[] args) {
		try {
			String naoConta = new String("bla");
			Conta conta = new ContaCorrente(0, "bla");
			conta.equals(naoConta);
		} catch (ClassCastException e) {
			System.err.println(e);
		}
	}

}
