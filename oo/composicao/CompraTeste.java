package oo.composicao;

public class CompraTeste {

    public static void main(String[] args) {

        Compra compra1 = new Compra();
        compra1.nomeCliente = "Taras";
        compra1.adicionarItem(new Item("Placa de vídeo", 20, 7.45));
        compra1.adicionarItem(new Item("Processador", 12, 3.89));
        compra1.itens.add(new Item("Placa-mãe", 3, 18.79));

        System.out.println(compra1.itens.size());
        System.out.println(compra1.obterValorTotal());
    }
}
