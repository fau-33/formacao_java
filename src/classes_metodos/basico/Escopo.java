package classes_metodos.basico;

@SuppressWarnings("all")
public class Escopo {
    int a = 10;

    void metodoA() {
        System.out.println(a);

        int b = 7;
        System.out.println(b);

        if(b > 10) {
            int c = 12;
            System.out.println(b + c);
            System.out.println(c);
        }
        metodoB(b);
    }

    void metodoB(int b) {
        System.out.println(a);
        System.out.println(b);

        {
            int x = 15;
            System.out.println(x);
        }

    }

    public static void main(String[] args) {
        Escopo escopo = new Escopo();
        escopo.metodoA();
    }
}
