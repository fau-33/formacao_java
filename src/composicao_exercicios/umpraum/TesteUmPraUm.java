package composicao_exercicios.umpraum;

public class TesteUmPraUm {
    public static void main(String[] args) {
        Computador c1 = new Computador("Intel Core i5", "Gamer", "Preto");
        c1.montarSistema();

        Computador c2 = new Computador("Intel Core i7", "Normal", "Azul");
        c2.montarSistema();
    }
}
