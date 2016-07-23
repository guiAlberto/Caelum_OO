public class TestaAtualizadorDeContas {

	public static void main(String[] args) {
		Conta c = new Conta();
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();
		Conta ci = new ContaInvestimento();
		
		c.deposita(1000);
		cc.deposita(1000);
		cp.deposita(1000);
		ci.deposita(1000);
		
		AtualizadorDeContas adc = new AtualizadorDeContas(0.1);
		
		adc.roda(c);
		adc.roda(cc);
		adc.roda(cp);
		adc.roda(ci);
		
		System.out.println("Saldo total: " + adc.getSaldoTotal());
	}
	
}
