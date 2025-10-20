package classes_metodos.basico;

public class CalculadoraTeste {
    public static void main(String[] args) {

        Calculadora calc = new Calculadora();
        double r = calc.somar(10, 20.0);
        System.out.println(r);
        System.out.println(calc.memoria);

        calc.limparMemoria();

        r = calc.somar(100);
        System.out.println(r);
        System.out.println(calc.memoria);

        r = calc.memoriaAoQuadrado();
        System.out.println(r);
        System.out.println(calc.memoria);
    }
}
