package composicao_exercicios.umpramuitos_1;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("all")
public class Cliente {
    private String nome;
    private List<Endereco> enderecos = new ArrayList<>();
    
    public Cliente(String nome) {
        this.nome = nome;
    }

    public void adicionarEndereco(Endereco endereco) {
        this.enderecos.add(endereco);
    }

    public void exibirEnderecosCompletos() {
        System.out.println("--------DADOS DO CLIENTE-----");
        System.out.println("Nome: " + this.nome);
        System.out.println("Endereços: ");
        for (Endereco endereco : this.enderecos) {
            System.out.println(endereco.getLogradouro() + " - " + endereco.getCep() + " - " + endereco.getTipo());
        }

    }
}
