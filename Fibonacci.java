class Fibonacci{
	
	int[] valores = new int[10];
	
	public static void main(String[] args){
		Fibonacci fibonacci = new Fibonacci();
		
		int limite = 40;
		long inicio = System.currentTimeMillis();
		for(int i = 1; i <= limite; i++){
			int resultado = fibonacci.calculaFibonacciRecursivoSemArray(i);
			System.out.println(resultado);
		}
		long fim = System.currentTimeMillis();
		System.out.println("Tempo gasto para a sequência de fibonacci recursivo sem array: " + (fim - inicio));
		
		inicio = System.currentTimeMillis();
		for(int i = 1; i <= limite; i++){
			int resultado = fibonacci.calculaFibonacciRecursivoComArray(i);
			System.out.println(resultado);
		}
		fim = System.currentTimeMillis();
		System.out.println("Tempo gasto para a sequência de fibonacci recursivo com array: " + (fim - inicio));
		
		inicio = System.currentTimeMillis();
		for(int i = 1; i <= limite; i++){
			int resultado = fibonacci.calculaFibonacciIterativo(i);
			System.out.println(resultado);
		}
		fim = System.currentTimeMillis();
		System.out.println("Tempo gasto para a sequência de fibonacci iterativo: " + (fim - inicio));
	}
	
	int calculaFibonacciRecursivoSemArray(int indice){
		return (indice == 1) ? 0: (indice == 2) ? 1 : calculaFibonacciRecursivoSemArray(indice - 1) + calculaFibonacciRecursivoSemArray(indice - 2);
	}
	
	int calculaFibonacciRecursivoComArray(int indice){
		this.valores[0] = 0;
		this.valores[1] = 1;
		
		if(indice >= this.valores.length){
			aumentaEspaco();
		}
		
		if(indice == 0 || indice == 1){
			return this.valores[indice];
		} else{
			this.valores[indice] = this.valores[indice - 1] + this.valores[indice - 2];
			return this.valores[indice];
		}
	}
	
	void aumentaEspaco(){
		int[] temp = new int[valores.length * 2];
		for(int i = 0; i < valores.length; i++){
			temp[i] = valores[i];
		}
		valores = temp;
	}
	
	int calculaFibonacciIterativo(int indice){
		if(indice == 1){
			return 0;
		} else if(indice == 2){
			return 1;
		} else {
			int primeiro = 0;
			int segundo = 1;
			int valor = primeiro + segundo;
			int i = 2;
			do{
				valor = primeiro + segundo;
				primeiro = segundo;
				segundo = valor;
				i++;
			}while(i < indice);
			return valor;
		}
		
	}
	
}