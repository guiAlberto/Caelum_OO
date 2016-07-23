public class Banco {
	
	private Conta[] contas = new Conta[3];
	private int quantidade = 0;
	
	
	public void adiciona(Conta conta) {
		this.garanteEspaco();
		contas[this.quantidade++] = conta;
	}
	
	public Conta pegaConta(int indice) {
		return this.contas[indice];
	}
	
	public int pegaTotalDeContas() {
		return this.quantidade;
	}
	
	private void garanteEspaco(){
		if(quantidade >= this.contas.length) {
			Conta[] temp = new Conta[this.quantidade * 2];
			for(int i = 0; i < this.contas.length; i++) {
				temp[i] = this.contas[i];
			}
			contas = temp;
		}
	}
	
	public static void main(String[] args){
		Conta[] contas = new Conta[4];
		AtualizadorDeContas adc = new AtualizadorDeContas(0.02);
		Banco banco = new Banco();
		
		contas[0]= new Conta();
		contas[1] = new ContaCorrente();
		contas[2] = new ContaPoupanca();
		contas[3] = new ContaInvestimento();
		
		for(Conta conta: contas){
			conta.deposita(1000);
			adc.roda(conta);
			banco.adiciona(conta);
		}
		
	}
	
}
