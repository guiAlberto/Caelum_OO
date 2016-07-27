package interfaces;

public class Circulo implements AreaCalculavel {

	private double raio;
	
	@Override
	public double calculaArea() {
		return Math.PI * Math.pow(this.raio, 2);
	}

	public Circulo(double raio) {
		super();
		this.raio = raio;
	}

}
