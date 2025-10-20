package classes_metodos.basico;

public class Data {
    int dia;
    int mes;
    int ano;

    String formatar() {
        return String.format("%02d/%02d/%04d", dia, mes, ano);
    }

    @Override
    public String toString() {
        return formatar();
    }
}
