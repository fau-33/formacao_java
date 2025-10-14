package operadores;

import java.util.Scanner;

@SuppressWarnings("all")
public class IgualdadeEntreStrings {
    public static void main(String[] args) {
        System.out.println("olá"== "olá");
        System.out.println("olá" == new String("olá"));
        System.out.println("olá".equals(new String("olá")));

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String texto = teclado.nextLine();
        System.out.println(texto == "olá");
        System.out.println("olá".equals("olá"));

        teclado.close();

    }
}
