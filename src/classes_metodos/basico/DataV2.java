package classes_metodos.basico;

public class DataV2 {
    int dia = 1;
    int mes = 1;
    int ano = 1970;

    // Construtor padrão = sem parâmetros
    DataV2() {}

    DataV2(int dia) {
        this.dia = dia;
    }

    DataV2(int dia, int mes) {
        this.dia = dia;
        this.mes = mes;
    }

    DataV2 (int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    String formatar() {
        return String.format("%02d/%02d/%04d", dia, mes, ano);
    }

    @Override
    public String toString() {
        return formatar();
    }
}
