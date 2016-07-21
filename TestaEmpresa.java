class TestaEmpresa{
	
	public static void main(String[] args){
		Empresa empresa = new Empresa(5);
		for (int i = 0; i < 20; i++) {
			Funcionario f = new Funcionario();
			f.setNome("Nome" + i);
			f.setDepartamento("Financeiro");
			f.setSalario(1000 + i * 100);
			f.setRg("123.456.789." + i);
			empresa.adiciona(f);
		}
		empresa.mostraEmpregados();
		
		Funcionario funcionarioA = new Funcionario();
		funcionarioA.setRg("123.456.789.1");
		
		Funcionario funcionarioB = new Funcionario();
		funcionarioB.setRg("123.456.789.10");
		
		System.out.println(empresa.contem(funcionarioA) ? "Funcionário A pertence à empresa" : "Funcionário A não pertence à empresa");
		System.out.println(empresa.contem(funcionarioB) ? "Funcionário B pertence à empresa" : "Funcionário B não pertence à empresa");
		
		Funcionario f8 = empresa.getFuncionario(7);
		System.out.println();
		System.out.println("Funcionário na oitava posição:");
		f8.mostra();
	}
	
}
