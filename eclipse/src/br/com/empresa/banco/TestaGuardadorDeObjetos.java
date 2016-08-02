package br.com.empresa.banco;

import br.com.empresa.banco.conta.ContaCorrente;
import br.com.empresa.banco.conta.ContaPoupanca;
import br.com.empresa.banco.conta.GuardadorDeObjetos;

public class TestaGuardadorDeObjetos {

	public static void main(String[] args) {
		GuardadorDeObjetos gdo = new GuardadorDeObjetos();
		ContaCorrente cc = new ContaCorrente(1234, "Guilherme");
		gdo.adicionaObjeto(cc);
		
		ContaPoupanca cp = (ContaPoupanca) gdo.pegaObjeto(0);
	}

}
