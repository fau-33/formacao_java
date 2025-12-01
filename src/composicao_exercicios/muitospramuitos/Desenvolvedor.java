package composicao_exercicios.muitospramuitos;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("all")
public class Desenvolvedor {
    private String codigo;
    private String nome;
    private List<Alocacao> alocacoes = new ArrayList<>();

    public Desenvolvedor(String codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public void adicionarAlocacao(Alocacao alocacao) {
        this.alocacoes.add(alocacao);
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Desenvolvedor{")
          .append("codigo='").append(codigo).append('\'')
          .append(", nome='").append(nome).append('\'')
          .append(", alocacoes=[");
        
        for (int i = 0; i < alocacoes.size(); i++) {
            Alocacao a = alocacoes.get(i);
            sb.append("{")
              .append("projeto=").append(a.getProjeto().getNome())
              .append(", cargaHoraria=").append(a.getCargaHoraria())
              .append("h}");
            
            if (i < alocacoes.size() - 1) {
                sb.append(", ");
            }
        }
        
        sb.append("]}");
        return sb.toString();
    }
}
