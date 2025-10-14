package operadores;

@SuppressWarnings("all")
public class Relacionais {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        System.out.println(a > b);
        System.out.println(a < b);

        System.out.println(a >= b);
        System.out.println(a <= b);
        System.out.println(a <= 7);

        System.out.println(a == 7);
        System.out.println(a == b);

        System.out.println(a != 7);
        System.out.println(a != b);

        System.out.println(7 == '7'); // Conseodera o tipo
    }
}
