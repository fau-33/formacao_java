package composicao_exercicios.muitospramuitos;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("all")
public class Projeto {
    private String matricula;
    private String nome;
    private List<Alocacao> alocacoes = new ArrayList<>();

    public Projeto(String matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public void adicionarAlocacao(Alocacao alocacao) {
        this.alocacoes.add(alocacao);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Projeto{")
          .append("matricula='").append(matricula).append('\'')
          .append(", nome='").append(nome).append('\'')
          .append(", desenvolvedores=[");
        
        for (int i = 0; i < alocacoes.size(); i++) {
            Alocacao a = alocacoes.get(i);
            sb.append("{")
              .append("desenvolvedor=").append(a.getDesenvolvedor().getNome())
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
