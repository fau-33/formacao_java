package composicao_exercicios.umpramuitos_1;

public class TesteUmPraMuitos1 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("João Silva");
        Endereco endereco = new Endereco("Rua 1", "12345678", "Casa");
        cliente.adicionarEndereco(endereco);
        cliente.exibirEnderecosCompletos();

        Cliente cliente2 = new Cliente("Maria Silva");
        Endereco endereco2 = new Endereco("Rua 2", "12345678", "Casa");
        cliente2.adicionarEndereco(endereco2);
        cliente2.exibirEnderecosCompletos();
    }
}
