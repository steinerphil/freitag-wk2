package Repo;
import Product.Product;

import java.util.List;

public class ProductRepo {

    private List<Product> products;

    //Constructor
    public ProductRepo(){
        this.products =
    }
    public ProductRepo(List<Product> products) {this.products = products;}


    //methods
    public List<Product> list() {return products;}

    public Product getProductById(int id){

        return products.get(id);
    }
}
