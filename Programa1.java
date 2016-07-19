class Pessoa{
	
	String nome;
	int idade;
	
	void fazAniversario(){
		this.idade++;
		System.out.println(nome  + " fez aniversário");
	}
	
	void imprime(){
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + this.idade);
	}
	
	public static void main(String[] args){
		Pessoa pessoa = new Pessoa();
		pessoa.nome = "José";
		pessoa.idade = 15;
		pessoa.imprime();
		pessoa.fazAniversario();
		pessoa.imprime();
	}
}