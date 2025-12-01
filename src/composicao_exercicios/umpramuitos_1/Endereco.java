package composicao_exercicios.umpramuitos_1;

@SuppressWarnings("all")
public class Endereco {
    private String logradouro;
    private String cep;
    private String tipo;

    public Endereco(String logradouro, String cep, String tipo) {
        this.logradouro = logradouro;
        this.cep = cep;
        this.tipo = tipo;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getCep() {
        return cep;
    }

    public String getTipo() {
        return tipo;
    }
}
