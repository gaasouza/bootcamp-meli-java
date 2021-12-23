package bootcamp.modulo3.java3.pratica1;

public class Programa {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa("José", "12345678909");
		Pessoa p2 = new Pessoa("Roberto", "12345678909");
		Pessoa p3 = new Pessoa("Carlos", "12345678909");
		Pessoa p4 = new Pessoa("Gabriel Souza", "12345678909");
		Pessoa p5 = new Pessoa("Gabriel Amurim", "12345678909");
		Pessoa p6 = new Pessoa("Diego", "12345678909");
		Pessoa p7 = new Pessoa("Rodrigo", "12345678909");
		Pessoa p8 = new Pessoa("Thiago", "12345678909");
		Pessoa p9 = new Pessoa("Gustavo", "12345678909");

		Pessoa arrP[] = { p1, p2, p3, p4, p5, p6, p7, p8, p9 };

		SortUtil.sort(arrP);
		printArray(arrP);

		Celular c1 = new Celular(p1.getNome(), "+55 016 98761-5432");
		Celular c2 = new Celular(p2.getNome(), "+55 011 98762-5432");
		Celular c3 = new Celular(p3.getNome(), "+55 018 98764-5432");
		Celular c4 = new Celular(p4.getNome(), "+55 013 98764-5432");
		Celular c5 = new Celular(p5.getNome(), "+55 017 98766-5432");
		Celular c6 = new Celular(p6.getNome(), "+55 012 98768-5432");
		Celular c7 = new Celular(p7.getNome(), "+55 014 98769-5432");
		Celular c8 = new Celular(p8.getNome(), "+55 015 98765-0432");

		Celular arrC[] = { c1, c2, c3, c4, c5, c6, c7, c8 };

		SortUtil.sort(arrC);
		printArray(arrC);

	}

	private static <T> void printArray(Precedente<T> arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("");
	}
}