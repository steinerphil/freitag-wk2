package Repo;

import Order.Order;
import Product.Product;

import java.util.*;

import Exception.*;

public class OrderRepo {

    Map<Integer, Product[]> orders = new HashMap<>();
    private int orderNumber = 0;

    public OrderRepo(HashMap<Integer, Product[]> orders) {
        this.orders = orders;
    }

    public OrderRepo() {
    }

    @Override
    public String toString() {
        return "order= " + orders;
    }

    public String getProduct(int orderNumber) throws CanNotFindProduct {
        if (!orders.containsKey(orderNumber)) {
            throw new CanNotFindProduct("Error: can not find product to given order-number: " + orderNumber);
        }
        return "Product(s) to order " + orderNumber + " is/are " + Arrays.toString(orders.get(orderNumber));
    }

    public String add(Product[] productToOrder) {
        StringBuilder r = new StringBuilder();
        orderNumber++;
        orders.put(orderNumber, productToOrder);
        for (Product p : productToOrder
        ) {
            r.append((p.getName())).append(", ");
        }
        r.append("was added. Your order Number: " + orderNumber);
        return r.toString();
    }

    public String list() {
        Product[] t;
        StringBuilder r = new StringBuilder("");
        if (orders.size() == 0) {
            r = new StringBuilder("List is empty");
        } else {
            StringBuilder mapAsString = new StringBuilder();
            for (Integer key : orders.keySet()) {
                r = mapAsString.append("Order-ID: " + key + " = ");
                t = orders.get(key);
                for (Product pr: t
                ) {
                    r.append(pr.getName()).append(", ");
                }
                r.append("\n");
            }
        }
        return r.toString();
    }

}
