package classe;

public class Produto {

    String name;
    double price;
    static double discount = 0.25;

    Produto(String initialName, double initialPrice) {
        name = initialName;
        price = initialPrice;
    }

    Produto() {

    }
    double precoComDesconto() {
        return price * (1 - discount);
    }

}