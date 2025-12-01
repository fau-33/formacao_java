package composicao_exercicios.muitospramuitos;

@SuppressWarnings("all")
public class Alocacao {
    private int cargaHoraria;
    private Projeto projeto;
    private Desenvolvedor desenvolvedor;

    public Alocacao(int cargaHoraria, Projeto projeto, Desenvolvedor desenvolvedor) {
        this.cargaHoraria = cargaHoraria;
        this.projeto = projeto;
        this.desenvolvedor = desenvolvedor;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public Projeto getProjeto() {
        return projeto;
    }

    public Desenvolvedor getDesenvolvedor() {
        return desenvolvedor;
    }

    @Override
    public String toString() {
        return "Alocacao{" +
                "cargaHoraria=" + cargaHoraria +
                ", projeto=" + projeto +
                ", desenvolvedor=" + desenvolvedor +
                '}';
    }
}
