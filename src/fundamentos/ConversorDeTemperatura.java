package fundamentos;

public class ConversorDeTemperatura {
    public static void main(String[] args) {
        // Fahrenheit para Celsius
        // Variaveis
        double fahrenheit = 100;
        // Formula
        final double celsius = (fahrenheit - 32) * 5 / 9;
        // Exibir
        System.out.println("A temperatura em fahrenheit para celsius: " + fahrenheit + " é " + celsius);
    }
}
