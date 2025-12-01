package composicao_exercicios.muitospramuitos;

public class TesteMuitosPraMuitos {
    public static void main(String[] args) {
        // Criando desenvolvedores
        Desenvolvedor d1 = new Desenvolvedor("1", "João");
        Desenvolvedor d2 = new Desenvolvedor("2", "Maria");
        Desenvolvedor d3 = new Desenvolvedor("3", "Pedro");

        // Criando projetos
        Projeto p1 = new Projeto("1", "Sistema de Vendas");
        Projeto p2 = new Projeto("2", "Aplicativo Móvel");
        Projeto p3 = new Projeto("3", "Portal Web");

        // Criando alocações
        Alocacao a1 = new Alocacao(20, p1, d1); // João no Projeto 1 (20h)
        Alocacao a2 = new Alocacao(30, p2, d1); // João no Projeto 2 (30h)
        Alocacao a3 = new Alocacao(40, p1, d2); // Maria no Projeto 1 (40h)
        Alocacao a4 = new Alocacao(20, p3, d2); // Maria no Projeto 3 (20h)
        Alocacao a5 = new Alocacao(30, p2, d3); // Pedro no Projeto 2 (30h)
        Alocacao a6 = new Alocacao(10, p3, d3); // Pedro no Projeto 3 (10h)

        // Adicionando as alocações aos desenvolvedores
        d1.adicionarAlocacao(a1);
        d1.adicionarAlocacao(a2);
        d2.adicionarAlocacao(a3);
        d2.adicionarAlocacao(a4);
        d3.adicionarAlocacao(a5);
        d3.adicionarAlocacao(a6);

        // Exibindo alocações por desenvolvedor
        System.out.println("=== Alocações por Desenvolvedor ===");
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);

        // Adicionando método para exibir alocações por projeto
        System.out.println("\n=== Alocações por Projeto ===");
        System.out.println("Projeto 1: " + p1);
        System.out.println("Projeto 2: " + p2);
        System.out.println("Projeto 3: " + p3);
    }
}
