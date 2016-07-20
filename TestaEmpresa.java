class TestaEmpresa{
	
	public static void main(String[] args){
		Empresa empresa = new Empresa();
		for (int i = 0; i < 20; i++) {
			Funcionario f = new Funcionario();
			f.nome = "Nome" + i;
			f.departamento = "Financeiro";
			f.salario = 1000 + i * 100;
			f.rg = "123.456.789." + i;
			empresa.adiciona(f);
		}
		empresa.mostraEmpregados();
		
		Funcionario funcionarioA = new Funcionario();
		funcionarioA.rg = "123.456.789.1";
		
		Funcionario funcionarioB = new Funcionario();
		funcionarioB.rg = "123.456.789.10";
		
		System.out.println(empresa.contem(funcionarioA) ? "Funcionário A pertence à empresa" : "Funcionário A não pertence à empresa");
		System.out.println(empresa.contem(funcionarioB) ? "Funcionário B pertence à empresa" : "Funcionário B não pertence à empresa");
	}
	
}