package fundamentos;

import fundamentos.dados.Usuario;

import java.util.Date;

public class ExemploImport {
    public static void main(String[] args) {
        Date data = new Date();
        System.out.println(data);

        Usuario usuario = new Usuario();
        System.out.println(usuario);
    }
}
