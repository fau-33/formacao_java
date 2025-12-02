package encapsulamento.carro.teste;

import encapsulamento.carro.model.Carro;

public class TesteCarro {
    public static void main(String[] args) {
        Carro carro = new Carro(5, 240);
        carro.ligar();

        carro.acelerar();
        carro.acelerar();
        carro.acelerar();
        carro.acelerar();

        System.out.println(carro);

        carro.frear();
        carro.frear();
        carro.frear();
        carro.frear();
        carro.frear();

        System.out.println(carro);


    }
}
