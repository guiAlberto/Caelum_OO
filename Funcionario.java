class Funcionario{
	String nome;
	String departamento;
	double salario;
	Data dataEntrada = new Data();
	String rg;
	
	void recebeAumento(double aumento){
		this.salario += aumento;
	}
	
	double calculaGanhoAnual(){
		return this.salario * 12;
	}
	
	void mostra(){
		System.out.println("Nome: " + this.nome);
		System.out.println("Departamento: " + this.departamento);
		System.out.println("Salário: " + this.salario);
		System.out.println("Data de entrada: " + this.dataEntrada.formatada());
		System.out.println("RG: " + this.rg);
		System.out.println("Ganho anual: " + this.calculaGanhoAnual());
		System.out.println();
	}
}