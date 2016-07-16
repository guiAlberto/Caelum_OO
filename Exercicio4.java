class Exercicio4{
	public static void main(String[] args){
		for(int i = 1; i <= 10; i++){
		int fatorial = 1;
		int j = i;
			while(j >= 1){
				fatorial *= j;
				j--;
			}
			System.out.println(i + "! = " + fatorial); 
		}
	}
}
