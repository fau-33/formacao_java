package composicao.desafio;

public class TesteEAD {
    public static void main(String[] args) {
        // Cria um novo catálogo de cursos
        CatalogoCursos catalogo = new CatalogoCursos();
        
        // Lista todos os cursos primeiro
        catalogo.listarCursos();
        
        // Pega o primeiro curso da lista
        Curso primeiroCurso = catalogo.listarCursos().get(0);

        Aluno aluno = new Aluno("João", "joao@gmail.com");

        // Relacionamento bidirecional
        InscricaoCurso novaInscricao = new InscricaoCurso(aluno, primeiroCurso);
        aluno.inscricoes.add(novaInscricao);

        novaInscricao.progressos.add(new ProgressoAula(primeiroCurso.modulos.get(0).aulas.get(0), true));
        novaInscricao.progressos.add(new ProgressoAula(primeiroCurso.modulos.get(0).aulas.get(1), true));
        novaInscricao.progressos.add(new ProgressoAula(primeiroCurso.modulos.get(1).aulas.get(0), true));
        novaInscricao.progressos.add(new ProgressoAula(primeiroCurso.modulos.get(1).aulas.get(1), true));

        System.out.println(novaInscricao.progressos.size());

        
        // System.out.println("\nDetalhes do primeiro curso:");
        //System.out.println(primeiroCurso);
        //System.out.println("Duração total em segundos: " + primeiroCurso.getDuracaoTotal());
    }
}
