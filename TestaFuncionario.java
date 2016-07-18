class TestaFuncionario{
	
	public static void main(String[] args){
		Funcionario f1 = new Funcionario();
		
		f1.nome = "Hugo";
		f1.departamento = "Financeiro";
		f1.salario = 100;
		
		System.out.print("Data de entrada do funcionário antes da atribuição: ");
		System.out.println(f1.dataEntrada.formatada());
		
		f1.dataEntrada.dia =  1;
		f1.dataEntrada.mes = 1;
		f1.dataEntrada.ano = 1970;
		f1.rg = "123.456.789.00";
		
		System.out.println("Informações do funcionário antes do aumento");
		f1.mostra();
		
		f1.recebeAumento(50);
		
		System.out.println("Informações do funcionário depois do aumento");
		f1.mostra();
	}
	
}