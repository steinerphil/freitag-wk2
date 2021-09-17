package Order;

import Product.Product;

public class Order {

    int id;
    Product product;


    public Order(int id, Product product) {
        this.id = id;
        this.product = product;
    }

}
