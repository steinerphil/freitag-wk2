package ShopService;
import Main.*;
import Repo.OrderRepo;
import Repo.ProductRepo;
import Repo.OrderRepo;
import Repo.ProductRepo;
import Product.Product;
import java.util.HashMap;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShopService {

    //create and filling the product repo field
    ProductRepo productRepo = new ProductRepo(new HashMap<>(Map.ofEntries(
            Map.entry(10, "Milk"),
            Map.entry(20, "Oat"),
            Map.entry(30, "Beer"),
            Map.entry(40, "Bread")
    )));

    //create order repo field
    OrderRepo orderRepo = new OrderRepo();

    //create empty constructor
    public ShopService() {
    }

    public void getProduct(int id){
        System.out.println(productRepo.getProduct(id));
    }

    public void listProducts(){
        System.out.println(productRepo.list());
    }

    public void addOrder(int productToOrder){

        System.out.println(orderRepo.add(new Product(productToOrder, productRepo.getProduct(productToOrder))));
    }

    public void getOpenOrder(int orderNumber){
        System.out.println(orderRepo.getProduct(orderNumber));
    }

    public void listOrders(){
        System.out.println(orderRepo.list());
    }

}
