package classes_metodos.basico.desafio_modulo;

import java.util.Scanner;

public class Rodizio {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Pessoa maria = new Pessoa("Maria", 67);
        Pessoa mario = new Pessoa("Mario", 92);

        System.out.printf("Maria está com peso de %.2f kg\n", maria.peso);
        System.out.printf("Mario está com peso de %.2f kg\n", mario.peso);

        int opcao = 0;


        while (opcao != 2) {
            System.out.print("\n\nMenu\n=========\n1) Rodada de comida\n2) Sair\n\n Escolha uma opção: ");
            opcao = teclado.nextInt();
            teclado.nextLine();

            if (opcao == 1) {
                System.out.print("Informe o nome da comida: ");
                String nomeComida = teclado.nextLine();


                System.out.print("Informe o peso da comida: ");
                double pesoComida = teclado.nextDouble();
                teclado.nextLine();

                Comida novaComida = new Comida(nomeComida, pesoComida);

                maria.comer(novaComida);
                mario.comer(novaComida);

            }
        }

        System.out.printf("Maria está com peso de %.2f kg\n", maria.peso);
        System.out.printf("Mario está com peso de %.2f kg\n", mario.peso);

        teclado.close();

    }
}
