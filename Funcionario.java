class Funcionario{
	private String nome;
	private String departamento;
	private double salario;
	private Data dataEntrada = new Data();
	private String rg;
	private int identificador;
	private static int quantidadeDeFuncionarios = 0;
	
	public Funcionario(){
		Funcionario.quantidadeDeFuncionarios++;
		this.identificador = Funcionario.quantidadeDeFuncionarios;
	}
	
	public Funcionario(String nome){
		this.nome = nome;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getDepartamento(){
		return this.departamento;
	}
	
	public void setDepartamento(String departamento){
		this.departamento = departamento;
	}
	
	public double getSalario(){
		return this.salario;
	}
	
	public void setSalario(double salario){
		this.salario = salario;
	}
	
	public Data getDataEntrada(){
		return this.dataEntrada;
	}
	
	public void setDataEntrada(Data dataEntrada){
		this.dataEntrada = dataEntrada;
	}
	
	public String getRg(){
		return this.rg;
	}
	
	public void setRg(String rg){
		this.rg = rg;
	}
	
	public int getIdentificador(){
		return this.identificador;
	}
		
	public void recebeAumento(double aumento){
		this.salario += aumento;
	}
	
	public double calculaGanhoAnual(){
		return this.salario * 12;
	}
	
	public void mostra(){
		System.out.println("Nome: " + this.nome);
		System.out.println("Departamento: " + this.departamento);
		System.out.println("Salário: " + this.salario);
		System.out.println("Data de entrada: " + this.getDataEntrada().formatada());
		System.out.println("RG: " + this.rg);
		System.out.println("Ganho anual: " + this.calculaGanhoAnual());
		System.out.println("Identificador: " + this.identificador);
		System.out.println();
	}
}

class Empresa{
	private String nome;
	private String cnpj;
	private Funcionario[] empregados;
	private int cont = 0;
	
	public Empresa(int numeroDeFuncionarios){
		empregados = new Funcionario[numeroDeFuncionarios];
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public Funcionario[] getEmpregados(){
		return this.empregados;
	}
	
	public void adiciona(Funcionario funcionario){
		if(cont == this.empregados.length){
			this.aumenteEspaco();
		}
		this.empregados[cont] = funcionario;
		cont++;
	}
	
	public void mostraEmpregados() {
		for (Funcionario funcionario : this.empregados) {
			if(funcionario != null){
				funcionario.mostra();
			}
		}
	}
	
	public boolean contem(Funcionario f){
		for(Funcionario funcionario : this.empregados){
			if(funcionario != null && f.getRg().equals(funcionario.getRg())){
				return true;
			}
		}
		return false;
	}
	
	public Funcionario getFuncionario(int posicao){
		return this.empregados[posicao];
	}
	
	private void aumenteEspaco(){
		Funcionario[] temp = new Funcionario[cont * 2];
		for(int i = 0; i < this.empregados.length; i++){
			temp[i] = this.empregados[i];
		}
		this.empregados = temp;
	}
}
