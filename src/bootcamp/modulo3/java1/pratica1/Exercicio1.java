package bootcamp.modulo3.java1.pratica1;

import java.util.Scanner;

class Exercicio1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Digite a quantidade de números pares: ");
        n = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0)
                System.out.println(i);
        }
    }
}