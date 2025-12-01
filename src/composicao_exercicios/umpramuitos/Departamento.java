package composicao_exercicios.umpramuitos;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("all")
public class Departamento {
    private String nome;
    private List<Funcionario> funcionarios = new ArrayList<>();

    public Departamento(String nome) {
        this.nome = nome;
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void exibirQuadroDeFuncionarios() {
        System.out.println("\n--- Quadro de Funcionários ---");
        System.out.println("Departamento: " + nome);
        System.out.println("Funcionários:");
        for (Funcionario funcionario : funcionarios) {
            // CORREÇÃO: Acessando tanto o nome quanto a matrícula usando os getters
            System.out.println("- Matrícula: " + funcionario.getMatricula() + " | Nome: " + funcionario.getNome());
        }
        System.out.println("------------------------------------");
    }
}
