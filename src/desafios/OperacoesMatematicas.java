package desafios;

import java.util.Scanner;

public class OperacoesMatematicas {
    // Desafio #01 - operações matemáticas
    // Fazer um menu com as seguintes opções:
    // 1. Soma
    // 2. Subtração
    // 3. Multiplicação
    // 4. Divisão
    // 5. Sair
    // O usuário vai informar dois números e a opção escolhida e depois a opção 1 e da a resposta
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        double numero1 = teclado.nextDouble();

        System.out.print("Informe o segundo número: ");
        double numero2 = teclado.nextDouble();

        System.out.print("Informe a opção: ");
        int opcao = teclado.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Soma: " + (numero1 + numero2));
                break;
            case 2:
                System.out.println("Subtração: " + (numero1 - numero2));
                break;
            case 3:
                System.out.println("Multiplicação: " + (numero1 * numero2));
                break;
            case 4:
                System.out.println("Divisão: " + (numero1 / numero2));
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }

        System.out.println("Fim!");

        teclado.close();

    }
}
