package bootcamp.modulo3.java1.pratica2;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Produto array[] = new Produto[3];

        for (int i = 0; i < array.length; i++) {
            Produto produto = new Produto();
            produto.setId(i);

            System.out.print("Digite o NOME do Produto: ");
            produto.setNome(sc.next());

            System.out.print("Digite o PRECO do Produto: ");
            produto.setValor(sc.nextDouble());

            System.out.print("Digite a quantidade de Produtos: ");
            produto.setQuantidade(sc.nextInt());

            System.out.println("");
            sc.nextLine();

            array[i] = produto;
        }

        Arrays.stream(array).forEach(System.out::println);

        double valorTotal = 0;
        for (Produto p : array) {
            valorTotal = valorTotal + (p.getValor() * p.getQuantidade());
        }
        System.out.println("Valor total: R$" + valorTotal);
    }
}
