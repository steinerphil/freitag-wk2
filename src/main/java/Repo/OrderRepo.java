package Repo;

import Order.Order;
import Product.Product;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import Exception.*;

public class OrderRepo {

    Map<Integer, Product> orders = new HashMap<>();

    public OrderRepo(HashMap<Integer, Product> orders) {
        this.orders = orders;
    }

    public OrderRepo() {
    }

    @Override
    public String toString() {
        return "order= " + orders;
    }

    public String getProduct(int orderNumber) throws CanNotFindProduct {
        if(!orders.containsKey(orderNumber)){
           throw new CanNotFindProduct("Error: can not find product to given order-number");
        }
            return "Product to order " + orderNumber + " is " + orders.get(orderNumber).getName();
    }

    public String add(Product productToOrder) {
            int orderNumber = 1;
            orders.put(orderNumber, productToOrder);
            return productToOrder.getName() + " was added. Your order Number: " + orderNumber;
    }

    public String list(){
        String r = "";
        if(orders.size() == 0){
            r= "List is empty";
        }
        StringBuilder mapAsString = new StringBuilder();
        for (Integer key : orders.keySet()) {
             r = mapAsString.append("Order-ID: " + key + " = " + orders.get(key).getName() + "\n").toString();
        }
        return r;
    }

}
