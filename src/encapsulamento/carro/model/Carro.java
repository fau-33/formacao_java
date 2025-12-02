package encapsulamento.carro.model;


public class Carro {
    private final Motor motor;
    private final double velocidadeMaxima;
    private double velocidade = 0;

    public Carro() {
        this(1, 180);
    }

    public Carro(double litragem, double velocidadeMaxima) {
        this.motor = new Motor(litragem);
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void ligar() {
        this.motor.ligado();
    }

    public void desligar() {
        this.motor.desligado();
    }

    public void acelerar() {
        if (!motor.isLigado()) {
            return;
        }
        if(velocidade >= velocidadeMaxima) {
            return;
        }

        double incrementoBase = 10;
        double incremento = incrementoBase * motor.getFatorAceleracao();

        double novaVelocidade = velocidade + incremento;
       velocidade = Math.min(novaVelocidade, velocidadeMaxima);
    }

    public void frear() {
        if(velocidade <= 0) {
            return;
        }
        double decremento = 20;
        double novaVelocidade = velocidade - decremento;
        velocidade = Math.max(novaVelocidade, 0);

    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public double getVelocidade() {
        return velocidade;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "velocidadeMaxima=" + velocidadeMaxima +
                ", velocidade=" + velocidade +
                '}';
    }
}
