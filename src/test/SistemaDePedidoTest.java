package test;

import dominio.ItemPedido;
import dominio.Pedido;
import dominio.Produto;

public class SistemaDePedidoTest {
    static void main() {
        Produto produto1 = new Produto("Notebook", 3500);
        Produto produto2 = new Produto("Mouse", 100);

        ItemPedido itemPedido1 = new ItemPedido(2, produto1);
        ItemPedido itemPedido2 = new ItemPedido(3, produto2);

        Pedido pedido = new Pedido();
        pedido.adicionarItem(itemPedido1);
        pedido.adicionarItem(itemPedido2);

        System.out.println(pedido.calcularTotalPedido());
    }
}
