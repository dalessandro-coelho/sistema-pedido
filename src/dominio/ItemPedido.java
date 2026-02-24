package dominio;

public class ItemPedido {
    private Produto produto;
    private int quantidade;

    public ItemPedido(int quantidade, Produto produto) {
        if(quantidade > 0){
            this.quantidade = quantidade;
        } else {
            this.quantidade = 1;
        }
        this.produto = produto;
    }

    public double calcularSubtotal(){
        return produto.getPreco() * quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
