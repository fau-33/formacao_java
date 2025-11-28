package composicao_exercicios.umpraum_1;

@SuppressWarnings("all")
public class ContaBancaria {
    private String titular;
    private Double saldo;
    private CartaoDeCredito cartaoDeCredito;

    public ContaBancaria(String titular, Double saldo, String numero, Double limite) {
        this.titular = titular;
        this.saldo = saldo;
        this.cartaoDeCredito = new CartaoDeCredito(numero, limite);
    }

    public void exibirStatusConta() {
        System.out.println("--------- STATUS DA CONTA ---------");
        System.out.println("Titular: " + this.titular);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Cartão de Crédito: " + cartaoDeCredito.getNumero());
        System.out.println("Limite: " + cartaoDeCredito.getLimite());
        System.out.println("-----------------------------------");
    }
}
