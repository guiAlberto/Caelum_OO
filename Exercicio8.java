import java.util.Scanner;

class Exercicio8{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Insira um número: ");
		int limite = scanner.nextInt();
		for(int i = 1; i <= limite; i++){
			for(int j = 1; j <= i; j++){
				System.out.print((i * j) + " ");
			}
			System.out.println();
		}
	}
}
