package composicao_exercicios.umpraum;

@SuppressWarnings("all")
public class Gabinete {
    private String modelo;
    private String cor;

    public Gabinete(String modelo, String cor) {
        this.modelo = modelo;
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "Gabinete{" +
                "modelo='" + modelo + '\'' +
                ", cor='" + cor + '\'' +
                '}';
    }
}
