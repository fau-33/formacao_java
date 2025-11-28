package composicao_exercicios.umpraum_2;

@SuppressWarnings("all")
public class CrachaDeAcesso {
    private String numeroIdentificacao;
    private String nivelPermissao;

    public CrachaDeAcesso(String numeroIdentificacao, String nivelPermissao) {
        this.numeroIdentificacao = numeroIdentificacao;
        this.nivelPermissao = nivelPermissao;
    }

    public String getNumeroIdentificacao() {
        return numeroIdentificacao;
    }

    public String getNivelPermissao() {
        return nivelPermissao;
    }
}
