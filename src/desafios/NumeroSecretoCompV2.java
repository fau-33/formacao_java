package desafios;

import java.util.Scanner;

@SuppressWarnings("all")
public class NumeroSecretoCompV2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int minimo = 0;
        int maximo = 10000;

        System.out.printf("Adivinhe o número secreto (%d-%d): ", minimo, maximo - 1);
        int secreto = teclado.nextInt();

        int chute = -1;
        int qtdeTentativas = 0;



        while (secreto != chute && qtdeTentativas < 1_000_000) {
            chute = (maximo - minimo) / 2 + minimo;
            qtdeTentativas++;

            if (secreto > chute) {
                minimo = chute;
            } else if(secreto < chute) {
                maximo = chute;
            }
        }

        if (secreto == chute) {
            System.out.printf("O número secreto é %d e demorou %d tentativas", chute, qtdeTentativas);
        } else {
            System.out.printf("Tente %d vezes e não encontrei o número ", qtdeTentativas);
        }




        teclado.close();
    }
}
