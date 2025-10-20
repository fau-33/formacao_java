package classes_metodos.basico;

public class DataV2Teste {
    public static void main(String[] args) {
        DataV2 d1 = new DataV2(21, 2, 2020);
        System.out.println(d1);

        DataV2 d2 = new DataV2();
        d2.dia = 28;
        d2.mes = 12;
        d2.ano = 2033;
        System.out.println(d2);

        DataV2 d3 = new DataV2(25);
        System.out.println(d3);

        DataV2 d4 = new DataV2(25, 12);
        System.out.println(d4);
    }
}
