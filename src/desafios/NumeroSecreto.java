package desafios;

import java.util.Scanner;

public class NumeroSecreto {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int secreto = (int) (Math.random() * 100);
        int palpite;
        int tentativas = 0;
        final int LIMITE_PROXIMO = 10; // Define a distância para considerar "quente"
        
        System.out.println("Bem-vindo ao jogo de adivinhação!");
        System.out.println("Tente adivinhar o número entre 0 e 100.");
        
        do {
            System.out.print("Digite seu palpite: ");
            palpite = leitor.nextInt();
            tentativas++;
            
            if (palpite < 0 || palpite > 100) {
                System.out.println("Por favor, digite um número entre 0 e 100.");
                continue;
            }
            
            if (palpite == secreto) {
                System.out.printf("\nParabéns! Você acertou em %d tentativas!\n", tentativas);
                System.out.printf("O número secreto era %d!\n", secreto);
                break;
            }
            
            // Verifica se está próximo do número secreto
            int diferenca = Math.abs(palpite - secreto);
            if (diferenca <= LIMITE_PROXIMO) {
                System.out.print("Está quente! " + (palpite < secreto ? "Tente um número maior.\n" : "Tente um número menor.\n"));
            } else if (diferenca > LIMITE_PROXIMO * 2) {
                System.out.println("Está frio! " + (palpite < secreto ? "Tente um número maior." : "Tente um número menor."));
            } else {
                System.out.println(palpite < secreto ? "Tente um número maior." : "Tente um número menor.");
            }
            
        } while (true);
        
        leitor.close();
    }
}
