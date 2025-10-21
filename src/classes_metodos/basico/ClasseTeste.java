package classes_metodos.basico;

public class ClasseTeste {
    public static void main(String[] args) {
        Classe c1 = new Classe();
        c1.nome = "Ana";
        Classe.status = 7;
        System.out.println(c1.nome);
        c1.teste();


        Classe c2 = new Classe();
        c2.nome = "Pedro";
        Classe.status = 1;
        System.out.println(c2.nome);
        c2.teste();

        System.out.println(Classe.status);
        Classe.xyz();

    }
}
