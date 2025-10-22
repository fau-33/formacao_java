package java_collections.arrays;

import java.util.Arrays;

public class ArrayBasico {
    public static void main(String[] args) {

        double[] notas = new double[5];

        System.out.println(Arrays.toString(notas));

        notas[0] = 7.5;
        notas[1] = 8.0;
        notas[2] = 6.5;
        notas[3] = 9.0;
        notas[4] = 10.0;
        // notas[5] = 5.0;

        System.out.println(Arrays.toString(notas));

        for(int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
        }
    }
}
