package br.com.empresa.banco;

public class TesteErro {

	public static void main(String[] args) {
		System.out.println("início do main");
		try {
			metodo1();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("erro " + e);
		}
		System.out.println("fim da main");
	}

	private static void metodo1() {
		System.out.println("início do método 1");
		metodo2();
		System.out.println("fim do método 1");
	}

	private static void metodo2() {
		System.out.println("início do método 2");
		int[] array = new int[10];
		for (int i = 0; i <= 15; i++) {
			array[i] = i;
			System.out.println(i);
		}
		System.out.println("fim do método 2");
	}

}
