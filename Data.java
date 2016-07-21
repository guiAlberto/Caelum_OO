class Data{
	private int dia;
	private int mes;
	private int ano;
	
	public Data(){
	}
	
	public Data(int dia, int mes, int ano){
	
		if(dia >= 31) throw new IllegalArgumentException("Dia não pode ser maior do que 31");
		if(dia < 1) throw new IllegalArgumentException("Dia não pode ser menor do que 1");
		if(mes > 12) throw new IllegalArgumentException("Mês não pode ser maior do que 12");
		if(mes < 1) throw new IllegalArgumentException("Mês não pode ser menor do que 1");
	
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		
	}
	
	String formatada(){
		return this.dia + "/" + this.mes + "/" + this.ano;
	}
}
