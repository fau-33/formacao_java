package classes_metodos.basico;

public class MatematicaTeste {
    public static void main(String[] args) {
        var raio = 6.5;


        System.out.println(Matematica.PI * Matematica.potencia(raio, 2));

        System.out.println(Math.PI * Math.pow(raio, 2));
    }
}
