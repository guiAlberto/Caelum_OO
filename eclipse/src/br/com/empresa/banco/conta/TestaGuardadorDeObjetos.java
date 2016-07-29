package br.com.empresa.banco.conta;

public class TestaGuardadorDeObjetos {

	public static void main(String[] args) {
		GuardadorDeObjetos gdo = new GuardadorDeObjetos();
		ContaCorrente cc = new ContaCorrente(1234, "Guilherme");
		gdo.adicionaObjeto(cc);
		
		ContaPoupanca cp = (ContaPoupanca) gdo.pegaObjeto(0);
	}

}
