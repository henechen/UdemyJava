package oo.composicao.challenge;

public class Item {

    final Product product;
    final int quantity;

    // Product will have a construtor that receives a product as a parameter and a quantity as well
    Item(Product product, int quantity)
    {
        this.product = product;
        this.quantity = quantity;
    }
}