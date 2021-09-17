package Product;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.Map.entry;


public class Product {

    private final Map<Integer, Product> products = new HashMap<>();
    private List<Product> list;
    private String name;
    private int id;

    public Product() {
    }

    public Product(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Product(List<Product> products) {
        this.list = products;
    }

    //getter
    public Map<Integer, Product> getProducts() {
        return products;
    }

    public int getId() {
        return id;
    }

    public List<Product> getList() {
        return list;
    }

    //product initialization //TODO: direct initialization to tidy up main
    public void initProducts() {
        this.list = (List.of(
                new Product("Milk", 10),
                new Product("Oat", 20),
                new Product("Bread", 30),
                new Product("Beer", 40)
        ));
        for (Product product : list) {
            products.put(product.getId(), product);
        }

    }

}
