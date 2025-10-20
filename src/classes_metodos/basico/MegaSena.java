package classes_metodos.basico;


public class MegaSena {
    // Apenas 6 números (1 a 60)
    final int n1;
    final int n2;
    final int n3;
    final int n4;
    final int n5;
    final int n6;

    MegaSena() {
        n1 = gerarNumeroAleatorio();
        n2 = gerarNumeroAleatorio();
        n3 = gerarNumeroAleatorio();
        n4 = gerarNumeroAleatorio();
        n5 = gerarNumeroAleatorio();
        n6 = gerarNumeroAleatorio();
    }

    public MegaSena(int n1, int n2, int n3, int n4, int n5, int n6) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.n4 = n4;
        this.n5 = n5;
        this.n6 = n6;
    }

    int gerarNumeroAleatorio() {
        return (int) (Math.random() * 60) + 1;

    }

    public String toString() {
        return String.format("%d %d %d %d %d %d", n1, n2, n3, n4, n5, n6);
    }
}
