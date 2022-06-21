package classe;

public class ProdutoTeste {

  public static void main(String[] args) {

      Produto p1 = new Produto("Notebook", 4356.89);

      var p2 = new Produto();
      p2.name = "Caneta Preta";
      p2.price = 12.56;

      Produto.discount = 0.50;

    System.out.println(p2.name + " " + p2.precoComDesconto());
    System.out.println(p1.name + " " + p1.precoComDesconto());

    double finalPrice1 = p1.precoComDesconto();
    double finalPrice2 = p2.precoComDesconto();
    double cart = (finalPrice1 + finalPrice2) / 2;

    System.out.println(cart);

    System.out.println();
  }
}
