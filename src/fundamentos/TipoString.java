package fundamentos;

@SuppressWarnings("all")
public class TipoString {
    public static void main(String[] args) {

        final String texto = "Boa tarde";

        System.out.println(texto.concat("!!!"));
        System.out.println(texto.startsWith("boa"));
        System.out.println(texto.toLowerCase().startsWith("boa"));
        System.out.println(texto.equals("boa tarde"));
        System.out.println(texto.equalsIgnoreCase("boa tarde"));
        System.out.println(texto.length());

        String nome = "Flávio";
        String sobrenome = "Felix";
        int idade = 34;
        double salario = 1234.56;

        System.out.println("Nome: " + nome + "\nIdade: " + idade + "\nSalário: " + salario);

        String frase = String.format("O senhor %s %s tem %d anos e ganha %.2f ", nome, sobrenome, idade, salario);
        System.out.println(frase);
    }
}
