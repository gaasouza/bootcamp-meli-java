package bootcamp.modulo3.java2.pratica3;

public class Retangulo extends FiguraGeometrica {

	private double base;
	private double altura;

	public Retangulo() {
	}

	public Retangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public double area() {
		return base * altura;
	}

}