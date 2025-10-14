package operadores;

import java.util.Scanner;

@SuppressWarnings("all")
public class Ternario {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a média do aluno ? ");
        String valorNota = teclado.nextLine().replace(",", ".");
        double nota = Double.parseDouble(valorNota);

        System.out.print("O aluno tem bom comportamento ? (sim/não)");
        String valorComportamento = teclado.nextLine();
        boolean bomComportamento = valorComportamento.equalsIgnoreCase("sim");

        // Uso do operador ternário
        // (expressão) ? true : false
        String resultadoEscolar = nota >= 7 ? "Aprovado" : "Em recuperação";
        double valorDesconto = nota >= 9 && bomComportamento ? 0.35 : 0.15;

        System.out.printf("Resutado: %s %nDesconto: %.1f%%", resultadoEscolar, valorDesconto);

        teclado.close();
    }
}
