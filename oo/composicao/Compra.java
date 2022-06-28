package oo.composicao;

import java.util.ArrayList;

public class Compra {

    // Essa lista é homogenea, pois só pode adicionado coisas do tipo Item nela
    // relação 1 para N -> 1 cliente pode ter muitas compras, mas 1 compra tem 1 cliente
    String nomeCliente;
    ArrayList<Item> itens = new ArrayList<>();

    void adicionarItem(Item item)
    {
        itens.add(item);
        item.compra = this;
    }

    

    double obterValorTotal()
    {
        double total = 0;
        for(Item item: itens)
        {
            total += item.quantidade * item.preco;
        }
        return total;
    }
}
