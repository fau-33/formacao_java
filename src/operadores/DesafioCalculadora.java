package operadores;

import java.util.Scanner;
@SuppressWarnings("all")
public class DesafioCalculadora {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        String valor1 = teclado.nextLine().replace(",", ".");
        double numero1 = Double.parseDouble(valor1);

        System.out.print("Digite o segundo número: ");
        String valor2 = teclado.nextLine().replace(",", ".");
        double numero2 = Double.parseDouble(valor2);

        System.out.print("Escolha a operação (+, -, *, /, %): ");
        String operacao = teclado.next();
        
        // Calcula o resultado com base na operação
        double resultado = 
            operacao.equals("+") ? numero1 + numero2 :
            operacao.equals("-") ? numero1 - numero2 :
            operacao.equals("*") ? numero1 * numero2 :
            operacao.equals("%") ? numero1 % numero2 :
            operacao.equals("/") ? numero1 / numero2 : 0;
        
        System.out.printf("Resultado: %.2f %s %.2f = %.2f\n", 
            numero1, operacao, numero2, resultado);

        teclado.close();
    }
}
