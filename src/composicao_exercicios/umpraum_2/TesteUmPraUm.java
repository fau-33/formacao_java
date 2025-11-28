package composicao_exercicios.umpraum_2;

public class TesteUmPraUm {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Pedro", "Gerente", "12345", "Admin");
        f1.apresentarDadosCompletos();

        Funcionario f2 = new Funcionario("Paula", "Secretaria", "67890", "User");
        f2.apresentarDadosCompletos();
    }
}
