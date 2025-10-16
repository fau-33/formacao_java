package repeticao;

@SuppressWarnings("all")
public class WhileDeterminado {
    public static void main(String[] args) {
        // 1.Criar uma variável de controle (contador)
        int i = 1;
        // 2.Expressão que vai usar a variável de controle
        while (i <= 10) {
            System.out.println(i);
            // 3.Modificar a variável de controle
            i++;
        }
        System.out.println("Fim!");

    }
}
