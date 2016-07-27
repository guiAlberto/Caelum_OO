package interfaces;

public class Teste {

	public static void main(String[] args) {
		AreaCalculavel areaCalculavel = new Circulo(5);
		System.out.println(areaCalculavel.calculaArea());
	}

}
