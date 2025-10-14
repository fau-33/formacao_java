package operadores;

import java.util.Scanner;

@SuppressWarnings("all")
public class Logicos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Trabalho na Terça ? (sim/não)");
        String valorTerca = teclado.nextLine();
        boolean resultadoTerca = valorTerca.equalsIgnoreCase("sim");

        System.out.print("Trabalho na Quinta ? (sim/não)");
        String valorQuinta = teclado.nextLine();
        boolean resultadoQuinta = valorQuinta.equalsIgnoreCase("sim");

        boolean comprarTV65 = resultadoTerca && resultadoQuinta;
        boolean comprarTV32 = resultadoTerca ^ resultadoQuinta; // Equivalente !=
        boolean comprarSorvete = resultadoTerca || resultadoQuinta;
        boolean ficarEmCasa = !comprarSorvete;

        System.out.printf("Comprar TV32: %b %nComprar TV65: %b %nComprar Sorvete: %b %nficar em casa: %b ", comprarTV65, comprarTV32, comprarSorvete, ficarEmCasa);

        teclado.close();

    }
}
