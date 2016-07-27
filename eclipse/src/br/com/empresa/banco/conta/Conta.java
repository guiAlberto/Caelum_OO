package br.com.empresa.banco.conta;

/**
 * Classe responsável por moldar contas de banco
 * 
 * @author guilherme
 *
 */

public abstract class Conta {

	protected double saldo;

	/**
	 * Método que incrementa algum valor maior do que zero ao saldo da conta
	 * 
	 * @param valor
	 */
	public void deposita(double valor) {
		if (valor < 0) {
			throw new ValorInvalidoException(valor);
		} else {
			this.saldo += valor - 0.1;
		}
	}

	/**
	 * Método que retira algm valor da conta
	 *  
	 * @param valor
	 */
	public void saca(double valor) {
		this.saldo -= valor;
	}

	/**
	 * getter do atributo saldo
	 * @return
	 */
	public double getSaldo() {
		return this.saldo;
	}

	// public void atualiza(double taxa) {
	// this.saldo += this.saldo * taxa;
	// }

	/**
	 * Assinatura do método responsável por aualizar a conta
	 * 
	 * @param taxa
	 */
	public abstract void atualiza(double taxa);

	/**
	 * setter do atributo saldo
	 * 
	 * @param saldo
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
