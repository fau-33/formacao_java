package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro salário: ");
        String salario1Str = entrada.nextLine().replace(",", ".");
        
        System.out.print("Digite o segundo salário: ");
        String salario2Str = entrada.nextLine().replace(",", ".");
        
        System.out.print("Digite o terceiro salário: ");
        String salario3Str = entrada.nextLine().replace(",", ".");

        double salario1 = Double.parseDouble(salario1Str);
        double salario2 = Double.parseDouble(salario2Str);
        double salario3 = Double.parseDouble(salario3Str);

        double soma = salario1 + salario2 + salario3;
        double media = soma / 3;
        
        System.out.println("\nSoma dos salários: R$ " + String.format("%.2f", soma));
        System.out.println("Média dos salários: R$ " + String.format("%.2f", media));
        
        entrada.close();
    }
}
