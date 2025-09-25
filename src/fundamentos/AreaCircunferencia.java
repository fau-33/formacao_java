package fundamentos;

public class AreaCircunferencia {
    public static void main(String[] args) {
        // raio com valor 10
        double raio = 10.05;
        // PI com valor 3.1415 (constante)
        final double PI = 3.1415;
        // AREA = PI * raio * raio
        double raioQuadrado = Math.pow(raio, 2);
        double area = PI * raioQuadrado;
        // Exibir a area
        System.out.println("A Area da circunferência é:  " + area + "m²");
    }
}
