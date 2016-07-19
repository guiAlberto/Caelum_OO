class Fibonacci{
	
	public static void main(String[] args){
		Fibonacci fibonacci = new Fibonacci();
		int limite = 45;
		long inicio = System.currentTimeMillis();
		for(int i = 1; i <= limite; i++){
			int resultado = fibonacci.calculaFibonacciRecursivo(i);
			System.out.println(resultado);
		}
		long fim = System.currentTimeMillis();
		long tempoGasto = fim - inicio;
		System.out.println("Tempo gasto para a sequência de fibonacci recursivo: " + (fim - inicio));
		
		inicio = System.currentTimeMillis();
		for(int i = 1; i <= limite; i++){
			int resultado = fibonacci.calculaFibonacciIterativo(i);
			System.out.println(resultado);
		}
		fim = System.currentTimeMillis();
		System.out.println("Tempo gasto para a sequência de fibonacci iterativo: " + (fim - inicio));
	}
	
	int calculaFibonacciRecursivo(int indice){
		return (indice == 1) ? 0: (indice == 2) ? 1 : calculaFibonacciRecursivo(indice - 1) + calculaFibonacciRecursivo(indice - 2);
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