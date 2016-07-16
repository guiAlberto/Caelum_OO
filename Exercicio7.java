import java.util.Scanner;

class Exercicio7{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Insira um número: ");
		int x = scanner.nextInt();
		
		while(x != 1){
			x = x % 2 == 0 ? x / 2 : 3 * x + 1;
			System.out.print(x != 1 ? x + "->" : x);
		}
		
		System.out.println();
		scanner.close();
	}
}
