package heranca.jogo.teste;

import heranca.jogo.model.Heroi;
import heranca.jogo.model.Jogador;
import heranca.jogo.model.Monstro;

public class TesteJogo {
    public static void main(String[] args) {
        Jogador heroi = new Heroi(21, 50);
        Jogador monstro = new Monstro(23, 50);

        boolean ataqueHeroi = heroi.atacar(monstro);
        System.out.println(ataqueHeroi ? heroi.gritar() : "");

        boolean ataqueMonstro = monstro.atacar(heroi);
        System.out.println(ataqueMonstro ? monstro.gritar() : "");

        System.out.println(heroi);
        System.out.println(monstro);
    }
}
