package desafios;

import java.util.Scanner;

@SuppressWarnings("all")
public class NumeroSecretoCompV1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Adivinhe o número secreto (0 a 999): ");
        int secreto = teclado.nextInt();

        int chute = -1;
        int qtdeTentativas = 0;

        while (secreto != chute && qtdeTentativas < 1_000_000) {
            chute = (int)(Math.random() * 1000);
            qtdeTentativas++;
        }

        if (secreto == chute) {
            System.out.printf("O número secreto é %d e demorou %d tentativas", chute, qtdeTentativas);
        } else {
            System.out.printf("Tente %d vezes e não encontrei o número ", qtdeTentativas);
        }




        teclado.close();
    }
}
