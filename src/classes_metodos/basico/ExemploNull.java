package classes_metodos.basico;

import java.util.Objects;

@SuppressWarnings("all")
public class ExemploNull {
    public static void main(String[] args) {

        String a = "";
        System.out.println(a.concat("!!!"));

        a = null;
        System.out.println(a);

        if (a != null) {
            System.out.println(a.concat("!!!"));
            System.out.println(a.length());

        }
        System.out.println(Objects.requireNonNullElse(a, "vazio").concat("!!!"));


    }
}
