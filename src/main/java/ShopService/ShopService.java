package ShopService;

import Product.ProductInterface;
import Repo.OrderRepo;
import Repo.ProductRepo;
import Product.Grocery;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

import java.util.Map;
import java.util.Scanner;

public class ShopService {

    //create order repo and product repo instance
    private final OrderRepo orderRepo = new OrderRepo();
    private final ProductRepo productRepo = new ProductRepo();
    private Scanner scanner = new Scanner(System.in);


    //empty constructor
    public ShopService() {
    }

    //start shop session
    public void enterShop() {
        printActions();
        boolean quit = false;

        while (!quit) {

            System.out.println("What you want to do? ");
            int key = scanner.nextInt();

            switch (key) {
                case 1 -> listProducts();
                case 2 -> {
                    System.out.println("Which product id?");
                    //scanner.hasNext();
                    int id = scanner.nextInt();
                    getProduct(id);
                }
                case 3 -> {
                    System.out.println("choose products, id's required (separate with comma) : ");
                    String arr = scanner.next();
                    String[] items = arr.split(",");
                    int[] results = new int[items.length];
                    for (int i = 0; i < items.length; i++) {
                        try {
                            results[i] = Integer.parseInt(items[i]);
                        } catch (NumberFormatException e) {
                            System.out.println("Wrong format, please type your ids like this: 1,2,3");
                        }
                    }
                    addOrder(results);
                }
                case 4 -> {
                    System.out.println("Which order you want to review?");
                    int orderId = scanner.nextInt();
                    getOrder(orderId);
                }
                case 5 -> listOrders();
                case 6 -> printActions();
                case 9 -> quit = true;
            }

        }
    }

    public void getProduct(int id) {
        try {
            System.out.println(productRepo.getProduct(id).getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void listProducts() {
        try {
            System.out.println(productRepo.list());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // add order and build product array from that
    // add th product array to orderRepo
    public void addOrder(int[] productToOrder) {
        try {
            ProductInterface[] productsArray = new ProductInterface[productToOrder.length];
            for (int i = 0; i < productToOrder.length; i++) {
                productsArray[i] = productRepo.getProduct(productToOrder[i]);
            }
            //sout for display massage from add() method in order repo
            System.out.println(orderRepo.add(productsArray));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void getOrder(int orderNumber) {
        try {
            System.out.println("Order " + orderNumber + " contains " + orderRepo.getProductToOrder(orderNumber));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void listOrders() {
        try {
            System.out.println(orderRepo.list());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void printActions() {
        System.out.println("Choose between actions: ");
        System.out.println("1: List all products");
        System.out.println("2: Get a product by id");
        System.out.println("3: Make new order");
        System.out.println("4: Get order by id");
        System.out.println("5: List all orders");
        System.out.println("6: Print actions");
        System.out.println("9: Exit shop (Quit program)");
    }

}
