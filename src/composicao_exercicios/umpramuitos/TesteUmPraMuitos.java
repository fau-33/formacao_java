package composicao_exercicios.umpramuitos;

public class TesteUmPraMuitos {
    public static void main(String[] args) {
        Departamento departamento = new Departamento("Departamento de Vendas");
        Funcionario funcionario1 = new Funcionario("12345", "João Silva");
        Funcionario funcionario2 = new Funcionario("67890", "Maria Oliveira");
        departamento.adicionarFuncionario(funcionario1);
        departamento.adicionarFuncionario(funcionario2);
        departamento.exibirQuadroDeFuncionarios();

        Departamento departamento2 = new Departamento("Departamento de Marketing");
        Funcionario funcionario3 = new Funcionario("54321", "Carlos Pereira");
        Funcionario funcionario4 = new Funcionario("98765", "Ana Santos");
        departamento2.adicionarFuncionario(funcionario3);
        departamento2.adicionarFuncionario(funcionario4);
        departamento2.exibirQuadroDeFuncionarios();
    }
}
