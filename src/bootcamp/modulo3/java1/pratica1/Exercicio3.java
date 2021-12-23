package bootcamp.modulo3.java1.pratica1;

import java.util.Scanner;

class Exercicio3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Digite um numero para verificar se eh primo ou não: ");
        n = sc.nextInt();

        if (ehPrimo(n))
            System.out.println("O número " + n + " eh primo!");
        else
            System.out.println("O número " + n + " NÃO eh primo!");
    }

    public static boolean ehPrimo(int numero){
        if (numero < 2)
            return false;

        for (int i=2; i < numero; i++){
            if(numero % i == 0)
                return false;
        }
        return true;
    }
}