package oo.composicao.challenge;

public class System1 {

  public static void main(String[] args) {
    Costumer costumer = new Costumer("Maria Julia Moraes");

    Purchase purchase1 = new Purchase();
    purchase1.itemADD2("Caneta", 9.67, 100);
    purchase1.itemADD(new Product("Notebook", 1897.88), 2);

    Purchase purchase2 = new Purchase();
    purchase2.itemADD2("Caderno", 10, 10);
    purchase2.itemADD(new Product("Impressora", 998.90), 1);

    costumer.purchases.add(purchase1);
    costumer.purchases.add(purchase2);

    System.out.println(costumer.getTotalValue());
  }
}
