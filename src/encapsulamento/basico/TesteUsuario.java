package encapsulamento.basico;

import java.util.UUID;

public class TesteUsuario {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();

        usuario.setNome("Flávio");
        usuario.setEmail("flavio@gmail.com");

        System.out.println(usuario);
        System.out.println(usuario.getId());
        System.out.println(usuario.getNome());
        System.out.println(usuario.getEmail());
    }
}
