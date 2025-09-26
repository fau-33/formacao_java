package fundamentos;

import java.util.Scanner;

public class ConsoleEntrada {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = entrada.nextInt();
        entrada.nextLine(); // Limpa o buffer

        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.print("Digite seu sobrenome: ");
        String sobrenome = entrada.nextLine();

        System.out.printf("Nome: %s %s, Idade: %d ", nome, sobrenome, idade);

        entrada.close();
    }
}
