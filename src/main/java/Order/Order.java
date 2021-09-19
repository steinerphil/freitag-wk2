package Order;

import Product.Grocery;

public class Order {

    int id;
    Grocery product;


    public Order(int id, Grocery product) {
        this.id = id;
        this.product = product;
    }

}
