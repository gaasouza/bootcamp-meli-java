package bootcamp.modulo3.java1.pratica1;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m, d;
        int quantDigitos;
        int totalNumeros = 0;

        System.out.print("Digite a quantidade de numeros naturais: ");
        n = sc.nextInt();

        System.out.print("Digite a quantidade de digitos a serem descobertos: ");
        m = sc.nextInt();

        System.out.print("Digite o digito a ser descoberto: ");
        d = sc.nextInt();

        for (int i = 0; totalNumeros < n; i++) {
            String numero = String.valueOf(i);
            quantDigitos = 0;

            for (int j = 0; j < numero.length(); j++) {
                if (Character.toString(numero.charAt(j)).equals(String.valueOf(d)))
                    quantDigitos++;

                if (quantDigitos == m) {
                    System.out.println(numero);
                    totalNumeros++;
                    break;
                }
            }
        }
    }
}
