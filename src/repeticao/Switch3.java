package repeticao;

import java.util.Scanner;

@SuppressWarnings("all")
public class Switch3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o dia da semana: ");
        String diaDaSemana = teclado.nextLine();

        switch (diaDaSemana) {
            case "segunda" -> System.out.println("Inicio da semana");
            case "terca" -> System.out.println("Dia de trabalho");
            case "quarta" -> System.out.println("Dia de trabalho");
            case "quinta" -> System.out.println("Dia de trabalho");
            case "sexta" -> System.out.println("Sextou !!!");
            case "sabado" -> System.out.println("Beber verdinhas");
            case "domingo" -> System.out.println("Ir pra praia");
            default -> System.out.println("Dia invalido");
        }

        teclado.close();
    }
}
