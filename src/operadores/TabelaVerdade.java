package operadores;

@SuppressWarnings("all")
public class TabelaVerdade {
    public static void main(String[] args) {
        // Tabela verdade
        boolean a = true;
        boolean b = false;

        System.out.println("Tabela verdade AND");
        System.out.println(a && a); // true
        System.out.println(a && b); // false
        System.out.println(b && a); // false
        System.out.println(b && b); // false
        System.out.println("=========================");
        System.out.println("Tabela verdade OR");
        System.out.println(a || a); // true
        System.out.println(a || b); // true
        System.out.println(b || a); // true
        System.out.println(b || b); // false
        System.out.println("=========================");
        System.out.println("Tabela do XOR");
        System.out.println(a ^ a); // false
        System.out.println(a ^ b); // true
        System.out.println(b ^ a); // true
        System.out.println(b ^ b); // false
        System.out.println("=========================");
        System.out.println("Tabela verdade NOT");
        System.out.println(!a); // false
        System.out.println(!b); // true
    }
}
