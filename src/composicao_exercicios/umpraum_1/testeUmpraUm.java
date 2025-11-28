package composicao_exercicios.umpraum_1;

public class testeUmpraUm {
    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria("João", 1000.0, "123456789", 1000.0);
        c1.exibirStatusConta();

        ContaBancaria c2 = new ContaBancaria("Maria", 2000.0, "987654321", 2000.0);
        c2.exibirStatusConta();

    }
}
