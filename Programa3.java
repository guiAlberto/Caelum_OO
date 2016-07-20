class Casa{
	
	String cor;
	int totalDePortas;
	Porta[] portas = new Porta[10];
	
	void pinta(String cor){
		this.cor = cor;
	}
	
	int quantasPortasEstaoAbertas(){
		int portasAbertas = 0;
		for(Porta p : this.portas){
			if(p != null && p.estaAberta()){
				portasAbertas++;
			}
		}
		return portasAbertas;
	}
	
	void adicionaPorta(Porta p){
		if(this.portas.length == totalDePortas){
			aumentaEspaco();
		}		
		this.portas[totalDePortas++] = p;
	}
	
	int totalDePortas(){
		return this.totalDePortas;
	}
	
	void aumentaEspaco(){
		Porta[] temp = new Porta[portas.length * 2];
		for(int i = 0; i < portas.length; i++){
			temp[i] = portas[i];
		}
		portas = temp;
	}
	
	public static void main(String[] args){
		Casa casa = new Casa();
		casa.cor = "Rosa";
		for(int i = 0; i < 20; i++){
			casa.adicionaPorta(new Porta());
		}
		
		System.out.println("Número de portas abertas: " + casa.quantasPortasEstaoAbertas());
		
		casa.portas[2].abre();
		casa.portas[5].abre();
		
		System.out.println("Número de portas abertas: " + casa.quantasPortasEstaoAbertas());
		System.out.println("A casa possui " + casa.totalDePortas() + " portas");
	}
	
}