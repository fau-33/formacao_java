package classes_metodos.basico;

import java.util.Date;

public class Inicializacao {

    int a;
    double b;
    boolean c;
    char d;
    Date e;
    String s;

    void metodoA() {

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(s);

        int f = 0;
        System.out.println(f);
    }

    public static void main(String[] args) {
        Inicializacao init = new Inicializacao();
        init.metodoA();
    }
}
