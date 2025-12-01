package composicao.desafio;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class InscricaoCurso {
    UUID id;
    Aluno aluno;
    Curso curso;
    final List<ProgressoAula> progressos = new ArrayList<>();

    public InscricaoCurso(Aluno aluno, Curso curso) {
        this(UUID.randomUUID(), aluno, curso);
    }

    public InscricaoCurso(UUID id, Aluno aluno, Curso curso) {
        this.id = id;
        this.aluno = aluno;
        this.curso = curso;
    }

}
