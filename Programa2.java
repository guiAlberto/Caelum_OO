class Porta{
	
	boolean aberta;
	String cor;
	int dimensaoX;
	int dimensaoY;
	int dimensaoZ;
	
	void abre(){
		this.aberta = true;
	}
	
	void fecha(){
		this.aberta = false;
	}
	
	void pinta(String cor){
		this.cor = cor;
	}
	
	boolean estaAberta(){
		return this.aberta;
	}
	
	void imprime(){
		System.out.println("A porta está" + (this.estaAberta() ? "aberta" : "fechada"));
		System.out.println("A porta é " + this.cor);
		System.out.println("As dimensões da porta é " + this.dimensaoX + " x " + this.dimensaoY + " x " + dimensaoZ + "\n");
	}
	
	public static void main(String[] args){
		Porta porta = new Porta();
		porta.aberta = false;
		porta.cor = "Azul";
		porta.dimensaoX = 800;
		porta.dimensaoY = 2100;
		porta.dimensaoZ = 5;
		
		porta.imprime();
		
		porta.fecha();
		
		porta.imprime();
		
		porta.abre();
		porta.cor = "Cinza";
		porta.dimensaoZ = 7;
		
		porta.imprime();
	}
	
}