class TestaFuncionario{
	
	public static void main(String[] args){
		Funcionario f1 = new Funcionario("Hugo");
		
		f1.setDepartamento("Financeiro");
		f1.setSalario(100);
		
		System.out.print("Data de entrada do funcionário antes da atribuição: ");
		System.out.println(f1.getDataEntrada().formatada());
		
		f1.setDataEntrada(new Data(1, 1, 1970));
		f1.setRg("123.456.789.00");
		
		System.out.println("Informações do funcionário antes do aumento");
		f1.mostra();
		
		f1.recebeAumento(50);
		
		System.out.println("Informações do funcionário depois do aumento");
		f1.mostra();
	}
	
}
