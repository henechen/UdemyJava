package oo.composicao.challenge;

import java.util.ArrayList;
import java.util.List;

public class Costumer {

    // Costumer has a name.
    // since it won't be necessary to change costumer's name, we can declare the
    // String name as a constant
    final String name;
    final List<Purchase> purchases = new ArrayList<>();

    // Costumer constructor that will receive a name
    Costumer(String name)
    {
        this.name = name;
    }

    // Same method as in purchase, getTotalValue() will get the total value of the purchase
    // but, this getTotalValue() is associated to the costumers' whole purchase

    double getTotalValue()
    {
        double total = 0;

        // for loop related to the collection/array on line 8
        for(Purchase purchase: purchases)
        {
            total += purchase.getTotalValue();
        }

        return total;
    }
}
