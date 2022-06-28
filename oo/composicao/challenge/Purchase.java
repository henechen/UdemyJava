package oo.composicao.challenge;

import java.util.ArrayList;
import java.util.List;

public class Purchase {

    // Added a list of purchased items in purchase class
    final List<Item> items = new ArrayList<>();

    // Method to add a product `p` + it's quantity
    void itemADD(Product p, int quantity)
    {
        this.items.add(new Item(p, quantity));
    }

    // In order to simplify things, we could create another method called "itemADD" as well
    // that instead of passing the product, we pass a String name, double price, int quantity
    // by doing that, besides being able to instance an item, inside of it's function
    // we can instance a product, giving it's name and price.
    void itemADD2(String name, double price, int quantity)
    {
        var product = new Product(name, price);
        this.items.add(new Item(product, quantity));
    }

    // Method getTotalValue
    // this refers to the total of the purchase, not related to costumer's purchase
    // only to the products themselves
    double getTotalValue()
    {
        double total = 0;

        for(Item item: this.items)
        {
            // Will calculate the price * amount and add it's total value to the general total
            total += item.quantity * item.product.price;
        }

        return total;
    }
}
