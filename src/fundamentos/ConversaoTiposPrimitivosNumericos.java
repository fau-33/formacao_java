package fundamentos;

public class ConversaoTiposPrimitivosNumericos {
    public static void main(String[] args) {
        double a = 1; // Conversão implícita
        System.out.println(a);

        int b = (int) 1.0; // Conversão explícita (CAST)
        System.out.println(b);

        long c = 1234565;
        byte d = (byte) c;
        System.out.println(d);
    }
}
