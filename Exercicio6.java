class Exercicio6{
	public static void main(String[] args){
		int primeiro = 0;
		int segundo = 1;
		int valor = primeiro + segundo;
		System.out.println(primeiro);
		System.out.println(segundo);
		do{
			System.out.println(valor);
			valor = primeiro + segundo;
			primeiro = segundo;
			segundo = valor;		
		}while(valor <= 100);
	}
}
