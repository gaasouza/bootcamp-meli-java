package bootcamp.modulo3.java1.pratica1;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Digite o numero de valores a serem verificados se sao primos ou não: ");
        n = sc.nextInt();

        for(int i = 2; i <= n; i++){
            if (ehPrimo(i))
                System.out.println(i);
        }
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
