package composicao.muitospramuitos;

public class TesteMuitosPraMuitos {
    public static void main(String[] args) {
        Perfil admin = new Perfil(1, "admin");
        Perfil aluno = new Perfil(2, "aluno");

        Usuario usuario1 = new Usuario(1, "João Pedro", "jp@gmail.com");
        Usuario usuario2 = new Usuario(2, "Maria Silva", "ms@gmail.com");

        usuario1.perfis.add(admin);
        usuario1.perfis.add(aluno);

        usuario2.perfis.add(admin);
        usuario2.perfis.add(aluno);

        System.out.println(usuario1);
        System.out.println(usuario2);


    }
}
