package interfaces;

public class Quadrado implements AreaCalculavel {

	private double lado;

	public Quadrado(int lado) {
		super();
		this.lado = lado;
	}

	@Override
	public double calculaArea() {
		return this.lado * this.lado;
	}

}
