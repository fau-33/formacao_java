package classes_metodos.basico;

public class Classe {
    String nome;
    static int status = 3;

    void teste() {
        System.out.printf("%s %d\n", nome, status);
    }

    static void xyz () {
        System.out.printf("Status: %d\n", status);
    }
}
