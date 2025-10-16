package repeticao;

import java.util.Scanner;

@SuppressWarnings("all")
public class WhileIndeterminado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String comando = "";

        while (!comando.equals("sair")) {
            System.out.print("Informe o comando ou sair: ");
            comando = teclado.nextLine();
            System.out.println("Comando " + comando);
        }

        System.out.println("Fim!");

        teclado.close();
    }
}
