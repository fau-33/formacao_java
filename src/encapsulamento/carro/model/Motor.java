package encapsulamento.carro.model;

class Motor {
    private final double litragem;
    private boolean ligado;

    public Motor(double litragem) {
        this.litragem = litragem;
    }

    void ligado() {
        ligado = true;
    }

    void desligado() {
        ligado = false;
    }

    double getFatorAceleracao() {
        return 0.9 * litragem;
    }

    public double getLitragem() {
        return litragem;
    }

    public boolean isLigado() {
        return ligado;
    }


}
