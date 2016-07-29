package br.com.empresa.banco.conta;

public class ContaPoupanca extends Conta {

//	@Override
//	public void atualiza(double taxa) {
//		super.atualiza(taxa * 3);
//	}
	
	public ContaPoupanca(int numero, String nome) {
		super(numero, nome);
	}

	@Override
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 3;
		
	}	

}
