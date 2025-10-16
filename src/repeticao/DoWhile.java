package repeticao;

import java.util.Scanner;

@SuppressWarnings("all")
public class DoWhile {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String comando = "";

        do {
            System.out.print("Informe o comando ou sair: ");
            comando = teclado.nextLine();
            System.out.println("Comando " + comando);
        } while (!comando.equals("sair"));

        System.out.println("Fim!");

        teclado.close();
    }
}
