package composicao_exercicios.umpraum_2;

@SuppressWarnings("all")
public class Funcionario {
    private String nome;
    private String cargo;
    private CrachaDeAcesso cracha;

    public Funcionario(String nome, String cargo, String numeroIdentificacao, String nivelPermissao) {
        this.nome = nome;
        this.cargo = cargo;
        this.cracha = new CrachaDeAcesso(numeroIdentificacao, nivelPermissao);
    }

    public void apresentarDadosCompletos() {
        System.out.println("-------- Dados do Funcionario --------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Cargo: " + this.cargo);
        System.out.println("Cracha: " + this.cracha.getNumeroIdentificacao() + " - " + this.cracha.getNivelPermissao());
        System.out.println("------------------------------------");
    }
}
