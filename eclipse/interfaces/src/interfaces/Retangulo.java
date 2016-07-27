package interfaces;

public class Retangulo implements AreaCalculavel {

	private double largura;
	private double altura;

	public Retangulo(int largura, int altura) {
		super();
		this.largura = largura;
		this.altura = altura;
	}

	@Override
	public double calculaArea() {
		return this.largura * this.altura;
	}

}
