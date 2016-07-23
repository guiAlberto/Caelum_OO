public class TestaContas {

	public static void main(String[] args) {
		Conta c = new Conta();
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();
		Conta ci = new ContaInvestimento();

		c.deposita(1000);
		cc.deposita(1000);
		cp.deposita(1000);
		ci.deposita(1000);
	
		c.atualiza(0.01);
		cc.atualiza(0.01);
		cp.atualiza(0.01);
		ci.atualiza(0.1);
	
		System.out.println(c.getSaldo());
		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());
		System.out.println(ci.getSaldo());
	}
	
}
