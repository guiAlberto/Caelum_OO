public class ContaInvestimento extends Conta {
	
	@Override
	public void atualiza(double taxa) {
		int valorAleatorio = (int) Math.ceil(Math.random() * 100);
		System.out.println("Valor aleatório: " + valorAleatorio);
		super.atualiza(taxa * valorAleatorio * taxa * 10);
	}
	
}
