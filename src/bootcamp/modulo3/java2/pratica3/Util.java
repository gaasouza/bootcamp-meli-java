package bootcamp.modulo3.java2.pratica3;

public class Util {

	public static double areaMedia(FiguraGeometrica arr[]) {
		double total = 0;

		for (FiguraGeometrica figuraGeometrica : arr) {
			total += figuraGeometrica.area();
		}
		return total / arr.length;
	}
}