package java_collections.arrays;

import java.util.Scanner;

public class DesafioArray {
    public static void main(String[] args) {
        // Faça um programa que receba a quantidade de alunos e suas notas
        Scanner teclado = new Scanner(System.in);

        System.out.print("Quantos alunos? ");
        int quantidadeAlunos = teclado.nextInt();

        double[] notas = new double[quantidadeAlunos];


        for(int i = 0; i < notas.length; i++) {
            System.out.print("Nota do aluno " + (i + 1) + ": ");
            notas[i] = teclado.nextDouble();
        }

        double soma = 0;
        for(double nota : notas) {
            soma += nota;
        }
        System.out.printf("A média da turma é %.1f", soma / notas.length);

        teclado.close();


    }
}
