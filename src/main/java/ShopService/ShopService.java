package ShopService;
import Product.ProductInterface;
import Repo.OrderRepo;
import Repo.ProductRepo;
import Product.Grocery;

import java.util.Arrays;
import java.util.HashMap;

import java.util.Map;

public class ShopService {

    //create order repo and product repo instance
    private final OrderRepo orderRepo = new OrderRepo();
    private final ProductRepo productRepo = new ProductRepo();


    //empty constructor
    public ShopService() {
    }

    public void getProduct(int id){
        try {
            System.out.println(productRepo.getProduct(id).getName());
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

    // add order and build product array from that
    // add th product array to orderRepo
    public void addOrder(int[] productToOrder){
        try {
            ProductInterface[] productsArray = new ProductInterface[productToOrder.length];
            for(int i = 0; i < productToOrder.length; i++){
                productsArray[i] = productRepo.getProduct(productToOrder[i]);
            }
            //sout for display massage from add() method in order repo
            System.out.println(orderRepo.add(productsArray));
            }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void getOrder(int orderNumber){
        try {
            System.out.println("Order " + orderNumber + " contains " + orderRepo.getProductToOrder(orderNumber));
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
