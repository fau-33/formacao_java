package composicao.umparaum;

public class TesteUmPraUm {
    public static void main(String[] args) {
        Senha senha = new Senha(1, "#Senha1234");
        Usuario usuario = new Usuario(1, "flavio", "flavio@email.com", senha);
        System.out.println(usuario.senha.valor);
    }
}
