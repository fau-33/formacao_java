package composicao_exercicios.umpraum_1;

@SuppressWarnings("all")
public class CartaoDeCredito {
    private String numero;
    private Double limite;

    public CartaoDeCredito(String numero, Double limite) {
        this.numero = numero;
        this.limite = limite;
    }

    public String getNumero() {
        return numero;
    }

    public Double getLimite() {
        return limite;
    }
}
