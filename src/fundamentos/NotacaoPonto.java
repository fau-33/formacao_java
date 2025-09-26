package fundamentos;

import java.util.Locale;

public class NotacaoPonto {
    public static void main(String[] args) {
        String texto = "Boa tarde, X";
        texto = texto.replace("X", "Flávio !");
        texto = texto.toUpperCase();
        System.out.println(texto);

        String nome = "LEANDRO FELIX".toLowerCase(Locale.ROOT).replace("N", "G");
        System.out.println(nome);
    }
}
