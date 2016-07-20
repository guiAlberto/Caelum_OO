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

class Empresa{
	String nome;
	String cnpj;
	Funcionario[] empregados = new Funcionario[10];
	int cont = 0;
	
	void adiciona(Funcionario funcionario){
		if(cont == this.empregados.length){
			this.aumenteEspaco();
		}
		this.empregados[cont] = funcionario;
		cont++;
	}
	
	void mostraEmpregados() {
		for (Funcionario funcionario : this.empregados) {
			if(funcionario != null){
				funcionario.mostra();
			}
		}
	}
	
	boolean contem(Funcionario f){
		for(Funcionario funcionario : this.empregados){
			if(funcionario != null && f.rg.equals(funcionario.rg)){
				return true;
			}
		}
		return false;
	}
	
	void aumenteEspaco(){
		Funcionario[] temp = new Funcionario[cont * 2];
		for(int i = 0; i < this.empregados.length; i++){
			temp[i] = this.empregados[i];
		}
		this.empregados = temp;
	}
}