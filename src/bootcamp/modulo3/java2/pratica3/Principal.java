package bootcamp.modulo3.java2.pratica3;

public class Principal {
	public static void main(String[] args) {

		Circulo circulo = new Circulo();
		circulo.setRaio(100);
		System.out.println("O Raio do Circulo eh: " + circulo.getRaio());
		System.out.println("A Area do Circulo eh: " + String.format("%.2f", circulo.area()));
		System.out.println("");

		Retangulo retangulo = new Retangulo();
		retangulo.setBase(150);
		retangulo.setAltura(200);
		System.out.println("A Base do Retangulo eh: " + retangulo.getBase());
		System.out.println("A Altura do Retangulo eh: " + retangulo.getAltura());
		System.out.println("A Area do Retangulo eh: " + String.format("%.2f", retangulo.area()));
		System.out.println("");

		Triangulo triangulo = new Triangulo();
		triangulo.setBase(200);
		triangulo.setAltura(100);
		System.out.println("A Base do Triangulo eh: " + triangulo.getBase());
		System.out.println("A Altura do Triangulo eh: " + triangulo.getAltura());
		System.out.println("A Area do Triangulo eh: " + String.format("%.2f", triangulo.area()));
		System.out.println("");

		FiguraGeometrica figurasGeometricas[] = { circulo, retangulo, triangulo };

		double areaMedia = Util.areaMedia(figurasGeometricas);
		System.out.println(String.format("%.2f", areaMedia));

	}
}