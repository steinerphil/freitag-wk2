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
        try {
            System.out.println(productRepo.getProduct(id));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void listProducts(){
        try {
            System.out.println(productRepo.list());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addOrder(int productToOrder){
        try {
            System.out.println(orderRepo.add(new Product(productToOrder, productRepo.getProduct(productToOrder))));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void getOpenOrder(int orderNumber){
        try {
            System.out.println(orderRepo.getProduct(orderNumber));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void listOrders(){
        try {
            System.out.println(orderRepo.list());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
