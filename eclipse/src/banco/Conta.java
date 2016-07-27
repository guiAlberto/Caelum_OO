package banco;

public abstract class Conta {

	protected double saldo;

	void deposita(double valor) {
		if (valor < 0) {
			throw new ValorInvalidoException(valor);
		} else {
			this.saldo += valor - 0.1;
		}
	}

	public void saca(double valor) {
		this.saldo -= valor;
	}

	public double getSaldo() {
		return this.saldo;
	}

	// public void atualiza(double taxa) {
	// this.saldo += this.saldo * taxa;
	// }

	public abstract void atualiza(double taxa);

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
