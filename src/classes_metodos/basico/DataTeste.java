package classes_metodos.basico;

public class DataTeste {
    public static void main(String[] args) {

        Data data = new Data();
        data.dia = 20;
        data.mes = 10;
        data.ano = 2033;

        System.out.println(data.formatar());
        System.out.println(data);
    }
}
