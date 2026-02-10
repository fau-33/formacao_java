package restaurante.model;

public class Pessoa {
  private final String nome;
  private double peso;

  public Pessoa(String nome, double peso) {
    this.nome = nome;
    this.peso = peso;
  }

  public String getNome() {
    return nome;
  }

  public double getPeso() {
    return peso;
  }

  public void comer(Comida comida) {
    peso += comida.getPeso();
  }

//  public void comer(Arroz arroz) {
//    peso += arroz.getPeso();
//  }
//
//  public void comer(Feijao feijao) {
//    peso += feijao.getPeso();
//  }
//
//  public void comer(Sorvete sorvete) {
//    peso += sorvete.getPeso();
//  }
//
//  public void comer(Tapioca tapioca) {
//    peso += tapioca.getPeso();
//  }
}
