package classes_metodos.basico;

public class MegaSenaTeste {
    public static void main(String[] args) {
        MegaSena aposta1 = new MegaSena();
        System.out.println(aposta1);

        MegaSena aposta2 = new MegaSena(10, 2, 30, 44, 55, 65);
        System.out.println(aposta2);
    }
}
