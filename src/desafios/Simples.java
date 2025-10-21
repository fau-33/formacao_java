package desafios;

public class Simples {
    int a = 10;
    static int b = 12;

    public static void main(String[] args) {
        // Imprimir o valor da variável a
        // Cria um objeto da classe
        Simples obj = new Simples();
        obj.a = 100;

        System.out.println(new Simples().a);
        System.out.println(obj.a);

        System.out.println(b);
        System.out.println(Simples.b);

    }
}
