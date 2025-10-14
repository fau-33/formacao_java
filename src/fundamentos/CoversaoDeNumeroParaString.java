package fundamentos;

public class CoversaoDeNumeroParaString {
    public static void main(String[] args) {
        int n1 = 123456;
        double n2 = 7891011;

        String s1 = n1 + "";
        String s2 = n2 + "";

        System.out.println(s1 + " " + s2);

        Integer n3 = 1234;
        System.out.println(n3.toString());

        System.out.println(String.format("Valor de n1: %d", n1));
    }
}
