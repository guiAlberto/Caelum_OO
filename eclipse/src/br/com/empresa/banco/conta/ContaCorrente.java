package br.com.empresa.banco.conta;

public class ContaCorrente extends Conta implements Tributavel {

	public ContaCorrente(int numero, String nome) {
		super(numero, nome);
	}

	@Override
	public void deposita(double valor) {
		super.deposita(valor - 0.10);
	}

	// @Override
	// public void atualiza(double taxa) {
	// super.atualiza(taxa * 2);
	// }

	@Override
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 2;

	}

	@Override
	public double calculaTributos() {
		return this.getSaldo() * 0.01;
	}

}
