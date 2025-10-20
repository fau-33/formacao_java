package classes_metodos.basico;

public class ProdutoTeste {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.id = 1;
        p1.nome = "Notebook";
        p1.preco = 8789.99;
        p1.desconto = 0.25;

        Produto p2 = new Produto();
        p2.id = 2;
        p2.nome = "Caneta";
        p2.preco = 12.99;
        p2.desconto = 0.05;

        System.out.println(p1.nome);
        System.out.println(p2.nome);

        System.out.printf("\n O %s tem o preço final de R$%.2f ", p1.nome,  p1.precoFinal());
        System.out.printf("\n O %s tem o preço final de R$%.2f \n ", p2.nome,  p2.precoFinal());

        System.out.println(p1);


    }
}
