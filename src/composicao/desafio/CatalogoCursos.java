package composicao.desafio;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("all")
public class CatalogoCursos {
    private List<Curso> cursos;

    public CatalogoCursos() {
        this.cursos = new ArrayList<>();
        inicializarCursos();
    }

    private void inicializarCursos() {
        // Curso de React
        Curso react = new Curso("React - Desenvolvimento Web Avançado");
        Modulo fundamentosReact = new Modulo("Fundamentos do React");
        fundamentosReact.aulas.add(new Aula("Introdução ao React", 1800)); // 30 min
        fundamentosReact.aulas.add(new Aula("Componentes e Props", 2700)); // 45 min
        react.modulos.add(fundamentosReact);
        
        Modulo hooks = new Modulo("Hooks Avançados");
        hooks.aulas.add(new Aula("useState e useEffect", 3600)); // 60 min
        hooks.aulas.add(new Aula("useContext e useReducer", 3600)); // 60 min
        react.modulos.add(hooks);

        // Curso de JavaScript
        Curso javascript = new Curso("JavaScript Moderno");
        Modulo jsBasico = new Modulo("JavaScript Básico");
        jsBasico.aulas.add(new Aula("Sintaxe e Variáveis", 1800)); // 30 min
        jsBasico.aulas.add(new Aula("Funções e Escopo", 2700)); // 45 min
        javascript.modulos.add(jsBasico);
        
        Modulo jsAvancado = new Modulo("JavaScript Avançado");
        jsAvancado.aulas.add(new Aula("Async/Await", 3600)); // 60 min
        jsAvancado.aulas.add(new Aula("ES6+ Features", 3600)); // 60 min
        javascript.modulos.add(jsAvancado);

        // Curso de Java Essencial
        Curso java = new Curso("Java Essencial");
        Modulo javaBasico = new Modulo("Java Básico");
        javaBasico.aulas.add(new Aula("Introdução ao Java", 1800)); // 30 min
        javaBasico.aulas.add(new Aula("Estruturas de Controle", 2700)); // 45 min
        java.modulos.add(javaBasico);
        
        Modulo oop = new Modulo("Programação Orientada a Objetos");
        oop.aulas.add(new Aula("Classes e Objetos", 3600)); // 60 min
        oop.aulas.add(new Aula("Herança e Polimorfismo", 3600)); // 60 min
        java.modulos.add(oop);

        // Adiciona os cursos ao catálogo
        cursos.add(react);
        cursos.add(javascript);
        cursos.add(java);
    }

    public List<Curso> listarCursos() {
        System.out.println("=== Catálogo de Cursos ===");
        for (Curso curso : cursos) {
            System.out.printf("Curso: %s | Duração Total: %d segundos%n", 
                curso.nome, curso.getDuracaoTotal());
        }
        return this.cursos;
    }

    public static void main(String[] args) {
        CatalogoCursos catalogo = new CatalogoCursos();
        catalogo.listarCursos();
    }
}
