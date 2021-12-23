package bootcamp.modulo3.java1.pratica2;

import java.util.Arrays;
import java.util.Collections;

public class Exercicio1 {
    public static void main(String[] args) {
        Integer[] array = {52, 10, 85, 1324, 01, 13, 62, 30, 12, 127};

        System.out.println("Atual estado da lista: " + Arrays.toString(array));

        Collections.sort(Arrays.asList(array));
        System.out.println("Lista ordenada crescentemente: " + Arrays.toString(array));

        Collections.reverse(Arrays.asList(array));
        System.out.println("Lista ordenada decrescentemente: " + Arrays.toString(array));
    }
}
