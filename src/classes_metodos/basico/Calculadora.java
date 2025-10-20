package classes_metodos.basico;

public class Calculadora {

    double memoria = 0;

    int somar(int a, int b) {
        int resulado = a + b;
        memoria = resulado;
        return resulado;
    }

    double somar(double a, double b) {
        double resulado = a + b;
        memoria = resulado;
        return resulado;
    }

    double somar(double x) {
        double resulado = x + memoria;
        memoria = resulado;
        return resulado;
    }

    double memoriaAoQuadrado() {
        double resultado = Math.pow(memoria, 2);
        memoria = resultado;
        return resultado;
    }

    void limparMemoria() {
        memoria = 0;
    }
}
