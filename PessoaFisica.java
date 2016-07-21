class PessoaFisica{
	private String nome;
	private String cpf;
	
	public PessoaFisica(){
	}
	
	public PessoaFisica(String cpf){
		this.cpf = cpf;
		if(!validaCpf()){
			throw new IllegalArgumentException("CPF inválido");
		}
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public String getCpf(){
		return this.cpf;
	}
	
	public void setCpf(String cpf){
		this.cpf = cpf;
	}
	
	private boolean validaCpf(){
		return this.cpf.length() == 14;
	}
	
	public static void main(String[] args){
		PessoaFisica p1 = new PessoaFisica();
		PessoaFisica p2 = new PessoaFisica("123.456.789.00");
		try{
			PessoaFisica p3 = new PessoaFisica("123.456");
		}catch(IllegalArgumentException e){
			System.err.println(e);
		}
	}
}
