package classes_metodos.basico;

public class AtribuicaoPorReferencia {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Maria", 29);
        Pessoa p2 = p1;

        p2.nome = "Rebeca Maria";

        System.out.println(p1.nome);
        System.out.println(p2.nome);

        p2 = new Pessoa();
        p2.nome = "Pedro";

        System.out.println(p1.nome);
        System.out.println(p2.nome);

        p1 = p2;
        p1.nome = "Pedro Augusto";

        System.out.println(p1.nome);
        System.out.println(p2.nome);
    }
}
