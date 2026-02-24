package dominio;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<ItemPedido> itens;

    public Pedido() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(ItemPedido item){
        this.itens.add(item);
    }

    public double calcularTotalPedido(){
        double total = 0;
        for (ItemPedido itemPedido : itens){
            total += itemPedido.calcularSubtotal();
        }
        return total;
    }
}
