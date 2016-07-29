package br.com.empresa.banco;

import br.com.empresa.banco.conta.Conta;
import br.com.empresa.banco.conta.ContaCorrente;

public class TestaToString {

	public static void main(String[] args) {
		Conta conta = new ContaCorrente(1234, "");
		System.out.println(conta);
	}

}
