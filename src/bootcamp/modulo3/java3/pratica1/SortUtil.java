package bootcamp.modulo3.java3.pratica1;

public class SortUtil {

	public static <T> void sort(Precedente<T> arr[]) {
		int n = arr.length;

		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)

				if (arr[j].precedeA((T) arr[j + 1]) > 1) {

					Precedente<T> temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
	}
}

// 7. Discussão: O método de classificação pode classificar uma matriz de qualquer tipo de dados?
// O método classifica os dados com base no parametro Interface Genérica 'Precedente<T>', ultizando seu método 'public int precedeA(T t);'
// Assim, sempre que uma classe assinada implementar esta interface, o método classificatório poderá order o array.