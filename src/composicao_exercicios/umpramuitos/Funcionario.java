package composicao_exercicios.umpramuitos;

@SuppressWarnings("all")
public class Funcionario {
    private String matricula;
    private String nome;

    public Funcionario(String matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }
}
