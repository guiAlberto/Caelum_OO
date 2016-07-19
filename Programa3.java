class Casa{
	
	String cor;
	Porta porta1;
	Porta porta2;
	Porta porta3;
	
	void pinta(String cor){
		this.cor = cor;
	}
	
	int quantasPortasEstaoAbertas(){
		int portasAbertas = 0;
		
		if(porta1.estaAberta())
			portasAbertas++;
		if(porta2.estaAberta())
			portasAbertas++;
		if(porta3.estaAberta())
			portasAbertas++;
		
		return portasAbertas;
	}
	
	public static void main(String[] args){
		Casa casa = new Casa();
		casa.cor = "Rosa";
		casa.porta1 = new Porta();
		casa.porta2 = new Porta();
		casa.porta3 = new Porta();
		
		casa.porta2.abre();
		
		System.out.println("A casa é " + casa.cor);
		System.out.println("A casa está com " + casa.quantasPortasEstaoAbertas() + " portas abertas");
		
		casa.cor = "Vermelha";
		casa.porta2.abre();
		casa.porta3.abre();
		System.out.println("A casa é " + casa.cor);
		System.out.println("A casa está com " + casa.quantasPortasEstaoAbertas() + " portas abertas");
		
	}
	
}