package composicao.umpramuitos;

public class ItemPedido {
    int id;
    int quantidade;
    double preco;
    Produto produto;

    public ItemPedido(int id, Produto produto) {
        this.id = id;
        this.quantidade = 1;
        this.produto = produto;
    }

    public ItemPedido(int id , Produto produto, int quantidade) {
        this.id = id;
        this.produto = produto;
        this.preco = produto.preco;
        this.quantidade = quantidade;
    }

    public ItemPedido(int id, int quantidade, double preco, Produto produto) {
        this.id = id;
        this.quantidade = quantidade;
        this.preco = preco;
        this.produto = produto;
    }

    public double getValorTotal() {
        return this.preco * this.quantidade;
    }
}
