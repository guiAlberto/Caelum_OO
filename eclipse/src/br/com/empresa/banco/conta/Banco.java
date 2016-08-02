package br.com.empresa.banco.conta;

import java.util.Map;
import java.util.TreeMap;

public class Banco {

	Map<String, Conta> contas = new TreeMap<>();

	public void adiciona(Conta conta) {
		contas.put(conta.getNome(), conta);
	}

	public int pegaQuantidadeDeContas() {
		return contas.size();
	}

	public Conta buscaPorNome(String nome) {
		return contas.get(nome);
	}
}
