package condicionais;

import java.util.Scanner;

@SuppressWarnings("all")
public class If {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe a média final do aluno: ");
        double media = Double.parseDouble(teclado.nextLine().replace(",", "."));

        if(media > 10) {
            System.exit(1);

        }

        if(media <= 10 && media >= 7) {
            System.out.println("O aluno foi aprovado!");
        }

        if(media < 7 && media >= 4.5) {
            System.out.println("O aluno está em recuperação!");
        }

        boolean criterioReprovado = media < 4.5 && media >= 0;
        if(criterioReprovado) {
            System.out.println("O aluno foi reprovado!");
        }

        System.out.println("Fim ");


        teclado.close();
    }
}
