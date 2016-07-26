package banco;

public abstract class Conta {
	
	protected double saldo;

	void deposita(double valor){
		this.saldo += valor;
	}
	
	public void saca(double valor){
		this.saldo -= valor;
	}

	public double getSaldo() {
		return this.saldo;
	}
	
//	public void atualiza(double taxa) {
//		this.saldo += this.saldo * taxa;
//	}
	
	public abstract void atualiza(double taxa);

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
