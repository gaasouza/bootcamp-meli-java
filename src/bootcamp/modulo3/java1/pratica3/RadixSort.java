package bootcamp.modulo3.java1.pratica3;

public class RadixSort {
	public static void radixSort(int iArr[]) {

		// Atribuir os valores de int inteirosArray[] para String stringsArray[]
		String sArr[] = new String[iArr.length];

		for (int i = 0; i < iArr.length; i++) {
			sArr[i] = Integer.toString(iArr[i]);
		}

		// Completar stringsArray[] com 0 (zeros) à esquerda (coincidindo com o número
		// de dígitos do maior número de inteirosArray[]).

		/// Verificar qual o maior número da stringsArray[]
		String maiorNumero = sArr[0];
		
		for (int i = 1; i < sArr.length; i++) {
			if (Integer.valueOf(sArr[i]) > Integer.valueOf(maiorNumero))
				maiorNumero = sArr[i];
		}

		/// Preencher com zeros de acordo com a quantidade de digitos do maiorNumero
		int quantidadeDigitosMaiorNumero = maiorNumero.length();

		for (int i = 0; i < sArr.length; i++) {

			if (sArr[i].length() < quantidadeDigitosMaiorNumero) {
					
				int diferencaDeDigitos = quantidadeDigitosMaiorNumero - sArr[i].length();
				for (int j = 0; j < diferencaDeDigitos; j++) {
					sArr[i] = "0".concat(sArr[i]);
				}
			}
		}

		// Criar 10 listas inicialmente vazias
		String arrL[][] = new String[iArr.length][iArr.length];

		// Loop que executa a classificação em todos os digitos dos numeros da stringsArray[]
		for (int i = 1; i <= quantidadeDigitosMaiorNumero; i++) {

			// Percorrer stringsArray[] para cada elemento, verificar qual é o seu último
			// dígito e adicionar à lista L0, L1, L2, ... até L9 correspondente
			for (int j = 0; j < sArr.length; j++) {

				String numero = sArr[j];
				
				char digito = numero.charAt((numero.length() - i));

				switch (digito) {
				case '0':
					arrL[0][j] = numero;
					break;
				case '1':
					arrL[1][j] = numero;
					break;
				case '2':
					arrL[2][j] = numero;
					break;
				case '3':
					arrL[3][j] = numero;
					break;
				case '4':
					arrL[4][j] = numero;
					break;
				case '5':
					arrL[5][j] = numero;
					break;
				case '6':
					arrL[6][j] = numero;
					break;
				case '7':
					arrL[7][j] = numero;
					break;
				case '8':
					arrL[8][j] = numero;
					break;
				case '9':
					arrL[9][j] = numero;
					break;

				}
			}

			// Percorre as listas L's para preencher o stringsArray[] 
			// Sempre que encontrar um valor diferente de null posiciona o valor no stringsArray[] de acordo com a ultima posicao preenchida
			// Limpa os arrays de L's
			int ultimaPosicaoPreenchida = 0;
			
			for (int j = 0; j < sArr.length; j++) {

				for (int k = 0; k < arrL[j].length; k++) {

					if (!(arrL[j][k] == null)) {
						sArr[ultimaPosicaoPreenchida++] = arrL[j][k];
						arrL[j][k] = null;
					}
				}
			}
		}

		// Atribuir os valores de String stringsArray[] para int inteirosArray[]
		for (int i = 0; i < sArr.length; i++) {
			iArr[i] = Integer.parseInt(sArr[i]);
		}
	}

	public static void main(String[] args) {
		int iArr[] = { 16223, 898, 13, 906, 23, 9, 1532, 6388, 2511, 8 };

		radixSort(iArr);

		for (int i : iArr) {
			System.out.print(i + " ");
		}
	}
}
