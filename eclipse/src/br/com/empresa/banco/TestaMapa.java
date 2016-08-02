package br.com.empresa.banco;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import br.com.empresa.banco.conta.Conta;
import br.com.empresa.banco.conta.ContaCorrente;

public class TestaMapa {

	public static void main(String[] args) {
		Conta c1 = new ContaCorrente(new Random().nextInt(1000), "Guilherme");
		c1.deposita(10000);
		Conta c2 = new ContaCorrente(new Random().nextInt(1000), "Rafael");
		c2.deposita(3000);
		// cria o mapa
		Map mapaDeContas = new HashMap();
		// adiciona duas chaves e seus valores
		mapaDeContas.put("diretor", c1);
		mapaDeContas.put("gerente", c2);
		// qual a conta do diretor?
		Conta contaDoDiretor = (Conta) mapaDeContas.get("diretor");
		System.out.println(contaDoDiretor.getSaldo());
	}

}
