package repeticao;

public class For3 {
    public static void main(String[] args) {
        for (int linha = 1; linha < 10; linha++) {
            for (int coluna = 1; coluna < 10; coluna++) {
                System.out.printf("%dx%d ", linha + 1, coluna + 1);
            }
            System.out.println();
        }
    }
}
