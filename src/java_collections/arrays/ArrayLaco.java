package java_collections.arrays;

import java.util.Arrays;

public class ArrayLaco {
    public static void main(String[] args) {

        double[] notas = {7.5, 8.0, 6.5, 9.0, 10.0};

        for(double nota : notas) {
            System.out.println(nota);
        }

        System.out.println(Arrays.toString(notas));
    }

}
