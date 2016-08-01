package br.com.empresa.banco.conta;

public class ContaPoupanca extends Conta implements Comparable<ContaPoupanca> {

	// @Override
	// public void atualiza(double taxa) {
	// super.atualiza(taxa * 3);
	// }

	public ContaPoupanca(int numero, String nome) {
		super(numero, nome);
	}

	@Override
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 3;

	}

	@Override
	public int compareTo(ContaPoupanca arg0) {
		// return this.getNome().compareTo(arg0.getNome());
		return Integer.compare(this.getNumero(), arg0.getNumero());

	}

}
