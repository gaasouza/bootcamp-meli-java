package bootcamp.modulo3.java2.pratica3;

public class Circulo extends FiguraGeometrica {

	private double raio;

	public Circulo() {
	}

	public Circulo(double raio) {
		this.raio = raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public double area() {
		return Math.PI * Math.pow(raio, 2);
	}

}