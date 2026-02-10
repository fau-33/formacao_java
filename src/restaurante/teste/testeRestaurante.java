package restaurante.teste;

import restaurante.model.*;

public class testeRestaurante {
  public static void main(String[] args) {
    Pessoa p1 = new Pessoa("Jurema", 62.3);

    Comida c1 = new Arroz(0.200);
    Feijao c2 = new Feijao(0.300);
    Sorvete c3 = new Sorvete(0.600);
    Tapioca c4 = new Tapioca(0.600);

    p1.comer(c1);
    p1.comer(c2);
    p1.comer(c3);
    p1.comer(c4);

    System.out.println(p1.getPeso());
  }
}
