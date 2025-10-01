package fundamentos;

public class ObjetoVsPrimitivos {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a);
        // boolean, char, byte, short, int, long, float, double
        // Boolean, Character, Byte, Short, Integer, Long, Float, Double
        String b = "Texto";
        System.out.println(b.toUpperCase());

        // wrapper
        Integer c = 1234;
        System.out.println(c.doubleValue());

        double d1 = 1234;
        System.out.println("O valor de d1: " + d1);

        Double d = 1234.56;
        System.out.println(d.intValue());
    }
}
