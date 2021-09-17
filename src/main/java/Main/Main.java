package Main;

import Repo.ProductRepo;
import Product.Product;
import java.util.HashMap;

public class Main {


    public static void main(String[] args) {

        //filling the product repo
        ProductRepo productRepo = new ProductRepo(new HashMap<>());
        productRepo.add(new Product(10, "Milk"));
        productRepo.add(new Product(20, "Oat"));
        productRepo.add(new Product(30, "Beer"));
        productRepo.add(new Product(40, "Bread"));



    }


}
