package br.com.empresa.banco.conta;

/**
 * Classe responsável por moldar contas de banco
 * 
 * @author guilherme
 *
 */

public abstract class Conta {

	protected double saldo;
	protected int numero;
	private String nome;

	public String getNome() {
		return nome;
	}

	public Conta(int numero, String nome) {
		super();
		this.numero = numero;
		this.nome = nome;
	}

//	@Override
//	public boolean equals(Object obj) {
//		Conta conta = (Conta) obj;
//		return this.numero == conta.numero && this.nome.equals(conta.nome);
//	}

	public int getNumero() {
		return numero;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numero;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (numero != other.numero)
			return false;
		return true;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

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
	 * 
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

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("titular: " + this.nome + "\n");
		stringBuilder.append("numero: " + this.numero + "\n");
		return stringBuilder.toString();

	}

}
