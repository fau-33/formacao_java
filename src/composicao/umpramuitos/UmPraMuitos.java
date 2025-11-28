package composicao.umpramuitos;

@SuppressWarnings("all")
public class UmPraMuitos {
    public static void main(String[] args) {
        Produto produto1 = new Produto(100, "Notebook", 7865.78 );
        ItemPedido itemPedido = new ItemPedido(1,  produto1, 2);

        Produto produto2 = new Produto(310, "Steam Beck", 3900.99);
        ItemPedido itemPedido2 = new ItemPedido(2, produto2, 3);

        Pedido pedido = new Pedido(1);
        pedido.itens.add(itemPedido);
        pedido.itens.add(itemPedido2);

        System.out.println(pedido.itens.get(0).produto.nome);
        System.out.println(pedido.itens.get(1).produto.nome);

        System.out.println(pedido.getValorTotal());

        pedido.itens.clear();

        System.out.println(pedido.itens.size());

    }
}
