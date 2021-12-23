package bootcamp.modulo3.java1.pratica1;

import java.util.Scanner;

class Exercicio2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n, m;

        System.out.print("Digite a quantidade de números multiplos: ");
        n = sc.nextInt();

        System.out.print("Digite o valor ao qual deseja descobrir os multiplos: ");
        m = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            System.out.println(m * i);
        }
    }
}