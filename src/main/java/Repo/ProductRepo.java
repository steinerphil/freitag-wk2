package Repo;

import java.util.*;
import Exception.*;


public class ProductRepo {

    private final Map<Integer, String> products;

    public ProductRepo(HashMap<Integer, String> products) {
        this.products = products;
    }

    public String list() {
        String r = "";
        if(products.size() == 0){
            r = "Product Repo is empty";
        } else {
            StringBuilder mapAsString = new StringBuilder();
            for (Integer key : products.keySet()) {
                mapAsString.append("ID: " + key + " = " + products.get(key) + "\n");
            }
            r = mapAsString.toString();
        }
        return r;
    }

    public String getProduct(int id) throws CanNotFindProduct {
        if(!products.containsKey(id)){
            throw new CanNotFindProduct("The product does not exist. Product id: " + id);
        }
        return products.get(id);
    }


}
