package Repo;

import Product.Product;

import java.util.*;


public class ProductRepo {

    private final Map<Integer, String> products;

    public ProductRepo(HashMap<Integer, String> products) {
        this.products = products;
    }

    public void add(Product product) {
        this.products.put(product.getId(), product.getName());
    }

    public String list() {
        StringBuilder mapAsString = new StringBuilder();
        for (Integer key : products.keySet()) {
            mapAsString.append("ID: " + key + " = " + products.get(key) + "\n");
        }
        return mapAsString.toString();
    }

    public String getProduct(int id) {
        //TODO implement exception
        return products.get(id);
    }


}
